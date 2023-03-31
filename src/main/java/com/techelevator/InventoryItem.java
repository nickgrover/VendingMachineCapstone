package com.techelevator;

import java.math.BigDecimal;


public class InventoryItem {  //implements Purchasable {

    private String keyCode;
    private String itemName;
    private String itemPriceString;
    private BigDecimal itemPrice;
    private String itemType;
    private int quantity;

    public InventoryItem(String keyCode, String itemName, BigDecimal itemPrice, String itemType) {
        this.keyCode = keyCode;
        this.itemName = itemName;
        this.itemPriceString = itemPriceString;
        this.itemType = itemType;
    }

    public String getKeyCode() {
        return keyCode;
    }

    public void setKeyCode(String keyCode) {
        this.keyCode = keyCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemPriceString() {
        return itemPriceString;
    }

    public void setItemPriceString(String itemPriceString) {
        this.itemPriceString = itemPriceString;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
// private static final int INITIAL_QUANTITY = 5;

//    private int quantity;
//    private String name;
//    private double price;
//    private String purchaseMessage;
//
//    public InventoryItem(String name, double price) {
//        this.quantity = INITIAL_QUANTITY;
//        this.name = name;
//        this.price = price;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity - 1;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    @Override
//    public String getPurchaseMessage() {
//        return null;
//    }
//
//    public static void purchaseItem(Map<String, InventoryItem> inventoryItemMap, double currentMoneyProvided, int quantity) {
//        Scanner scanner = new Scanner(System.in);
//        String userSelection = scanner.nextLine();
//        for (Map.Entry<String, InventoryItem> item : inventoryItemMap.entrySet()) {
//            if (item.equals(userSelection) && quantity > 0) {
//                if (item.getValue())
//                    // if they have enough money
//                        // purchase, print message, update quantity, update money
//                    // if not enough money, tell them, prompt for more money
//                // if 0, tell them it's sold out, return to purchase menu
//
//            }
//        }
//    }

}


    // call the setStock method
    // takes in the Map of items
    // Cycles through the map, applies a quantity of INITIAL_QUANTITY to each item





