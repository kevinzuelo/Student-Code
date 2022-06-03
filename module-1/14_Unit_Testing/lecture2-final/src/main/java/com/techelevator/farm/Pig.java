package com.techelevator.farm;

import java.math.BigDecimal;

public class Pig extends FarmAnimal implements Sellable {

    private BigDecimal price;

    public Pig() {
        super("Pig", "oink!");
        price = new BigDecimal("300.00");
    }

    @Override
    public String eat() {
        return "Root around in the ground looking for truffles...";
    }

    public BigDecimal getPrice() {
        return this.price;
    }
}
