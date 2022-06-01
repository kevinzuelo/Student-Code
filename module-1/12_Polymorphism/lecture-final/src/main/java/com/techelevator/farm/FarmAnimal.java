package com.techelevator.farm;

public class FarmAnimal implements Singable {
	private String name;
	private String sound;
	private boolean isSleeping;

	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
		isSleeping = false;
	}

	public String getName() {
		return name;
	}

	public String getSound() {
		if (isSleeping) {
			return "Zzzz!";
		}
		else {
			return sound;
		}
	}

	public boolean getIsSleeping() {
		return isSleeping;
	}

	public void setIsSleeping(boolean isSleeping) {
		this.isSleeping = isSleeping;
	}

	public void mount() {
		System.out.println("Hop up on the " + getName());
	}

	public void dismount() {
		System.out.println("Climb down off the " + getName());
	}


}