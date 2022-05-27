package com.games;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    // properties
    private List<Card> cards = new ArrayList<>();
    private List<Card> discardPile = new ArrayList();

    private int cardsInDeck = 52;

    // constructors
    public Deck() {
        for (int i = 1; i <= 13 ; i++) {
            for (int s = 1; s <= 4; s++) {
                Card card = new Card(s, i);
                cards.add(card);
            }
        }
        shuffleDeck();
    }


    // getters / setters

    // other methods
    public List<Card> dealHand(int numberOfCards) {
        List<Card> newHand = new ArrayList<>();
        for (int i = 0; i < numberOfCards; i++) {
            // Check whether we need to replace deck with discard
            if (cards.size() == 0) {
                cards = discardPile;
                shuffleDeck();
                discardPile = new ArrayList<Card>();
            }

            newHand.add(cards.get(0));
            cards.remove(0);
        }
//        for (int i = 0; i < numberOfCards; i++) {
//            cards.remove(i);
//        }
        return newHand;
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }


}
