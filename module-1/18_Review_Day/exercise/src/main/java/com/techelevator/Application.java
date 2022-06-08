package com.techelevator;


import com.techelevator.search.SearchDomain;
import com.techelevator.search.SearchEngine;
import com.techelevator.util.TELog;

import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		try {

			// TODO Step Two: Create TELog, and log the start of the application.
			//
			TELog.log("Search application started");
			
			
			
			// Step Four: Instantiate a Search Domain
			//
			SearchDomain searchDomain = new SearchDomain("data");;
			TELog.log("Indexed files: " + searchDomain.toString());
			
			
			// Step Six: Single word search
			//
			SearchEngine searchEngine = new SearchEngine(searchDomain);
			searchEngine.indexFiles();

			List<String> foundInFiles = searchEngine.search("squirrelbutt");
			System.out.println("Searching for 'squirrel'.");
			if (!foundInFiles.isEmpty()) {
				for (String file : foundInFiles) {
					System.out.println(file);
				}
			}
			else {
				System.out.println("The search term does not appear in any of the indexed files.");
			}

			
			
			// Step Seven: Multiple word search
			//
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
