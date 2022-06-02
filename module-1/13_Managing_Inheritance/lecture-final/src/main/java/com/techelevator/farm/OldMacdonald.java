package com.techelevator.farm;

public class OldMacdonald {
	public static void main(String[] args) {

		Sheep sherman = new Sheep();
		Chicken lucy = new Chicken();
		Cat tasha = new Cat();
		//lucy.setIsSleeping(true);
		lucy.singToSleep();
		tasha.setIsSleeping(true);
		Tractor billy = new Tractor();

		// Can't do below anymore because we made FarmAnimal abstract
		//FarmAnimal animal = new FarmAnimal("Aardvark", "grunt!");

		Singable[] singables = new Singable[] { tasha, new Cow(), lucy, new Pig(), sherman };

		Ridable[] ridables = new Ridable[] { new Cow(), new Sheep() };

		for (Singable singable : singables) {
			String name = singable.getName();
			String sound = singable.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
		}

		sherman.shear();
		Egg egg = lucy.layEgg();
		System.out.println();

		Sellable[] sellables = new Sellable[] {new Cow(), new Pig(), egg, lucy.layEgg(), lucy.layEgg() };

		for (Sellable sellable : sellables) {
			System.out.println("Step right up and get your " + sellable.getName());
			System.out.println("Only $" + sellable.getPrice());
		}

		FarmAnimal[] eaters = new FarmAnimal[] {sherman, lucy, tasha, new Cow()};
		for (FarmAnimal eater : eaters) {
			System.out.println(eater.eat());
		}


	}
}