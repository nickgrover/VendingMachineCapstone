package com.techelevator;

import java.util.Scanner;

public class Calculator {

    private double moneyInput;
    private static double currentMoneyProvided = 0.00;

    public Calculator(double moneyInput, double currentMoneyProvided) {
        this.moneyInput = moneyInput;
        this.currentMoneyProvided = currentMoneyProvided;
    }

    public static double feedMoney(double currentMoneyProvided){
        Scanner scanner = new Scanner(System.in);
        String moneyAdded = scanner.nextLine();
        double moneyAddedDouble = Double.parseDouble(moneyAdded);
        currentMoneyProvided+=moneyAddedDouble;
        return currentMoneyProvided;
    }

    public double getMoneyInput() {
        return moneyInput;
    }

    public static double getCurrentMoneyProvided() {
        return currentMoneyProvided;
    }
}
