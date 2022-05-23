package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static String convertToBinary(int userDecimal) {
		int[] binaryArray = new int[500];
		int index = 0;
		String binaryNumber = "";

		while (userDecimal > 0) {
			binaryArray[index] = userDecimal % 2;
			userDecimal = userDecimal / 2;
			index++;
		}
		// Print array backwards
		//for (start at the last element; until we're back at 0; count down)
		for (int i = index - 1; i >= 0; i--) {
			binaryNumber += binaryArray[i];
		}
		return binaryNumber;
	}

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

//		// One (easy) way to do it
//		for (int num : parsedToInts) {
//			System.out.println(num + " in binary is " + Integer.toBinaryString(num));
//		}

		// Another way to do it (using the custom method)
		for (int num : parsedToInts) {
			System.out.println(num + " in binary is " + convertToBinary(num));
		}
	scanner.close();
	}
}
