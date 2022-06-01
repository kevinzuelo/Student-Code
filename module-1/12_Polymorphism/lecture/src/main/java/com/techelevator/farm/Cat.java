package com.techelevator.farm;

public class Cat extends FarmAnimal{
    public Cat() {
        super("Cat", "Meow!");
    }

    @Override
    public String getSound() {
        if(isSleeping()) {
            return "purrr..";
        }
        else {
            return getSound();
        }
    }
}
