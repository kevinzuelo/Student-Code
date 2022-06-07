package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("What is the search word?");
        String query = userInput.nextLine();

        System.out.println("What is the replacement word?");
        String replacement = userInput.nextLine();

        System.out.println("What is the source file?");
        String inputPath = userInput.nextLine();
        File inputFile = new File(inputPath);

        System.out.println("What is the destination file?");
        String outputPath = userInput.nextLine();
        File outputFile = new File(outputPath);

        try (Scanner fileScanner = new Scanner(inputFile)) {
            try(PrintWriter printer = new PrintWriter(outputFile)) {
                String newLine = "";

                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();

                    if (line.contains(query)) {
                        printer.println(line.replaceAll(query, replacement));
                    } else {
                        printer.println(line);
                    }
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        userInput.close();
    }
}
