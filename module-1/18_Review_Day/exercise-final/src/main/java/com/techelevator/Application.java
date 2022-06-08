package com.techelevator;

import com.techelevator.search.SearchDomain;
import com.techelevator.search.SearchEngine;
import com.techelevator.util.*;

import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		try {

			// Step Two: Create TELog, and log the start of the application.
			//
			TELog.log("Search application started. Woo hoo!");
			
			
			
			// Step Four: Instantiate a Search Domain
			//
			SearchDomain searchDomain = new SearchDomain("data");
			TELog.log("Indexed files: " + searchDomain.toString());
			

			// Step Six: Single word search
			//
			SearchEngine searchEngine = new SearchEngine(searchDomain);
			searchEngine.indexFiles();
			List<String> foundInFiles = searchEngine.search("squirrel");
			System.out.println("Searching for 'squirrel'.");
			if (foundInFiles.size() > 0) {
				for (String file: foundInFiles) {
					System.out.println(file);
				}
			}
			else {
				System.out.println("The search term does not appear in any of the indexed files.");
			}
			
			// Step Seven: Multiple word search
			//
			foundInFiles = searchEngine.search("telephone line");
			System.out.println("Searching for 'telephone line'.");
			if (foundInFiles.size() > 0) {
				for (String file: foundInFiles) {
					System.out.println(file);
				}
			}
			else {
				System.out.println("The search term does not appear in any of the indexed files.");
			}

			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
