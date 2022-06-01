package com.techelevator.farm;

public class FarmAnimal implements Singable{
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

	public void mount() {
		System.out.println("Hop up on the " + getName());
	}

	public void dismount() {
		System.out.println("Hop up off of that " + getName());
	}
}