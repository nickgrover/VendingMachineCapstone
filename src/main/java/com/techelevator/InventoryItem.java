package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryItem implements Purchasable {

    private static final int INITIAL_QUANTITY = 5;

    private Scanner in;
    private PrintWriter out;
    private int quantity;
    private static Map<String, String> itemNameID = new HashMap<>();
    private String name;
    private String slotLocation;
    private String type;
    private double price;

    public InventoryItem(String slotLocation, String name, double price, String type) {
        this.quantity = INITIAL_QUANTITY;
        this.name = name;
        this.slotLocation = slotLocation;
        this.type = type;
        this.price = price;
    }


    public int getQuantity() {
        return quantity;
    }

    public int updateQuantity(int quantity) { // take in current quantity, subtract 1, return new quantity
        return quantity--;
    }

    @Override
    public String getType() {
        return type;
    }


    @Override
    public String printPurchaseMessage() {
        return null;
    }

    @Override
    public String getSlotLocation() {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void displayItems() {
        File file = new File("vendingmachine.csv");
        try (Scanner scanner = new Scanner (file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String [] arrayLine = line.split("\\|");
                itemNameID.put(arrayLine[0], arrayLine[1]);
            }
        } catch (FileNotFoundException e) {
        }
        for (Map.Entry<String, String> item : itemNameID.entrySet()) {
            System.out.println(item.getValue() + " - Quantity: " + INITIAL_QUANTITY);
        }
    }



    // call the setStock method
    // takes in the Map of items
    // Cycles through the map, applies a quantity of INITIAL_QUANTITY to each item



}


