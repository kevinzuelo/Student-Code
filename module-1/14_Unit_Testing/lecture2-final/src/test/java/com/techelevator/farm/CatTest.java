package com.techelevator.farm;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatTest {

    @Test
    public void test_constructor() {
        // Arrange

        Cat tasha = new Cat();

        // Act
        String name = tasha.getName();
        String sound = tasha.getSound();

        // Assert
        Assert.assertEquals("Cat", name);
        Assert.assertEquals("meow!", sound);
    }

    @Test
    public void when_sleeping_eat_method_returns_different_result() {
        // Arrange

        Cat tasha = new Cat();
        tasha.setIsSleeping(true);

        // Act
        String actual = tasha.eat();

        // Assert
        Assert.assertEquals("Ignores cat food...", actual);
    }

    @Test
    public void when_not_sleeping_eat_method_returns_one_result() {
        // Arrange

        Cat tasha = new Cat();
        tasha.setIsSleeping(false);

        // Act
        String actual = tasha.eat();

        // Assert
        Assert.assertEquals("Eat cat food...", actual);
    }

    @Test
    public void eat_method_returns_different_results_when_sleeping() {
        // Arrange

        Cat tasha = new Cat();

        // Act

        // Assert
        Assert.assertEquals("Eat cat food...", tasha.eat());
        tasha.setIsSleeping(true);
        Assert.assertEquals("Ignores cat food...", tasha.eat());


    }


}
