package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inputScanner = new Scanner(System.in);
		boolean isCaseSensitive = true;

		System.out.print("What is the path to the file you want to search? :");
		String path = inputScanner.nextLine();
		System.out.print("What is the word you want to search? :");
		String query = inputScanner.nextLine();
		System.out.print("Should the search be case sensitive? :");
		if (inputScanner.nextLine().equalsIgnoreCase("n")) {
			isCaseSensitive = false;
		}

		File inputFile = new File(path);

		try (Scanner fileScanner = new Scanner(inputFile)) {
			int lineCounter = 1;

			if(isCaseSensitive) {
				while (fileScanner.hasNext()) {
					String line = fileScanner.nextLine();
					if(line.contains(query)) {
						System.out.println(lineCounter + ") " + line);
					}
					lineCounter++;
				}
			}
			else {
				while (fileScanner.hasNext()) {
					String line = fileScanner.nextLine();
					String lowerCaseLine = line.toLowerCase();
					if(lowerCaseLine.contains(query.toLowerCase())) {
						System.out.println(lineCounter + ") " + line);
					}
					lineCounter++;
				}
			}
		}
		inputScanner.close();
	}
}
