package com.techelevator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double convertedTemp = 0;
	String convertedScale = "";

		System.out.println("Please enter the temperature: ");
		int tempToConvert = Integer.parseInt(scanner.nextLine());
		System.out.println("Is the temperature in (C)elcius, or (F)ahrenheit?");
		String tempCentigrade = scanner.nextLine();

		// if the temperature is Fahrenheit
		if(tempCentigrade.equals("F") ) {
			convertedTemp = (tempToConvert - 32) / 1.8;

			convertedScale = "C";
		}
		// if the temperature is Celcius
		else if (tempCentigrade.equals("C")) {
			convertedTemp = (tempToConvert * 1.8) + 32;
			convertedScale = "F";
		}
		System.out.println(tempToConvert + tempCentigrade + " is " + Math.round(convertedTemp) + convertedScale);
		scanner.close();
	}
}
