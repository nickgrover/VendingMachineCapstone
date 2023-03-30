package com.techelevator;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inventory {

    private static final int INITIAL_QUANTITY = 5;

    private Scanner in;
    private PrintWriter out;
    private int quantity;
    private Map<String, String> itemNameID = new HashMap<>();


    public Inventory(){
        this.quantity = INITIAL_QUANTITY;
    }

    // call the setStock method
    // takes in the Map of items
    // Cycles through the map, applies a quantity of INITIAL_QUANTITY to each item



}


