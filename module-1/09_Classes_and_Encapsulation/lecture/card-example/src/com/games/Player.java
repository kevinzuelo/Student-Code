package com.games;

import java.util.ArrayList;
import java.util.List;

public class Player {
    // Properties
    private List<Card> hand;
    private final String playerName;

    // Constructors
    public Player(String name) {
        playerName = name;
    }

    // Getters and Setters
    public List<Card> getHand() {
        return hand;
    }

    public String getPlayerName() {
        return playerName;
    }


    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    // Methods

    public String displayHand() {
        String playersHand = "";
        for(Card card : hand) {
            playersHand = card.getRankName() + " of " + card.getSuitName();
        }
        return playersHand;
    }
}
