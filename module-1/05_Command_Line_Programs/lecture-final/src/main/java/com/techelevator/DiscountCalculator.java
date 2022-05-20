package com.techelevator;

import java.util.Scanner;

class DiscountCalculator {

    /**
     * The main method is the start and end of our program
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Discount Calculator");

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome, " + name + "!");


        // Prompt the user for a discount amount
        // The answer needs to be saved as a double
        System.out.print("Enter the discount amount (w/out percentage): ");
        String discountString = scanner.nextLine();
        double discount = Double.parseDouble(discountString) / 100.0;

        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");
        String prices = scanner.nextLine();

        String[] priceArray = prices.split(" ");

        for (int i = 0; i < priceArray.length; i++) {
            // Read and parse each value in the array
            double originalPrice = Double.parseDouble(priceArray[i]);

            double amountOff = originalPrice * discount;

            double salePrice = originalPrice - amountOff;

            System.out.println("Original price: " + originalPrice + " Sale price: " + salePrice);
        }

        scanner.close();




    }

}