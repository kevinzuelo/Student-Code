package com.techelevator.farm;

public class Sheep extends FarmAnimal implements Ridable {

    public Sheep() {
        super("Sheep", "baa!");
    }

    public void shear() {
        System.out.println("Sheep is sheared, " + getSound());
    }

}
