package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Auction {

	// properties
	private String itemForSale;
	private Bid currentHighBid;
	private List<Bid> allBids;

	// constructors
	public Auction(String itemForSale) {
		this.itemForSale = itemForSale;
		this.currentHighBid = new Bid("", 0);
		allBids = new ArrayList<>();
	}

	// other methods
	public boolean placeBid(Bid offeredBid) {
		allBids.add(offeredBid);
		boolean isCurrentWinningBid = false;
		if (offeredBid.getBidAmount() > currentHighBid.getBidAmount()) {
			currentHighBid = offeredBid;
			isCurrentWinningBid = true;
		}
		return isCurrentWinningBid;
	}

	// getters and setters
	public Bid getHighBid() {
		return currentHighBid;
	}

	public List<Bid> getAllBids() {
		return new ArrayList<>(allBids);
	}

	public String getItemForSale() {
		return itemForSale;
	}

	@Override
	public String toString() {
		return "Auction of " + getItemForSale();
	}

}
