package com.techelevator;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;


public class InventoryItem implements Purchasable {

//    private String keyCode;
//    private String itemName;
//    private String itemPriceString;
//    private BigDecimal itemPrice;
//    private String itemType;
//    private int quantity;
//
//    public InventoryItem(String keyCode, String itemName, BigDecimal itemPrice, String itemType) {
//        this.keyCode = keyCode;
//        this.itemName = itemName;
//        this.itemPriceString = itemPriceString;
//        this.itemType = itemType;
//    }
//
//    public String getKeyCode() {
//        return keyCode;
//    }
//
//    public void setKeyCode(String keyCode) {
//        this.keyCode = keyCode;
//    }
//
//    public String getItemName() {
//        return itemName;
//    }
//
//    public void setItemName(String itemName) {
//        this.itemName = itemName;
//    }
//
//    public String getItemPriceString() {
//        return itemPriceString;
//    }
//
//    public void setItemPriceString(String itemPriceString) {
//        this.itemPriceString = itemPriceString;
//    }
//
//    public BigDecimal getItemPrice() {
//        return itemPrice;
//    }
//
//    public void setItemPrice(BigDecimal itemPrice) {
//        this.itemPrice = itemPrice;
//    }
//
//    public String getItemType() {
//        return itemType;
//    }
//
//    public void setItemType(String itemType) {
//        this.itemType = itemType;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }


    private static final int INITIAL_QUANTITY = 5;

    private int quantity;
    private String name;
    private BigDecimal price;
    private String purchaseMessage;
    private String itemKey;

    static Calculator calculator = new Calculator();

    public InventoryItem(String name, BigDecimal price) {
        this.quantity = INITIAL_QUANTITY;
        this.name = name;
        this.price = price;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity - 1;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String getPurchaseMessage() {
        return null;
    }

    public static void purchaseItem(Map<String, InventoryItem> inventoryItemMap, BigDecimal currentMoneyProvided, String userSelection) throws NullPointerException {
        InventoryItem item = inventoryItemMap.get(userSelection);
            if (item.getQuantity() > 0) {
                calculator.setCurrentMoneyProvided(currentMoneyProvided, item.getPrice(), true);
                item.setQuantity(item.getQuantity());
                System.out.println(userSelection + " | " + item.getName() + " | $" + item.getPrice() + " | " + calculator.getCurrentMoneyProvided());
                System.out.println(item.getPurchaseMessage());
            } else {
                System.out.println();
                System.out.println("Sorry, this item is sold out");
            }
        }
}






