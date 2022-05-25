package com.techelevator;

import java.util.*;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		// Declaring and initializing map
		Map<String, Integer> populationByState = new HashMap<>();

		// Add items to map
		populationByState.put("NY", 20201249);
		populationByState.put("PA", 13002700);
		populationByState.put("MA", 7029917);
		populationByState.put("OH", 11799448);

		System.out.println("Populations included: " + populationByState.size());

		//System.out.println("The population of NY is " + populationByState.get("NY"));

		Set<String> states = populationByState.keySet();
		for (String state : states) {
			System.out.println("The population of "+ state + " is " + populationByState.get(state));
		}

		int newPopulation = populationByState.get("NY") + 75;
		populationByState.put("NY", newPopulation);


		System.out.println("\nAfter adding to NY's population");
		for (String state : states) {
			System.out.println("The population of "+ state + " is\t " + populationByState.get(state));
		}

		populationByState.put("DC", 689545);

		System.out.println("\n\n\nAfter adding DC");
		for (String state : states) {
			System.out.println("The population of "+ state + " is " + populationByState.get(state));
		}

		if (populationByState.containsKey("HI")) {
			System.out.println("We know the population of Hawaii");
		}
		else {
			System.out.println("We don't know the population of Hawaii");
		}

		populationByState.remove("DC");

		System.out.println("\nAfter removing DC");
		for (String state : states) {
			System.out.println("The population of "+ state + " is\t " + populationByState.get(state));
		}

		System.out.println("\nDo it again with Map.Entry");
		for (Map.Entry<String, Integer> statePopulation : populationByState.entrySet()) {
			System.out.println("The population of "+ statePopulation.getKey() + " is\t " + statePopulation.getValue());
		}



		System.out.println("\n\n####################");
		System.out.println("        White Boarding");
		System.out.println("####################");
		System.out.println();
		/*
		Define a method call aInList which returns a list of strings. An array of strings is passed in. The list
		will contain each string in the array what starts with the letter 'a'.
		 */


	}

	public List<String> aInList(String[] array) {
		List<String> newList = new ArrayList<>();

		for (String str : array) {
			if (str.startsWith("a")) {
				newList.add(str);
			}
		}

		return newList;
	}

}
