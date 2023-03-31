package com.techelevator;

public class Candy extends InventoryItem{

    public Candy(String slotLocation, String name, double price, String type, String purchaseMessage) {
        super(slotLocation, name, price, type, "Munch Munch, Yum!");
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
