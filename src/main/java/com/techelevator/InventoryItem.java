package com.techelevator;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;


public class InventoryItem implements Purchasable {


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
                System.out.println(userSelection + " | " + item.getName() + " | Cost: $" + item.getPrice() + " | Money remaining: $" + calculator.getCurrentMoneyProvided());
                System.out.println(item.getPurchaseMessage());
            } else {
                System.out.println();
                System.out.println("Sorry, this item is sold out");
            }
    }
}






