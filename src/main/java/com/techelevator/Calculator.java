package com.techelevator;

import java.util.Scanner;

public class Calculator {

    private double moneyInput;
    private double currentMoneyProvided;


    public Calculator() {
    }

    public Calculator(double moneyInput, double currentMoneyProvided) {
        this.moneyInput = moneyInput;
        this.currentMoneyProvided = 0;
    }

    public void setCurrentMoneyProvided(double currentMoneyProvided){
        Scanner scanner = new Scanner(System.in);
        String moneyAdded = scanner.nextLine();
        double moneyAddedDouble = Double.parseDouble(moneyAdded);
        currentMoneyProvided+=moneyAddedDouble;
        this.currentMoneyProvided = currentMoneyProvided;
    }

    public double getMoneyInput() {
        return moneyInput;
    }

    public double getCurrentMoneyProvided() {
        return currentMoneyProvided;
    }
}
