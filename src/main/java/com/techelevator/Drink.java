package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Drink extends InventoryItem {


    public Drink(String name, double price) {
        super(name, price);
    }

    @Override
    public String getPurchaseMessage() {
        return "Glug Glug, Yum!";
    }


}
