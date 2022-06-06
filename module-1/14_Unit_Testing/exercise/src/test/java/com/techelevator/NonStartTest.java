package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NonStartTest {
    NonStart nonStart;

    @Before
    public void setUp() {
        nonStart = new NonStart();
    }

    @Test
    public void returns_string_correctly() {
        //Act
        String actual = nonStart.getPartialString("Hello","There");

        //Assert
        Assert.assertEquals("ellohere", actual);
    }

    @Test
    public void passing_null_strings_returns_blank_string() {
        //Act
        String actual = nonStart.getPartialString(null, null);

        //Assert
        Assert.assertEquals("", actual);
    }

    @Test
    public void passing_blank_strings_returns_blank_string() {
        //Act
        String actual = nonStart.getPartialString("", "");

        //Assert
        Assert.assertEquals("", actual);
    }
}
