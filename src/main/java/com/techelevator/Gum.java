package com.techelevator;

import java.math.BigDecimal;

public class Gum extends InventoryItem {
    public Gum(String keyCode, String itemName, BigDecimal itemPrice, String itemType) {
        super(keyCode, itemName, itemPrice, itemType);
    }


//    public Gum(String name, double price) {
//        super(name, price);
//    }
//
//    @Override
//    public String getPurchaseMessage() {
//        return "Chew Chew, Yum!";
//    }
}
