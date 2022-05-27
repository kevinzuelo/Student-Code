package com.games;

public class Game {
    // Properties
    private Deck deck;

    // Constructors

    public Game() {
        deck = new Deck();
    }

    // Getters and Setters
    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }
}
