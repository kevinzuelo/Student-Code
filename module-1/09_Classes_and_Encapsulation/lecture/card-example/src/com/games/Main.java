package com.games;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        Deck deck;

        System.out.println("*************************");
        System.out.println("** Welcome to CardGame **");
        System.out.println("*************************");


        String playerName;
        System.out.println("Enter player 1: ");
        playerName = scanner.nextLine();
        if(playerName.isEmpty()) {
            return;
        }
        Player player1 = new Player(playerName);

        System.out.println("Enter player 2: ");
        playerName = scanner.nextLine();
        if(playerName.isEmpty()) {
            return;
        }
        Player player2 = new Player(playerName);

        // Deal cards
        deck = game.getDeck();
        player1.setHand(deck.dealHand(5));
        player2.setHand(deck.dealHand(5));

        System.out.println(player1.getPlayerName() + "'s hand: " + player1.displayHand());

    }
}
