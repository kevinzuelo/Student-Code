package com.techelevator;

import java.util.*;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		List<String> breeds = new ArrayList<>(Arrays.asList("Pomeranian", "Dachsund", "Greyhound", "Golden Retriever"));
		breeds.add("Pomeranian");
		breeds.add("Dachsund");
		breeds.add("Greyhound");
		breeds.add("Golden Retriever");
		breeds.addAll(Arrays.asList("Poodle", "Labradoodle"));
		System.out.println();


//		String[] breedArray = new String[] {"Pomeranian"};

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		for (int i = 0; i < breeds.size(); i++) {
			System.out.println(breeds.get(i));
		}
		System.out.println();


		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		breeds.add("Pomeranian");
		for (int i = 0; i < breeds.size(); i++) {
			System.out.println(breeds.get(i));
		}
		System.out.println();


		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		breeds.add(2, "Dalmation");
		for (int i = 0; i < breeds.size(); i++) {
			System.out.println(breeds.get(i));
		}
		System.out.println();


		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		breeds.remove(0);
		for (int i = 0; i < breeds.size(); i++) {
			System.out.println(breeds.get(i));
		}
		System.out.println();


		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		if (breeds.contains("Dachsund")) {
			System.out.println("Dachsund is already in the list");
		}
		else {
			System.out.println("Dachsund is NOT already in the list");
		}


		boolean inList = breeds.contains("French Poodle");
		System.out.println("The list contains French Poodle: " + inList);
		System.out.println();


		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		System.out.println("Dachsund is at index " + breeds.indexOf("Dachsund") + " in the list");


		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		String[] breedArray = breeds.toArray(breeds.toArray(new String[0]));


		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");
		Collections.sort(breeds);
		for (int i = 0; i < breeds.size(); i++) {
			System.out.println(breeds.get(i));
		}
		System.out.println();


		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		Collections.reverse(breeds);
		for (int i = 0; i < breeds.size(); i++) {
			System.out.println(breeds.get(i));
		}
		System.out.println();


		System.out.println("####################");
		System.out.println("       STACKS");
		System.out.println("####################");


		Stack<String> myStack = new Stack<String>();
		System.out.println();



		System.out.println("####################");
		System.out.println("       QUEUES (LIFO)");
		System.out.println("####################");

		Queue<String> myQueue = new LinkedList<String>();
		String myString = "Lisa";
		System.out.println();


	}
}
