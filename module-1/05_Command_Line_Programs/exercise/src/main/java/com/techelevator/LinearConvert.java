package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double convertedLength = 0;
		String convertedSymbol = "";

		System.out.println("Please enter the length: ");
		int measurementToConvert = Integer.parseInt(scanner.nextLine());
		System.out.println("Is the measurement in (m)eter, or (f)eet?");
		String measurementSymbol = scanner.nextLine();

		// if the measurement is in (m)
		if(measurementSymbol.equals("m") ) {
			convertedLength = measurementToConvert * 3.2808399;
			convertedSymbol = "f";
		}
		// if the measurement is in (f)
		else if (measurementSymbol.equals("f")) {
			convertedLength = measurementToConvert * 0.3048;
			convertedSymbol = "m";
		}
		System.out.println(measurementToConvert + measurementSymbol + " is " + (int)convertedLength + convertedSymbol);
		scanner.close();
	}

}
