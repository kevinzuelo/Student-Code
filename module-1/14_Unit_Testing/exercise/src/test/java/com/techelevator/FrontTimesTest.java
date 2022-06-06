package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FrontTimesTest {
    FrontTimes frontTimes;

    @Before
    public void setUp() {
        frontTimes = new FrontTimes();
    }

    @Test
    public void generates_string_correctly() {
        //Act
        String actual = frontTimes.generateString("Chocolate", 3);

        //Assert
        Assert.assertEquals("ChoChoCho", actual);
    }

    @Test
    public void empty_string() {
        //Act
        String actual = frontTimes.generateString("", 4);

        //Assert
        Assert.assertEquals("", actual);
    }

    @Test
    public void when_number_is_zero_returns_empty_string() {
        //Act
        String actual = frontTimes.generateString("Chocolate", 0);

        //Assert
        Assert.assertEquals("", actual);
    }

    @Test
    public void when_passed_string_is_three_char_long() {
        //Act
        String actual = frontTimes.generateString("Cho", 3);

        //Assert
        Assert.assertEquals("ChoChoCho", actual);
    }

    @Test
    public void when_passed_string_is_two_char_long() {
        //Act
        String actual = frontTimes.generateString("Ch", 3);

        //Assert
        Assert.assertEquals("ChChCh", actual);
    }

    @Test
    public void when_passed_string_is_one_char() {
        //Act
        String actual = frontTimes.generateString("C", 3);

        //Assert
        Assert.assertEquals("CCC", actual);
    }
}
