package com.techelevator.farm;

import java.math.BigDecimal;

public class Pig extends FarmAnimal implements Sellable{

    private BigDecimal price;

    public Pig() {
        super("Pig", "Oink!");
        price = new BigDecimal("300.00");
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    @Override
    public String eat() {
        return "Eating slop";
    }
}
