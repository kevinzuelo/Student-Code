package com.techelevator.farm;

public abstract class FarmAnimal implements Singable {
	private String name;
	private String sound;
	protected boolean isSleeping;

	public FarmAnimal(String name, String sound) {
		this.name = this.getClass().getSimpleName();
		this.sound = sound;
		isSleeping = false;
	}

	public String getName() {
		return name;
	}

	public final String getSound() {
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

	protected void setIsSleeping(boolean isSleeping) {
		this.isSleeping = isSleeping;
	}

	public String eat() {
		return "Eating " + name.toLowerCase() + " food...";
	}

	public void mount() {
		System.out.println("Hop up on the " + getName());
	}

	public void dismount() {
		System.out.println("Climb down off the " + getName());
	}


}