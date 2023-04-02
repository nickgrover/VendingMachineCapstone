package com.techelevator;

import java.math.BigDecimal;

public class Candy extends InventoryItem {

    public Candy(String name, BigDecimal price) {
        super(name, price);
    }

    @Override
    public String getPurchaseMessage() {
        return "Munch Munch, Yum!";
    }
}

