package com.techelevator.farm;

public class Tractor implements Singable, Ridable {
    private String name;
    private String sound;

    public Tractor() {
        this.name = "Tractor";
        this.sound = "vroom!";
    }


    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public void mount() {
        System.out.println("Get on the tractor!");
    }

    public void dismount() {
        System.out.println("Climb down off the tractor!");
    }


}
