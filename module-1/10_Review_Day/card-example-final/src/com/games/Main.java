package com.games;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

	// write your code here
        System.out.println("*******************************");
        System.out.println("**** Welcome to CardGame ******");
        System.out.println("*******************************");

        Game game = new Game();
        Deck deck;

        String playerName;
        System.out.print("Enter player 1: ");
        playerName = scanner.nextLine();
        if (playerName.equals("")) {
            return;
        }
        Player player1 = new Player(playerName);

        System.out.print("Enter player 2: ");
        playerName = scanner.nextLine();
        if (playerName.equals("")) {
            return;
        }
        Player player2 = new Player(playerName);

        // Deal cards
        deck = game.getDeck();
        player1.setHand(deck.dealHand(5));
        player2.setHand(deck.dealHand(5));

        System.out.print("Hand for " + player1.getPlayerName() + ": ");
        System.out.println(player1.getHandValue());
        System.out.print("Hand for " + player2.getPlayerName() + ": ");
        System.out.println(player2.getHandValue());

        scanner.close();


    }
}
