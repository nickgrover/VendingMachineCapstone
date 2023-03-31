package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Drink extends InventoryItem {




    public Drink(String slotLocation, String name, double price,  String type, String purchaseMessage) {
        super(slotLocation,name, price,type, "Glug Glug, Yum!");

    }

    @Override
    public double getPrice() {
        return 0;
    }

//    public static void setDrinkPrices() {
//        File file = new File("vendingmachine.csv");
//        try (Scanner scanner = new Scanner (file)) {
//            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                String [] arrayLine = line.split("\\|");
//                drinkPrices.put(arrayLine[0], Double.valueOf(arrayLine[2]));
//            }
//        } catch (FileNotFoundException e) {
//        }
//
//    }
}
