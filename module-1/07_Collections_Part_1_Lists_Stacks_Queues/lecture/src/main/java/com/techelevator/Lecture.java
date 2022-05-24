package com.techelevator;

import java.util.*;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		List<String> dogsBreeds = new ArrayList<>();
		dogsBreeds.add("Pomeranian");
		dogsBreeds.add("Dachsund");
		dogsBreeds.add("Greyhound");
		dogsBreeds.add("Golden Retriever");

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		for (String names : dogsBreeds) {
			System.out.println(names);
		}

//		for (int i = 0; i < dogsBreeds.size(); i++) {
//			System.out.println(dogsBreeds.get(i));
//		}

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		dogsBreeds.add("Pomeranian");

		for (String names : dogsBreeds) {
			System.out.println(names);
		}

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		dogsBreeds.add(2,"Dalmatian");

		for (String names : dogsBreeds) {
			System.out.println(names);
		}

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		dogsBreeds.remove(2);

		for (String names : dogsBreeds) {
			System.out.println(names);
		}

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		if(dogsBreeds.contains("Greyhound")) {
			System.out.println("This list does contain: " + "Greyhound" );
		}

		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");


		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");


		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");


		System.out.println("####################");
		System.out.println("Lists work with for / for-each");
		System.out.println("####################");
		System.out.println();

		System.out.println("####################");
		System.out.println("       STACKS");
		System.out.println("####################");

		Stack<String> myNewStack = new Stack<String>();

		System.out.println("####################");
		System.out.println("Stacks are ordered, allow duplicates");
		System.out.println("####################");


		System.out.println("####################");
		System.out.println("Stacks allow duplicates");
		System.out.println("####################");


		System.out.println("####################");
		System.out.println("Stacks are LIFO");
		System.out.println("####################");

		System.out.println("####################");
		System.out.println("Stacks work with for-each for reading");
		System.out.println("####################");
		System.out.println();

		System.out.println("####################");
		System.out.println("       QUEUES");
		System.out.println("####################");

		Queue<String> myNewQueue = new LinkedList<>();

		System.out.println("####################");
		System.out.println("Queues are ordered, allow duplicates");
		System.out.println("####################");

		System.out.println("####################");
		System.out.println("Queues are FIFO");
		System.out.println("####################");

		System.out.println("####################");
		System.out.println("Queues work with for-each for reading");
		System.out.println("####################");
		System.out.println();


	}
}
