package com.techelevator.farm;

public class Sheep extends FarmAnimal implements Rideable{
    public Sheep (){
        super("Sheep", "Ba!");
    }

    public void shear() {
        System.out.println("The Sheep has been Sheared! " + getSound() + " " + getSound());
    }

    @Override
    public String eat() {
        return "Eating whatever sheep eat";
    }
}
