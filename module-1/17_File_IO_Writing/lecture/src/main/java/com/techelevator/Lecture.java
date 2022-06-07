package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) throws IOException {

		Scanner userInput = new Scanner(System.in);

		/*
		 * The java.io.File class is a representation of file and directory path names.  It provides methods to inspect and
		 * modify file system objects.
		 *
		 * One benefit is that it compensates for differences in Windows and Unix use of '/' and '\' as directory delimiters.
		 *
		 * A new instance of File can be created from a String that contains a file system path
		 */

		System.out.print("Enter the path of a file or directory: ");
		String path = userInput.nextLine();

		File f = new File(path);

		System.out.println();

		//Looking at file system

		if (f.exists()) {
			System.out.println("name: " + f.getName());
			System.out.println("absolute pathname: " + f.getAbsolutePath());
			if(f.isDirectory()) {
				System.out.println("type: directory");
			}
			else if (f.isFile()) {
				System.out.println("type: file");
				System.out.println("size: " + f.length());
			}

		}
		else {
			System.out.println(f.getAbsolutePath() + " does not exist.");
		}

		System.out.println();
		System.out.println("Lets create a directory.");
		System.out.println("Enter the name of the directory: ");
		path = userInput.nextLine();
		File newDirectory = new File(path);

		if(newDirectory.exists()) {
//			System.out.println("Sorry, " + newDirectory.getAbsolutePath() + " already exists.");
//			System.out.println(String.format("Sorry, %s already exists.", newDirectory.getAbsolutePath()));
			System.out.printf("Sorry, %s already exists.", newDirectory.getAbsolutePath());
		}
		else{
			if (newDirectory.mkdir()) {
				System.out.println("New directory creates at " + newDirectory.getAbsolutePath());
			}
			else {
				System.out.println("Could not create directory.");
				System.exit(1);
			}
		}

		//Create a file

		System.out.println();
		System.out.println("Now lets put a file in our directory. ");
		System.out.print("Enter relative pathname of new file: ");
		String fileName = userInput.nextLine();

		File newFile = new File(fileName);

		if(newFile.createNewFile()) {
			System.out.println(newFile + " was created.");
		}
		if (f.exists()) {
			System.out.println("name: " + newFile.getName());
			System.out.println("absolute pathname: " + newFile.getAbsolutePath());
		}

		//Writing to file
		System.out.println("\nEnter a message to put in the file: ");
		String message = userInput.nextLine();

		try (PrintWriter printer = new PrintWriter(newFile)) {
			printer.println(message);
		}

		System.out.println();
		System.out.println("name: " + newFile.getName());
		System.out.println("full pathname: " + newFile.getAbsolutePath());
		System.out.println("size: " + newFile.length());
	}
}

