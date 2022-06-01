package com.techelevator.farm;

public class OldMacdonald {
	public static void main(String[] args) {

		Sheep sherman = new Sheep();
		Chicken lucy = new Chicken();
		lucy.setSleeping(true);
		Cat tasha = new Cat();
		tasha.setSleeping(true);
		Tractor billy = new Tractor();

		Singable[] singables = new Singable[] { tasha, new Cow(), lucy , new Pig(), sherman, billy};

		Rideable[] rideables = new Rideable[] {new Cow(),sherman, billy};
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


		for(Rideable rideable: rideables){
			rideable.mount();
			rideable.dismount();
		}

		Sellable[] sellables = new Sellable[] {new Cow(), new Pig(), lucy.layEgg(), egg, lucy.layEgg()};

		for(Sellable sellable: sellables) {
			System.out.println("\nStep right up and get your " + sellable.getName());
			System.out.println("Only $" + sellable.getPrice());
		}


	}
}