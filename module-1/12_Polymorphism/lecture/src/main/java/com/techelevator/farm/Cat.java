package com.techelevator.farm;

public final class Cat extends FarmAnimal{
    public Cat() {
        super("Cat", "Meow!");
    }

//cant override method since we changed it to final
//    @Override
//    public String getSound() {
//        if(isSleeping()) {
//            return "purrr..";
//        }
//        else {
//            return getSound();
//        }
//    }

}
