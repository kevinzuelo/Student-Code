package com.techelevator;

/**
 * Bookstore
 */
public class Bookstore {

    public static void main(String[] args) {

        System.out.println("Welcome to the Tech Elevator Bookstore");
        System.out.println();

        // Step Three: Test the getters and setters
        Book twoCities = new Book();
        twoCities.setTitle("A Tale of Two Cities");
        twoCities.setAuthor("Charles Dickens");
        twoCities.setPrice(14.99);
        System.out.println(twoCities.bookInfoToString() + "\n");

        // Step Five: Test the Book constructor
        Book blooKitties = new Book("A Pail of Blue Kitties", "Gnarls Lickens", 19.99);
        System.out.println(blooKitties.bookInfoToString());

        // Step Nine: Test the ShoppingCart class
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(twoCities);
        shoppingCart.add(blooKitties);
        System.out.println(shoppingCart.receipt());
    }
}