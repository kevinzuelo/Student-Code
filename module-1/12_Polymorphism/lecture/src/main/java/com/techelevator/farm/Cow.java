package com.techelevator.farm;

import java.math.BigDecimal;

public class Cow extends FarmAnimal implements Rideable, Sellable{

	public Cow() {
		super("Woolly Mammoth", "moo!");
	}

	public BigDecimal getPrice() {
		return new BigDecimal("15000.00");
	}

	@Override
	public String eat(){
		return "Chewing cud...";
	}
}