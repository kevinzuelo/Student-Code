package com.techelevator;

import com.techelevator.Lucky13;
import com.techelevator.MaxEnd3;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxEnd3Test {
    MaxEnd3 maxEnd3;

    @Before
    public void setUp(){ maxEnd3 = new MaxEnd3(); }

    @Test
    public void returns_array_of_first(){
        //Arrange
        int[] emptyArray = new int[]{10,5,6};
        int[] arrayOfTens = new int[]{10,10,10};

        //Act
        int[] actual = maxEnd3.makeArray(emptyArray);

        //Assert
        Assert.assertArrayEquals(arrayOfTens, actual);
    }

    @Test
    public void returns_array_of_last(){
        //Arrange
        int[] emptyArray = new int[]{10,5,20};
        int[] arrayOfTwentys = new int[]{20,20,20};

        //Act
        int[] actual = maxEnd3.makeArray(emptyArray);

        //Assert
        Assert.assertArrayEquals(arrayOfTwentys, actual);
    }

    @Test
    public void largest_int_is_not_first_or_last(){
        //Arrange
        int[] emptyArray = new int[]{10,100,20};
        int[] arrayOfTwentys = new int[]{20,20,20};

        //Act
        int[] actual = maxEnd3.makeArray(emptyArray);

        //Assert
        Assert.assertArrayEquals(arrayOfTwentys, actual);
    }

    @Test
    public void first_and_last_are_same(){
        //Arrange
        int[] emptyArray = new int[]{10,100,10};
        int[] arrayOfTens = new int[]{10,10,10};

        //Act
        int[] actual = maxEnd3.makeArray(emptyArray);

        //Assert
        Assert.assertArrayEquals(arrayOfTens, actual);
    }
}
