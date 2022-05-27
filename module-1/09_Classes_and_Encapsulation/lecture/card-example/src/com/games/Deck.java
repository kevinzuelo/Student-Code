package com.games;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    // Properties
    private List<Card> cards = new ArrayList<>();
    private List<Card> discardPile = new ArrayList<>();

    // Constructors
    public Deck() {
        for (int i = 1; i <= 13; i++) {
            for (int s = 1; i <= 4; i++) {
                Card card = new Card(s , i);
                cards.add(card);
            }
        }
        shuffleDeck();
    }

    // Getters and Setters

    // Methods
    public List<Card> dealHand(int numOfCards) {
        List<Card> newHand = new ArrayList<>();

        for (int i = 1; i < numOfCards; i++) {
            if(cards.size() == 0) {
               cards = discardPile;
               shuffleDeck();
               discardPile = new ArrayList<Card>();
            }
            newHand.add(cards.get(0));
            cards.remove(0);
        }
        return newHand;
    }

    public void shuffleDeck(){
        Collections.shuffle(cards);
    }
}
