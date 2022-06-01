package com.techelevator.farm;

public class Tractor implements Singable, Rideable{
    private String name;
    private String sound;

    public Tractor() {
        this.name = "Tractor";
        this.sound = "Vroom!";
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }
    public void mount() {
        System.out.println("Hop up on the " + getName());
    }

    public void dismount() {
        System.out.println("Hop up off of that " + getName());
    }


}
