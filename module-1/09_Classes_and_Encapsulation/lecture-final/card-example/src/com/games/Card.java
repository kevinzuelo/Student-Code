package com.games;

public class Card {
    // instance variables
    private final int rank;
    private final int suit;

    // Declaring ANSI_RESET so that we can reset the Java console color
    public static final String ANSI_RESET = "\u001B[0m";

    // Declaring the Java console color for the text
    public static final String ANSI_RED = "\u001B[31m";


    private static String[] suitNames = new String[] {"No Suit", "Spades", "Diamonds", "Clubs", "Hearts"};
    private static String[] suitSymbols = new String[] { "\u0000", "\u2660", ANSI_RED + "\u2666" + ANSI_RESET, "\u2663", ANSI_RED + "\u2665" + ANSI_RESET };

    public static final int NO_SUIT  = 0;
    public static final int SPADES   = 1;
    public static final int DIAMONDS = 2;
    public static final int CLUBS    = 3;
    public static final int HEARTS   = 4;
    public static final int FIRST_SUIT = 1;
    public static final int LAST_SUIT = 4;

    public static final int JOKER = 0;
    public static final int ACE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static final int SEVEN = 7;
    public static final int EIGHT = 8;
    public static final int NINE = 9;
    public static final int TEN = 10;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;

    public static final int FIRST_RANK = 1;
    public static final int LAST_RANK = 13;

    private static String[] rankNames = new String[] { "Joker", "Ace", "Two", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten", "Jack", "Queen", "King" };


    // constructors
    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // getters and setters
    public int getRank() {
        return rank;
    }

    public String getRankName() {
        return rankNames[rank];
//        if (rank == 1) {
//            return "Ace";
//        }
//        else if (rank > 1 && rank < 11) {
//            return ""+rank;
//        }
//        else if (rank == 11) {
//            return "Jack";
//        }
//        else if (rank == 12) {
//            return "Queen";
//        }
//        else if (rank == 13) {
//            return "King";
//        }
//        else {
//            return "Joker";
//        }
    }

    public String getCardValue() {
        return getRankName() + " of " + getSuitSymbol();
    }

    public int getSuit() {
        return suit;
    }

    public String getSuitName() {
        return suitNames[suit];
//        if (suit == HEARTS) {
//            return "Hearts";
//        }
//        else if (suit == 2) {
//            return "Spades";
//        }
//        else if (suit == 3) {
//            return "Diamonds";
//        }
//        else if (suit == 4) {
//            return "Clubs";
//        }
//        else {
//            return "Wild";
//        }
    }

    public String getSuitSymbol() {
        return suitSymbols[suit];
//        if (suit == 1) {
//            return "Hearts";
//        }
//        else if (suit == 2) {
//            return "Spades";
//        }
//        else if (suit == 3) {
//            return "Diamonds";
//        }
//        else if (suit == 4) {
//            return "Clubs";
//        }
//        else {
//            return "Wild";
//        }
    }

    // do stuff methods

}
