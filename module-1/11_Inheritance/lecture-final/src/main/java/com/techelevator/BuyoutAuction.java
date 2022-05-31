package com.techelevator;

public class BuyoutAuction extends Auction {

    // properties
    private int buyoutPrice;

    /**
     * A buyout auction is like a regular auction except that you can have a cutoff that ends the auction if
     * the price is reached.
     *
     * @param itemForSale description of the item to be auctioned
     * @param buyoutPrice the set price that immediately wins the auction
     */
    public BuyoutAuction(String itemForSale, int buyoutPrice) {
        super(itemForSale);
        this.buyoutPrice = buyoutPrice;
    }

    @Override
    public boolean placeBid(Bid offeredBid) {
        boolean isCurrentWinningBid = false;
        if (getHighBid().getBidAmount() < buyoutPrice) {
            if (offeredBid.getBidAmount() >= buyoutPrice) {
                offeredBid = new Bid(offeredBid.getBidder(), buyoutPrice);
            }
            return super.placeBid(offeredBid);
        }
        return isCurrentWinningBid;
    }

    @Override
    public String toString() {
        return "Buyout " + super.toString();
    }


}
