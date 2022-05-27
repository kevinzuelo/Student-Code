package com.games;

public class Card {
    // Instance variables
    private final int RANK;
    private final int SUIT;

    // Constructors
    public Card(int suit, int rank) {
        this.SUIT = suit;
        this.RANK = rank;
    }
    // Getters and Setters
    public int getRank() {
        return RANK;
    }

    public String getRankName() {
        if(RANK == 1) {
            return "A";
        }
        else if(RANK > 1 && RANK < 11) {
            return "" + RANK;
        }
        else if(RANK == 11) {
            return "J";
        }
        else if(RANK == 12) {
            return "Q";
        }
        else if(RANK == 13) {
            return "K";
        }
        else {
            return "JOKER";
        }
    }

    public int getSuit() {
        return SUIT;
    }

    public String getSuitName() {
        if (SUIT == 1) {
            return "Hearts";
        }
        else if (SUIT == 2) {
            return "Clubs";
        }
        else if (SUIT == 3) {
            return "Diamonds";
        }
        else if (SUIT == 4) {
            return "Spades";
        }
        else {
            return "Wild";
        }
    }



    // Method

}
