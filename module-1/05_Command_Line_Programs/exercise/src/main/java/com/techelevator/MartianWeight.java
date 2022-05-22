package com.techelevator;

import java.util.Scanner;

/*
In case you've ever pondered how much you weigh on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

$ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth is 37 lbs. on Mars.
 235 lbs. on Earth is 88 lbs. on Mars.
 185 lbs. on Earth is 69 lbs. on Mars. 
 */
public class MartianWeight {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String userWeightsInput = "";

		System.out.println("Enter a series of Earth weights (space-separated): ");
		userWeightsInput = scanner.nextLine();

		String[] splitString = userWeightsInput.split( " ");

		for (int i = 0; i < splitString.length; i++) {
			System.out.println(splitString[i] + " lbs. on Earth is " + (int)(Integer.parseInt(splitString[i]) * 0.378 ) + " lbs. on Mars." );
		}
		scanner.close();
	}
}
