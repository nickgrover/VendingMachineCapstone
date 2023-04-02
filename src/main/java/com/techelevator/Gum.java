package com.techelevator;

import java.math.BigDecimal;

public class Gum extends InventoryItem {

    public Gum(String name, BigDecimal price) {
        super(name, price);
    }

    @Override
    public String getPurchaseMessage() {
        return "Chew Chew, Yum!";
    }
}
