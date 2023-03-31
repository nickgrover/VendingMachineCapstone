package com.techelevator;

public class Chips extends InventoryItem{


    public Chips(String slotLocation, String name, double price, String type, String purchaseMessage) {
        super(slotLocation, name, price, type, "Crunch Crunch, Yum!");
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
