package com.techelevator;

import java.util.Locale;

public class Lecture {

	public static void main(String[] args) {

		Album fred = new Album("Dark Side of the Moon", new String[] {"Pink Floyd"}, null, 1969, "Rock");
		System.out.println(fred.albumName + " was put out in " + fred.releaseYear);



		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		/* create an new instance of String using a literal */
		String greeting = "Hello!";
		System.out.println(greeting);


		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();

		String name = "Tyrone";

//		for (int c = 0; c < name.length(); c++) {
//
//		}
		char first = name.charAt(0);
		char fourth = name.charAt(3);


		System.out.println("--- contains ---");
		String hello = "Hello World!";
		boolean containsHello = hello.contains("Hello");
		boolean containsLowercaseHello = hello.contains("hello");

		hello = hello.toLowerCase();
		System.out.println(hello);


		/* Other commonly used methods:
		 *
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */



//		System.out.println();
//		System.out.println("**********************");
//		System.out.println("****** EQUALITY ******");
//		System.out.println("**********************");
//		System.out.println();
//
//        char[] helloArray = new char[] { 'H', 'e', 'l', 'l', 'o' };
//        String hello1 = new String(helloArray);
//        String hello2 = new String(helloArray);
//
//		/* Double equals will compare to see if the two variables, hello1 and
//		 * hello2 point to the same object in memory. Are they the same object? */
//		if (hello1 == hello2) {
//			System.out.println("They are equal!");
//		} else {
//			System.out.println(hello1 + " is not equal to " + hello2);
//		}
//
//		String hello3 = hello1;
//		if (hello1 == hello3) {
//			System.out.println("hello1 is the same reference as hello3");
//		}
//
//		/* So, to compare the values of two objects, we need to use the equals method.
//		 * Every object type has an equals method */
//		if (hello1.equals(hello2)) {
//			System.out.println("They are equal!");
//		} else {
//			System.out.println(hello1 + " is not equal to " + hello2);
//		}

	}
}
