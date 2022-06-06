package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SameFirstLastTest {
    SameFirstLast sameFirstLast;

    @Before
    public void setUp() {
        sameFirstLast = new SameFirstLast();
    }

    @Test
    public void array_is_length_1() {
        //Arrange
        int[] nums = new int[]{1};
        //Assert
        Assert.assertTrue(sameFirstLast.isItTheSame(nums));
    }

    @Test
    public void array_is_empty_returns_false() {
        //Arrange
        int[] nums = new int[]{};
        //Assert
        Assert.assertFalse(sameFirstLast.isItTheSame(nums));
    }

    @Test
    public void first_and_last_are_equal() {
        //Arrange
        int[] nums = new int[]{5,1,20,9,11,5};
        //Assert
        Assert.assertTrue(sameFirstLast.isItTheSame(nums));
    }

    @Test
    public void first_and_last_are_not_equal() {
        //Arrange
        int[] nums = new int[]{4,20,54,8};
        //Assert
        Assert.assertFalse(sameFirstLast.isItTheSame(nums));
    }
}
