package com.techelevator.farm;

import java.util.Locale;

public abstract class FarmAnimal implements Singable{
	private String name;
	private String sound;
	private boolean isSleeping;

	public FarmAnimal(String name, String sound) {
		this.name = getClass().getSimpleName();
		this.sound = sound;
		isSleeping = false;
	}

	public String getName() {
		return name;
	}

	public final String getSound() {
		if(!isSleeping){
			return sound;
		}
		return "Zzzzzzzz";
	}

	public boolean isSleeping() {
		return isSleeping;
	}

	public void setSleeping(boolean sleeping) {
		this.isSleeping = sleeping;
	}

	public String eat() {
		return "Eating " + name.toLowerCase() + " food";
	}

	public void mount() {
		System.out.println("Hop up on the " + getName());
	}

	public void dismount() {
		System.out.println("Hop up off of that " + getName());
	}
}