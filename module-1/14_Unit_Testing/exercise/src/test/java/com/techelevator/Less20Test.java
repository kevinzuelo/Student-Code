package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Less20Test {
    Less20 less20;

    @Before
    public void setUp() {
        less20 = new Less20();
    }

    @Test
    public void passed_int_is_not_zero(){
        //Assert
        Assert.assertFalse(less20.isLessThanMultipleOf20(0));
    }

    @Test
    public void test_two_less_than_multiple_of_20(){
        //Assert
        Assert.assertTrue(less20.isLessThanMultipleOf20(18));
    }

    @Test
    public void test_one_less_than_multiple_of_20(){
        //Assert
        Assert.assertTrue(less20.isLessThanMultipleOf20(19));
    }

    @Test
    public void test_for_multiple_of_20(){
        //Assert
        Assert.assertFalse(less20.isLessThanMultipleOf20(20));
    }

    @Test
    public void test_three_less_than_multiple_of_20(){
        //Assert
        Assert.assertFalse(less20.isLessThanMultipleOf20(17));
    }

    @Test
    public void test_one_more_than_multiple_of_20(){
        //Assert
        Assert.assertFalse(less20.isLessThanMultipleOf20(21));
    }
}
