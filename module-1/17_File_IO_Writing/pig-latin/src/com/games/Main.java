package com.games;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Welcome to Pig Latin Translator");
        System.out.println("(or as we call it, Igpay Atinlay Anslatortray)");

        Scanner consoleInput = new Scanner(System.in);

        String directoryName;
        File directory;

        do {
            System.out.print("Enter the pathname of file to read: ");
            directoryName = consoleInput.nextLine();
            if(directoryName.equals("")) {
                System.exit(0);
            }
            directory = new File(directoryName);

        } while (!directory.exists() || !directory.isDirectory());

        File[] files = directory.listFiles();

        for (int i = 0; i < files.length; i++) {
            System.out.printf("%d) %s\n", i+1, files[i].getName());
        }
        System.out.println();
        System.out.println("Which file do you want to use (specify a number): ");
        int choice = Integer.parseInt(consoleInput.nextLine());

        while (choice < 1 || choice > files.length) {
            System.out.println("Options must be between 1 and " + files.length);
            System.out.println("Which file do you want to use (specify a number): ");
            choice = Integer.parseInt(consoleInput.nextLine());
        }
        System.out.println("Response is " + files[choice - 1].getName());
        System.out.println();
        String outputPath = files[choice - 1].getAbsolutePath();

        if (outputPath.contains(".txt")) {
            outputPath = outputPath.substring(0,outputPath.length() - 4);
        }
        outputPath += "-Piggy.txt";

        File outputFile = new File(outputPath);
        if(!outputFile.exists() && outputFile.createNewFile()) {
            try (PrintWriter writer = new PrintWriter(outputFile)) {

                String initialPhrase;
                String pigLatinPhrase;
                try (Scanner fileScanner = new Scanner(files[choice - 1])) {
                    while (fileScanner.hasNextLine()) {
                        initialPhrase = fileScanner.nextLine();
                        pigLatinPhrase = convertToPigLatin(initialPhrase);
                        writer.println(pigLatinPhrase);
                    }
                } catch (FileNotFoundException e) {}
            }
        }




        System.exit(0);

    }

    public static String convertToPigLatin(String initialPhrase) {
        String pigLatin = "";

        // Break up string into words array
        String[] wordsArray = initialPhrase.split(" ");

        for (int i = 0; i < wordsArray.length; i++) {
            if (wordsArray[i].length() == 0) {
                continue;
            }

            //System.out.print(wordsArray[i] + " ");
            int initialLen = 0;

            String currentWord = wordsArray[i];

            for (int c = 0; c < currentWord.length(); c++) {
                String letter = currentWord.substring(c, c+1).toLowerCase();
                if (!letter.equals("a") && !letter.equals("e") && !letter.equals("i") && !letter.equals("o") && !letter.equals("u")) {
                    initialLen++;
                }
                else {
                    break;
                }
            }

            String initialLetters = currentWord.substring(0, initialLen);
            String everythingElse = "";

            if (currentWord.length() > initialLen) {
                everythingElse = currentWord.substring(initialLen);
            }
//            else {
//                everythingElse = "";
//            }

            if (initialLen == 0)
            {
                pigLatin += everythingElse+"lay ";
            }
            else {
                pigLatin += everythingElse + initialLetters + "ay ";
            }

        }
        return pigLatin;
    }
}
