package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Lucky13Test {
    Lucky13 lucky13;

    @Before
    public void setUp(){ lucky13 = new Lucky13(); }

    @Test
    public void array_is_empty(){
        //Arrange
        int[] emptyArray = new int[]{};

        //Act
        boolean actual = lucky13.getLucky(emptyArray);

        //Assert
        Assert.assertTrue(actual);
    }

    @Test
    public void array_has_a_3(){
        //Arrange
        int[] emptyArray = new int[]{2,5,3};

        //Act
        boolean actual = lucky13.getLucky(emptyArray);

        //Assert
        Assert.assertFalse(actual);
    }

    @Test
    public void array_has_a_1(){
        //Arrange
        int[] emptyArray = new int[]{2,5,1};

        //Act
        boolean actual = lucky13.getLucky(emptyArray);

        //Assert
        Assert.assertFalse(actual);
    }

    @Test
    public void array_has_no_3_or_1(){
        //Arrange
        int[] emptyArray = new int[]{2,6,15};

        //Act
        boolean actual = lucky13.getLucky(emptyArray);

        //Assert
        Assert.assertTrue(actual);
    }
}
