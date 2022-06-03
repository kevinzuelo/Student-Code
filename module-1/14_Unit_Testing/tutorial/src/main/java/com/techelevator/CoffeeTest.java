package com.techelevator;

import org.junit.jupiter.api.Test;
import org.testng.Assert;


public class CoffeeTest {
    @Test
    public void constructor_should_set_properties() {
        //arrange

        //act
        Coffee coffee = new Coffee("Large", "Decaf", new String[]{"cream", "sugar"}, 2.99);

        //assert
        Assert.assertEquals("Large", coffee.getSize());
        Assert.assertEquals("Decaf", coffee.getBlend());
        Assert.assertEquals(2.99, coffee.getPrice(), 0.00);
        Assert.assertEquals(2, coffee.getAdditions().length);
    }
}
