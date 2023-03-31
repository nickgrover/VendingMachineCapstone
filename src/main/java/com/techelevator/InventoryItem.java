package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class InventoryItem implements Purchasable {

    private static final int INITIAL_QUANTITY = 5;


    private int quantity;
    private String name;
    private double price;
    private String purchaseMessage;



    public InventoryItem(String name, double price) {
        this.quantity = INITIAL_QUANTITY;
        this.name = name;
        this.price = price;

    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String getPurchaseMessage() {
        return null;
    }
}


    // call the setStock method
    // takes in the Map of items
    // Cycles through the map, applies a quantity of INITIAL_QUANTITY to each item





