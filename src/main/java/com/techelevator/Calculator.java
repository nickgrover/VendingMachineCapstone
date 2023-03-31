package com.techelevator;

import java.util.Scanner;

public class Calculator {

    private String moneyInput;
    private double currentMoneyProvided;


    public Calculator() {
    }

    public Calculator(String moneyInput, double currentMoneyProvided) {
        this.moneyInput = moneyInput;
        this.currentMoneyProvided = 0;
    }

    public void setCurrentMoneyProvided(double currentMoneyProvided, String moneyInput){

        double moneyAddedDouble = Double.parseDouble(moneyInput);
        currentMoneyProvided+=moneyAddedDouble;
        this.currentMoneyProvided = currentMoneyProvided;
    }

    public String getMoneyInput() {
        return moneyInput;
    }

    public double getCurrentMoneyProvided() {
        return currentMoneyProvided;
    }
}
