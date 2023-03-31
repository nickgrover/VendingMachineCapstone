package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryReader {


    static Map<String, InventoryItem> inventoryItemMap = new HashMap<>();


    public static Map<String, InventoryItem> buildInventory() {

        //be able to read through inventory file
        File file = new File("vendingmachine.csv");
        try (Scanner scanner = new Scanner(file)) {
            //loop through it and split into its separate lines
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] arrayLine = line.split("\\|");
                //if it is a cetain category ie chip or drin
                String itemKey = arrayLine[0];
                String itemName = arrayLine[1];
                String itemPriceString = arrayLine[2];
                BigDecimal itemPrice = new BigDecimal(itemPriceString);
                String itemType = arrayLine[3];
                InventoryItem inventoryItem = new InventoryItem(itemKey,itemName, itemPrice, itemType);
                inventoryItem.setQuantity(5);
                inventoryItemMap.put(itemKey, inventoryItem);
//                if (arrayLine[3].equals("Chip")) {
//                    //inventory map.put(A1,new category chip drink gum)
//                    inventoryItemMap.put(arrayLine[0], new Chips(arrayLine[1], Double.parseDouble(arrayLine[2])));
//                }
//                if (arrayLine[3].equals("Drink")) {
//                    inventoryItemMap.put(arrayLine[0], new Drink(arrayLine[1], Double.parseDouble(arrayLine[2])));
//                }
//                if (arrayLine[3].equals("Candy")) {
//                    inventoryItemMap.put(arrayLine[0], new Candy(arrayLine[1], Double.parseDouble(arrayLine[2])));
//                }
//                if (arrayLine[3].equals("Gum")) {
//                    inventoryItemMap.put(arrayLine[0], new Gum(arrayLine[1], Double.parseDouble(arrayLine[2])));
//                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File can not be read from.");
        }

        return inventoryItemMap;
    }

    public static void displayInventory(Map<String, InventoryItem> inventoryItemMap){
        for (Map.Entry<String, InventoryItem> item : inventoryItemMap.entrySet()) {
            System.out.println(""+item.getValue().getItemName()+"|"+item.getValue().getItemPrice());
        }

    }

    public static Map<String, InventoryItem> getInventoryItemMap() {
        return inventoryItemMap;
    }
}


