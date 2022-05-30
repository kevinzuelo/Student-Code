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
        for (int i = Card.FIRST_RANK; i <= Card.LAST_RANK ; i++) {
            for (int s = Card.FIRST_SUIT; s <= Card.LAST_SUIT; s++) {
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
