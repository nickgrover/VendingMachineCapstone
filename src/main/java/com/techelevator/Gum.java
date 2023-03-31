package com.techelevator;

public class Gum extends InventoryItem {
    public Gum(String name, double price) {
        super(name, price);
    }

    @Override
    public String getPurchaseMessage() {
        return "Chew Chew, Yum!";
    }
}
