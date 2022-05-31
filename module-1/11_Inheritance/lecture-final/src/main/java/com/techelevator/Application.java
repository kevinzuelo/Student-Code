package com.techelevator;

import java.lang.reflect.GenericArrayType;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What item is to be auctioned? " );
        String itemForSale = scanner.nextLine();

        System.out.println("What kind of auction do you want (General, Reserve, Buyout)" );
        String answer = scanner.nextLine().toLowerCase();
        Auction auction;
        if (answer.equals("general")) {
            auction = new Auction(itemForSale);
        }
        else if (answer.equals("reserve")) {
            System.out.println("Enter the reserve price: ");
            String reservePrice = scanner.nextLine();
            auction = new ReserveAuction(itemForSale, Integer.parseInt(reservePrice));
        }
        else if (answer.equals("buyout")) {
            System.out.println("Enter the buyout price: ");
            String buyoutPrice = scanner.nextLine();
            auction = new BuyoutAuction(itemForSale, Integer.parseInt(buyoutPrice));
        }
        else {
            return;
        }

        System.out.println("Step up and make your bids...");

        String bidder;
        do {
            System.out.print("What is your name? ");
            bidder = scanner.nextLine();
            if (!bidder.equals("")) {
                System.out.print("What is your bid for the " + auction.getItemForSale() + "? ");
                int bidAmount = Integer.parseInt(scanner.nextLine());

                Bid bid = new Bid(bidder, bidAmount);
                if (auction.placeBid(bid)) {
                    System.out.println(bid + " accepted");
                } else {
                    System.out.println(bid + " rejected");
                }
            }
        } while (!bidder.equals(""));

        Bid bid = auction.getHighBid();
        System.out.println("The winner of the " + auction.getItemForSale() + " is " + bid.getBidder() + " with a winning bid of " + bid.getBidAmount());






//        // Create a new general auction
//        System.out.println("Starting a general auction");
//        System.out.println("-----------------");
//
//        Auction generalAuction = new Auction("Tech Elevator t-shirt");
//
//        Bid bid = new Bid("Randall", 14);
//        generalAuction.placeBid(bid);
//        generalAuction.placeBid(new Bid("Josh", 1));
//        generalAuction.placeBid(new Bid("Fonz", 23));
//        generalAuction.placeBid(new Bid("Rick Astley", 13));
//
//        bid = generalAuction.getHighBid();
//        System.out.println("The winner of the " + generalAuction.getItemForSale() + " is " + generalAuction.getHighBid().getBidder() + " with a winning bid of " + generalAuction.getHighBid().getBidAmount());
//
//        //....
//        //....
//        // This might go on until the auction runs out of time or hits a max # of bids
//
//        System.out.println();
//        System.out.println("Starting a buyout auction");
//        System.out.println("-----------------");
//
//        BuyoutAuction buyoutAuction = new BuyoutAuction("Tech Elevator water bottle", 10);
//
//        buyoutAuction.placeBid(new Bid("Sally", 2));
//        buyoutAuction.placeBid(new Bid("Angel", 9));
//        bid = new Bid("Hedgehog", 11);
//        buyoutAuction.placeBid(bid);
//        buyoutAuction.placeBid(new Bid("Ben", 20));
//        bid = buyoutAuction.getHighBid();
//        System.out.println("The winner of the " + buyoutAuction.getItemForSale() + " is " + bid.getBidder() + " with a winning bid of " + bid.getBidAmount());
//
//        System.out.println();
//        System.out.println("Starting a reserve auction");
//        System.out.println("-----------------");
//
//        ReserveAuction reserveAuction = new ReserveAuction("Tech Elevator hoodie", 10);
//
//        bid = new Bid("Josephine", 8);
//        if (!reserveAuction.placeBid(bid)) {
//            System.out.println("Bid by " + bid.getBidder() + " of " + bid.getBidAmount() + " not accepted. Must be at least " + reserveAuction.getReservePrice() + ".");
//        }
//
//        bid = new Bid("Lucy", 11);
//        if (!reserveAuction.placeBid(bid)) {
//            System.out.println("Bid by " + bid.getBidder() + " of " + bid.getBidAmount() + " not accepted. Must be at least " + reserveAuction.getReservePrice() + ".");
//        } else {
//            System.out.println("Bid by " + bid.getBidder() + " of " + bid.getBidAmount() + " accepted.");
//
//        }
//
//        bid = reserveAuction.getHighBid();
//        if (bid.getBidAmount() <= 0) {
//            System.out.println("There is no winner of the " + reserveAuction.getItemForSale() + " auction.");
//        }
//        else {
//            System.out.println("The winner of the " + reserveAuction.getItemForSale() + " is " + bid.getBidder() + " with a winning bid of " + bid.getBidAmount());
//        }

        scanner.close();

    }
}
