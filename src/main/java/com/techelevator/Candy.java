package com.techelevator;

public class Candy extends InventoryItem {

    public Candy(String name, double price) {
        super(name, price);
    }

    @Override
    public String getPurchaseMessage() {
        return "Munch Munch, Yum!";
    }
}

