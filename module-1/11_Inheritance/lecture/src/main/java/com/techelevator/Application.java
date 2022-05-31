package com.techelevator;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");

        Bid bid = new Bid("Kevin", 56);
        generalAuction.placeBid(bid);
        generalAuction.placeBid(new Bid("Josh", 1));
        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 13));


        bid = generalAuction.getHighBid();

        if(generalAuction.getItemForSale().equals("Tech Elevator t-shirt") && bid.getBidAmount() > 30) {
            System.out.println("The winner of the " + generalAuction.getItemForSale() + " is " + bid.getBidder() + " with a winning bid of " + bid.getBidAmount());
            System.out.println("Who pays more than thirty dollars for a t-shirt!? ");
        }
        else{
            System.out.println("The winner of the " + generalAuction.getItemForSale() + " is " + bid.getBidder() + " with a winning bid of " + bid.getBidAmount());

        }

        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids

        System.out.println("\nStarting a buyout auction");
        System.out.println("-------------");

        BuyoutAuction buyoutAuction = new BuyoutAuction("Tech Elevator water bottle", 10);

        buyoutAuction.placeBid(new Bid("Sally", 3));
        buyoutAuction.placeBid(new Bid("Devon", 16));
        buyoutAuction.placeBid(new Bid("Trey", 8));
        buyoutAuction.placeBid(new Bid("Steven", 11));
        buyoutAuction.placeBid(new Bid("Larry", 10));

        bid = buyoutAuction.getHighBid();
        System.out.println("The winner of the " + buyoutAuction.getItemForSale() + " is " + bid.getBidder() + " with a winning bid of " + bid.getBidAmount());

        System.out.println("\nStarting a reserve auction");
        System.out.println("-------------");

        ReserveAuction reserveAuction = new ReserveAuction("Tech Elevator Hoodie",10);

        reserveAuction.placeBid(new Bid("Jerry", 5));
        reserveAuction.placeBid(new Bid("Lauren", 15));
        reserveAuction.placeBid(new Bid("Mary", 13));

        bid = reserveAuction.getHighBid();
        System.out.println("The winner of the " + reserveAuction.getItemForSale() + " is " + bid.getBidder() + " with a winning bid of " + bid.getBidAmount());




    }
}
