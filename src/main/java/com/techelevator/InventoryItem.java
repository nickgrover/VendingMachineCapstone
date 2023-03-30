package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryItem {

    private static final int INITIAL_QUANTITY = 5;

    private Scanner in;
    private PrintWriter out;
    private int quantity;
    private static Map<String, String> itemNameID = new HashMap<>();
    private String name;
    private String iD;
    private String category;
    private int price;

    public InventoryItem(String name, String iD, String category, int price) {
        this.quantity = INITIAL_QUANTITY;
        this.name = name;
        this.iD = iD;
        this.category = category;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
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


