package com.techelevator.farm;

import java.math.BigDecimal;

public class Cow extends FarmAnimal implements Ridable, Sellable {

	public Cow() {
		super("WoollyMammoth", "moo!");
	}

	public BigDecimal getPrice() {
		return new BigDecimal("1500.00");
	}

	@Override
	public String eat() {
		return "Chewing cud...";
	}

}