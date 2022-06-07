package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) throws IOException {
		Scanner userInput = new Scanner(System.in);

		System.out.print("Please enter the destination path: ");
		String outputPath = userInput.nextLine();

		try {
			File fizzFile = new File(outputPath);

			try(PrintWriter fizzPrinter = new PrintWriter(fizzFile)){
				for (int i = 1; i <=300 ; i++) {
					if(i % 3 == 0 && i % 5 == 0){
						fizzPrinter.println("FizzBuzz");
					}
					else if(i % 3 == 0) {
						fizzPrinter.println("Fizz");
					}
					else if(i % 5 == 0) {
						fizzPrinter.println("Buzz");
					}
					else {
						fizzPrinter.println(i);
					}
				}
			}
		}
		catch (Exception e) {
			e.getMessage();
			System.exit(0);
		}
	}

}
