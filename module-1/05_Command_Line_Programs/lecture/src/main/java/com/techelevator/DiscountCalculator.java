package com.techelevator;

import java.util.Scanner;

class DiscountCalculator {

    /**
     * The main method is the start and end of our program
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Discount Calculator");

        // Prompt the user for a discount amount
        // The answer needs to be saved as a double
        System.out.print("Enter the discount amount (w/out percentage): ");
        double discountAmount = Double.parseDouble(scanner.nextLine()) / 100.0;


        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");
        String[] myStringArray = scanner.nextLine().split(" ");

        for(int i = 0; i < myStringArray.length; i++) {
            double originalPrice = Double.parseDouble(myStringArray[i]);
            double amountOff = originalPrice * discountAmount;

            double salePrice = originalPrice - amountOff;

            System.out.println("Original price: " + originalPrice + " Sale price; " + salePrice);
        }
        scanner.close();
    }

}