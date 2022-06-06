package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringBitsTest {
    StringBits stringBits;

    @Before
    public void setUp() {
        stringBits = new StringBits();
    }

    @Test
    public void returns_string_of_every_other_characters() {
        //Act
        String actual = stringBits.getBits("Hello");
        //Assert
        Assert.assertEquals("Hlo", actual);
    }

    @Test
    public void only_two_characters() {
        //Act
        String actual = stringBits.getBits("Hi");
        //Assert
        Assert.assertEquals("H", actual);
    }

    @Test
    public void only_one_character() {
        //Act
        String actual = stringBits.getBits("H");
        //Assert
        Assert.assertEquals("H", actual);
    }

    @Test
    public void blank_string() {
        //Act
        String actual = stringBits.getBits("");
        //Assert
        Assert.assertEquals("", actual);
    }

    @Test
    public void null_string() {
        //Act
        String actual = stringBits.getBits(null);
        //Assert
        Assert.assertEquals("", actual);
    }
}