package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Drink extends InventoryItem {
//    public Drink(String keyCode, String itemName, BigDecimal itemPrice, String itemType) {
//        super(keyCode, itemName, itemPrice, itemType);
//    }





    public Drink(String name, BigDecimal price) {
        super(name, price);
    }

    @Override
    public String getPurchaseMessage() {
        return "Glug Glug, Yum!";
    }


}
