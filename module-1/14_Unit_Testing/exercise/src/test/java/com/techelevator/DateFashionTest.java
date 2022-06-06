package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateFashionTest {
    DateFashion dateFashion;

    @Before
    public void setUp() {
        dateFashion = new DateFashion();
    }

    @Test
    public void both_really_fashionable() {
        //Act
        int actual = dateFashion.getATable(10,10);
        //Assert
        Assert.assertEquals(2, actual);
    }

    @Test
    public void date_is_really_fashionable() {
        //Act
        int actual = dateFashion.getATable(5,10);
        //Assert
        Assert.assertEquals(2, actual);
    }

    @Test
    public void both_semi_fashionable() {
        //Act
        int actual = dateFashion.getATable(5,5);
        //Assert
        Assert.assertEquals(1, actual);
    }

    @Test
    public void both_terribly_dressed() {
        //Act
        int actual = dateFashion.getATable(2,2);
        //Assert
        Assert.assertEquals(0, actual);
    }

    @Test
    public void both_eights() {
        //Act
        int actual = dateFashion.getATable(8,8);
        //Assert
        Assert.assertEquals(2, actual);
    }

    @Test
    public void one_is_terribly_dressed() {
        //Act
        int actual = dateFashion.getATable(8,2);
        //Assert
        Assert.assertEquals(0, actual);
    }
}
