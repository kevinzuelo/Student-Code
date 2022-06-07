package com.games;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Welcome to Pig Latin Translator");
        System.out.println("(or as we call it, Igpay Atinlay Anslatortray)");

        Scanner consoleInput = new Scanner(System.in);

        String directoryName;
        File directory;
        do {
            System.out.println();
            System.out.print("In which directory can I find the files: ");
            directoryName = consoleInput.nextLine();
            if (directoryName.equals("")) {
                System.exit(0);
            }
            directory = new File(directoryName);
        } while (!directory.exists() || !directory.isDirectory());

        File[] files = directory.listFiles();
        //System.out.println("0) Exit from program");
        for (int i = 0; i < files.length; i++) {
            System.out.printf("%d) %s\n", i+1, files[i].getName());
        }
        System.out.println();
        System.out.print("Which file do you want to use (specify a number): ");
        String choiceString = consoleInput.nextLine();
        int choice = Integer.parseInt(choiceString);
        while (choice < 1 || choice > files.length) {
            System.out.println("Options must be between 1 and " + files.length);
            System.out.print("Which file do you want to use (specify a number): ");
            choiceString = consoleInput.nextLine();
            choice = Integer.parseInt(choiceString);
        }
//        int choice = consoleInput.nextInt();
//        consoleInput.nextLine();

        System.out.println("Response is " + files[choice-1].getName());
        System.out.println();
        String outputPathname = files[choice-1].getAbsolutePath();
        if (outputPathname.contains(".txt")) {
            outputPathname = outputPathname.substring(0, outputPathname.length()-4);
        }
        outputPathname += "-Piggy.txt";
        File outputFile = new File(outputPathname);

        if (!outputFile.exists() && outputFile.createNewFile()) {
            try (PrintWriter writer = new PrintWriter(outputFile)) {
                String initialPhrase;
                String pigLatinPhrase;

                try (Scanner inputFile = new Scanner(files[choice - 1])) {
                    while (inputFile.hasNextLine()) {
                        initialPhrase = inputFile.nextLine();
                        pigLatinPhrase = convertToPigLatin(initialPhrase);
                        writer.println(pigLatinPhrase);
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("File not found.");
                }
            }
            catch (IOException e) {
                System.out.println("IO error.");
            }
        }

        consoleInput.close();
    }

    public static String convertToPigLatin(String initialPhrase) {
        String pigLatin = "";
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
