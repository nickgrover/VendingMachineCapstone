package com.techelevator;

public class Chips extends InventoryItem{


    public Chips(String name, double price) {
        super(name, price);
    }
    @Override
    public String getPurchaseMessage() {
        return "Crunch Crunch, Yum!";
    }
}
