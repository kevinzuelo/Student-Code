package com.techelevator;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class CityLister {

    public static void main(String[] args) {
        // DataSource
        BasicDataSource usaDataSource = new BasicDataSource();
        usaDataSource.setUrl("jdbc:postgresql://localhost:5432/UnitedStates");
        usaDataSource.setUsername("postgres");
        usaDataSource.setPassword("postgres1");

        // Get some city data using SQL query and reading results through JDBC
        JdbcTemplate jdbcTemplate = new JdbcTemplate(usaDataSource);

        //Cities in Ohio with population over 100000

        String sqlQuery = "SELECT city_name, population FROM city WHERE state_abbreviation = 'OH' AND population > 100000";
        SqlRowSet cities = jdbcTemplate.queryForRowSet(sqlQuery);

        while (cities.next()) {
            String cityName = cities.getString("city_name");
            int population = cities.getInt("population");
        }
    }
}
