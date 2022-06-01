package com.techelevator.farm;

import java.math.BigDecimal;

public class Egg implements Sellable {

    public String name;
    public BigDecimal price;

    public Egg() {
        name = "Egg";
        price = new BigDecimal("0.25");
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}


