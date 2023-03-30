package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Drink extends InventoryItem {

    private static Map<String, Double> drinkPrices = new HashMap<>();


    public Drink(String name, String iD, String category, int price) {
        super(name, iD, category, price);
    }


    public String purchaseMessage() {
        return "Glug Glug, Yum!";
    }

    public static void setDrinkPrices() {
        File file = new File("vendingmachine.csv");
        try (Scanner scanner = new Scanner (file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String [] arrayLine = line.split("\\|");
                drinkPrices.put(arrayLine[0], Double.valueOf(arrayLine[2]));
            }
        } catch (FileNotFoundException e) {
        }

    }
}
