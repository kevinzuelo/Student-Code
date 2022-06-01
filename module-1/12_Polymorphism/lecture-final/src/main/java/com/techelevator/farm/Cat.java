package com.techelevator.farm;

public class Cat extends FarmAnimal {

    public Cat() {
        super("Cat", "meow!");
    }

    @Override
    public String getSound() {
        if (getIsSleeping()) {
            return "purrr!";
        }
        else {
            return getSound();
        }
    }


}
