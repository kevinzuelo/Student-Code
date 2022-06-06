package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalGroupNameTest {
    AnimalGroupName testGroup;

    @Before
    public void setUp() {
        testGroup = new AnimalGroupName();
    }

    @Test
    public void gets_correct_value() {
        //Act
        String actual = testGroup.getHerd("rhino");

        //Assert
        Assert.assertEquals("Crash", actual);
    }

    @Test
    public void ignores_string_case() {
        //Act
        String actual = testGroup.getHerd("RhInO");

        //Assert
        Assert.assertEquals("Crash", actual);
    }

    @Test
    public void value_not_on_map_returns_unknown() {
        //Act
        String actual = testGroup.getHerd("Unicorn");

        //Assert
        Assert.assertEquals("unknown", actual);
    }

    @Test
    public void passed_empty_string_returns_unknown() {
        //Act
        String actual = testGroup.getHerd("");

        //Assert
        Assert.assertEquals("unknown", actual);
    }
}
