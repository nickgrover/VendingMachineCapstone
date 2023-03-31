package com.techelevator;

import java.util.Map;

public interface Purchasable {


    String getPurchaseMessage();
    String getSlotLocation();
    String getName();
    double getPrice();
    int getQuantity();
    String getType();


    double getPrice(Map<String, Double> itemPrices);
}
