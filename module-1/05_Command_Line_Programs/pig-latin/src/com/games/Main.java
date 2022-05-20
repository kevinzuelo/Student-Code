package com.games;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Pig Latin Translator");
        System.out.println("(or as we call it, Igpay Atinlay Anslatortray)");

        Scanner scanner = new Scanner(System.in);


        // Ask user for line of text
        System.out.println("Enter a phrase or sentence in English: ");
        String initialPhrase = scanner.nextLine();

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
                System.out.print(everythingElse+"lay ");
            }
            else {
                System.out.print(everythingElse + initialLetters + "ay ");
            }

        }

        System.out.println();

        scanner.close();
    }
}
