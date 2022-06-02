package com.techelevator.farm;

public final class Cat extends FarmAnimal {

    public Cat() {
        super("Cat", "meow!");
    }

    @Override
    public String eat() {
        if (isSleeping) {
            return "Ignores cat food...";
        }
        else {
            return "Eat cat food...";
        }
    }


//    @Override
//    public String getSound() {
//        if (getIsSleeping()) {
//            return "purrr!";
//        }
//        else {
//            return getSound();
//        }
//    }


}
