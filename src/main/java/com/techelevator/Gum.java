package com.techelevator;

public class Gum extends InventoryItem {
    public Gum(String slotLocation, String name, double price, String type, String purchaseMessage) {
        super(slotLocation, name, price, type, "Chew Chew, Yum!");
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
