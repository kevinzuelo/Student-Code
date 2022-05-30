package com.games;

import java.util.List;

public class Player {
    // properties
    private List<Card> hand;
    private String playerName;

    // constructors
    public Player(String name) {
        playerName = name;
    }

    // getters / setters
    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public String getPlayerName() {
        return playerName;
    }

    // methods

    public String getHandValue() {
        String handValue = "";
        for (Card card : hand) {
            handValue += card.getCardValue() + "   ";
        }
        return handValue;
    }


}
