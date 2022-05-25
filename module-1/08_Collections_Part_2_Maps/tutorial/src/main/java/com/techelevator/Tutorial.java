package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Tutorial {
	

    public static void main(String[] args) {

        // Step One: Declare a Map

        Map<String, String> projects;
        projects = new HashMap<>();
    	
    	// Step Two: Add items to a Map

        projects.put("Ada", "Inventing Computer Programming");
        projects.put("Grace", "COBOL");
        projects.put("Margaret", "Apollo Guidance Computer");
        projects.put("Adele", "Graphical User Interfaces");
    	
    	// Step Three: Loop through a Map

        projects.remove("Grace");

        for(Map.Entry<String, String> entries : projects.entrySet()) {
            System.out.println("The key " + entries.getKey() + " is linked to the value " + entries.getValue());
        }

    }

}
