package com.techelevator;

public class BuyoutAuction extends Auction{

    // properties
    private int buyOutPrice;

    /**
     *
     * @param itemForSale description of item for sale
     * @param buyOutPrice the set price that immediately wins the auction
     */

    public BuyoutAuction(String itemForSale, int buyOutPrice) {
        super(itemForSale);
        this.buyOutPrice = buyOutPrice;
    }

    @Override
    public boolean placeBid(Bid offeredBid) {
        boolean isCurrentWinningBid = false;
        if(getHighBid().getBidAmount() < buyOutPrice) {
            if(offeredBid.getBidAmount() > buyOutPrice) {
                offeredBid = new Bid(offeredBid.getBidder(), buyOutPrice);
            }
            isCurrentWinningBid = super.placeBid(offeredBid);
        }
        return isCurrentWinningBid;
    }
}
