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
    public void different_eat_result_when_sleeping() {
        // Arrange
        Cat tasha = new Cat();
        tasha.isSleeping = true;

        // Act
        String actual = "Ignores cat food...";


        // Assert
        Assert.assertEquals(tasha.eat(), actual);

    }

    @Test
    public void different_eat_result_when_not_sleeping() {
        // Arrange
        Cat tasha = new Cat();
        tasha.isSleeping = false;

        // Act
        String actual = "Eat cat food...";


        // Assert
        Assert.assertEquals(tasha.eat(), actual);

    }
}
