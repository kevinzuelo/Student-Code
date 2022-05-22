package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] parsedToInts;

		System.out.println("Please enter in a series of decimal values (separated by spaces): ");

		// Splits the user's string and creates an Integer array based on number of strings.

		String[] splitString = scanner.nextLine().split( " ");
		parsedToInts = new int[splitString.length];

		// Parses each string into an integer and fills up the int array.
		for (int i = 0; i < splitString.length; i++) {
			parsedToInts[i] = Integer.parseInt(splitString[i]);
		}

		// One way to do it
		for (int num : parsedToInts) {
			System.out.println(num + " in binary is " + Integer.toBinaryString(num));
		}

	scanner.close();
	}
}
