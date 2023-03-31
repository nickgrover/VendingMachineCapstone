package com.techelevator;

import java.math.BigDecimal;

public class Chips extends InventoryItem{
    public Chips(String keyCode, String itemName, BigDecimal itemPrice, String itemType) {
        super(keyCode, itemName, itemPrice, itemType);
    }

//    public Chips(String name, double price) {
//        super(name, price);
//    }
//    @Override
//    public String getPurchaseMessage() {
//        return "Crunch Crunch, Yum!";
//    }
}
