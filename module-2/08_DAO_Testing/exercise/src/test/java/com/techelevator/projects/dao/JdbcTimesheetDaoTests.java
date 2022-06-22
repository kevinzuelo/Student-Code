package com.techelevator.projects.dao;

import com.techelevator.projects.model.Timesheet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Time;
import java.time.LocalDate;
import java.util.List;

public class JdbcTimesheetDaoTests extends BaseDaoTests {

    private static final Timesheet TIMESHEET_1 = new Timesheet(1, 1, 1,
            LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 1");
    private static final Timesheet TIMESHEET_2 = new Timesheet(2, 1, 1,
            LocalDate.parse("2021-01-02"), 1.5, true, "Timesheet 2");
    private static final Timesheet TIMESHEET_3 = new Timesheet(3, 2, 1,
            LocalDate.parse("2021-01-01"), 0.25, true, "Timesheet 3");
    private static final Timesheet TIMESHEET_4 = new Timesheet(4, 2, 2,
            LocalDate.parse("2021-02-01"), 2.0, false, "Timesheet 4");
    
    private JdbcTimesheetDao sut;


    @Before
    public void setup() {
        sut = new JdbcTimesheetDao(dataSource);
    }
    Timesheet testTimesheet = new Timesheet(0, 2, 1,
            LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 9");

    @Test
    public void getTimesheet_returns_correct_timesheet_for_id() {
        Timesheet timesheet = sut.getTimesheet(1);
        assertTimesheetsMatch(TIMESHEET_1, timesheet);

        timesheet = sut.getTimesheet(2);
        assertTimesheetsMatch(TIMESHEET_2, timesheet);
    }

    @Test
    public void getTimesheet_returns_null_when_id_not_found() {
        Timesheet timesheet = sut.getTimesheet(99);
        Assert.assertNull(timesheet);
    }

    @Test
    public void getTimesheetsByEmployeeId_returns_list_of_all_timesheets_for_employee() {
        List<Timesheet> sheets = sut.getTimesheetsByEmployeeId(1);
        Assert.assertEquals(2, sheets.size());
        assertTimesheetsMatch(TIMESHEET_1, sheets.get(0));
        assertTimesheetsMatch(TIMESHEET_2, sheets.get(1));

        sheets = sut.getTimesheetsByEmployeeId(2);
        Assert.assertEquals(2, sheets.size());
        assertTimesheetsMatch(TIMESHEET_3, sheets.get(0));
        assertTimesheetsMatch(TIMESHEET_4, sheets.get(1));
    }

    @Test
    public void getTimesheetsByProjectId_returns_list_of_all_timesheets_for_project() {
        List<Timesheet> sheets = sut.getTimesheetsByProjectId(1);
        Assert.assertEquals(3, sheets.size());
        assertTimesheetsMatch(TIMESHEET_1, sheets.get(0));
        assertTimesheetsMatch(TIMESHEET_2, sheets.get(1));
        assertTimesheetsMatch(TIMESHEET_3, sheets.get(2));

        sheets = sut.getTimesheetsByProjectId(2);
        Assert.assertEquals(1, sheets.size());
        assertTimesheetsMatch(TIMESHEET_4, sheets.get(0));
    }

    @Test
    public void createTimesheet_returns_timesheet_with_id_and_expected_values() {
        Timesheet createdTimesheet = sut.createTimesheet(testTimesheet);
        Integer newId = createdTimesheet.getTimesheetId();
        Assert.assertTrue(newId > 0);
        testTimesheet.setTimesheetId(newId);

        assertTimesheetsMatch(testTimesheet, createdTimesheet);
    }

    @Test
    public void created_timesheet_has_expected_values_when_retrieved() {
        Timesheet createdTimesheet = sut.createTimesheet(testTimesheet);
        Integer newId = createdTimesheet.getTimesheetId();
        Timesheet retrievedSheet = sut.getTimesheet(newId);

        assertTimesheetsMatch(createdTimesheet, retrievedSheet);
    }

    @Test
    public void updated_timesheet_has_expected_values_when_retrieved() {
        Timesheet cityToUpdate = sut.getTimesheet(1);

        cityToUpdate.setDescription("Updated");
        cityToUpdate.setProjectId(2);
        cityToUpdate.setBillable(false);

        sut.updateTimesheet(cityToUpdate);

        Timesheet retrievedCity = sut.getTimesheet(1);
        assertTimesheetsMatch(retrievedCity, cityToUpdate);
    }

    @Test
    public void deleted_timesheet_cant_be_retrieved() {
        sut.deleteTimesheet(4);

        Timesheet retrievedSheet = sut.getTimesheet(4);
        Assert.assertNull(retrievedSheet);

        List<Timesheet> sheets = sut.getTimesheetsByProjectId(2);
        Assert.assertEquals(0, sheets.size());
    }

    @Test
    public void getBillableHours_returns_correct_total() {
        double billable = sut.getBillableHours(1,1);
        double result = TIMESHEET_1.getHoursWorked() + TIMESHEET_2.getHoursWorked();

         Assert.assertEquals(result, billable, .001);

        billable = sut.getBillableHours(2,2);
        Assert.assertEquals(0, billable, .001);

    }

    private void assertTimesheetsMatch(Timesheet expected, Timesheet actual) {
        Assert.assertEquals(expected.getTimesheetId(), actual.getTimesheetId());
        Assert.assertEquals(expected.getEmployeeId(), actual.getEmployeeId());
        Assert.assertEquals(expected.getProjectId(), actual.getProjectId());
        Assert.assertEquals(expected.getDateWorked(), actual.getDateWorked());
        Assert.assertEquals(expected.getHoursWorked(), actual.getHoursWorked(), 0.001);
        Assert.assertEquals(expected.isBillable(), actual.isBillable());
        Assert.assertEquals(expected.getDescription(), actual.getDescription());
    }

}
