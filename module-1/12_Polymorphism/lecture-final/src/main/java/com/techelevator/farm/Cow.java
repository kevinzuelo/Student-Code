package com.techelevator.farm;

import java.math.BigDecimal;

public class Cow extends FarmAnimal implements Ridable, Sellable {

	public Cow() {
		super("Cow", "moo!");
	}

	public BigDecimal getPrice() {
		return new BigDecimal("1500.00");
	}

}