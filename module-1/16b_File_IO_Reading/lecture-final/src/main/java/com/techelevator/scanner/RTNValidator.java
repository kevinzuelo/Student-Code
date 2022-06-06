package com.techelevator.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class RTNValidator {

	/*
	A routing transit number is a nine-digit number used to identify
	a bank or financial institution when clearing funds for electronic
	transfers or processing checks in the United States.
	 */


	private static final int[] CHECKSUM_WEIGHTS = new int[] { 3, 7, 1, 3, 7, 1, 3, 7, 1 };

	public static void main(String[] args) throws FileNotFoundException {

		printApplicationBanner();
		
		File inputFile = getInputFileFromUser();

		try (Scanner fileScanner = new Scanner(inputFile))  {
//			while (fileScanner.hasNextLine()) {
			while (true) {
				String line = fileScanner.nextLine();
				String rtn = line.substring(0, 9);
				if (!checksumIsValid(rtn)) {
					System.out.println(rtn + " is not a valid transit number");
				} else {
					System.out.println(rtn + " is valid. Wire the money!");
				}
			}
		}
		catch (IllegalArgumentException e) {
			System.out.println("What??");
			e.printStackTrace();
		}
		catch (NoSuchElementException e) {
			System.out.println("Hmm.");
		}
		catch (Exception e) {
			System.out.println("Something is very, very wrong.");
			e.printStackTrace();
		}



//		try(Scanner fileScanner = new Scanner(inputFile)) {
//			while(fileScanner.hasNextLine()) {
//				String line = fileScanner.nextLine();
//				String rtn = line.substring(0, 9);
//
//				if(checksumIsValid(rtn) == false) {
//					System.out.println(line);
//				}
//			}
//		}
	}

	private static void printApplicationBanner() {
		System.out.println("******************");
		System.out.println("RTN Validator 9000");
		System.out.println("******************");
		System.out.println();
	}

	@SuppressWarnings("resource")
	private static File getInputFileFromUser() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter path to input file >>> ");
		String path = userInput.nextLine();
		
		File inputFile = new File(path);
		if(!inputFile.exists()) { // checks for the existence of a file
			System.out.println(path+" does not exist");
			System.exit(1); // Ends the program
		} else if(!inputFile.isFile()) {
			System.out.println(path+" is not a file");
			System.exit(1); // Ends the program
		}
		return inputFile;
	}

	private static boolean checksumIsValid(String routingNumber) {
		int checksum = 0;
		for(int i = 0; i < 9; i++) {
			int digit = Integer.parseInt(routingNumber.substring(i, i+1));
			checksum += digit * CHECKSUM_WEIGHTS[i];
		}
		return checksum % 10 == 0;
	}
}
