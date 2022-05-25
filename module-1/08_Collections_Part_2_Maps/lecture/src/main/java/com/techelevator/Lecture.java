package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		Map<String, Integer> populations = new HashMap<>();

		populations.put("NY", 20201249);
		populations.put("PA", 13002700);
		populations.put("MA", 7029917);
		populations.put("OH", 11799447);

		System.out.println("Populations included: " + populations.size());

		System.out.println("The population of NY is: " + populations.get("NY"));

		for (String state : populations.keySet()) {
			System.out.println("The population of " + state + " is " + populations.get(state));
		}

		for(Map.Entry<String, Integer> population : populations.entrySet()) {
			System.out.println("The population of " + population.getKey());
		}
	}

}
