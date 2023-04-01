package com.techelevator;

import java.math.BigDecimal;
import java.util.Scanner;

public class Calculator {

    private BigDecimal moneyInput;
    private BigDecimal currentMoneyProvided;
    private BigDecimal itemCost;


    public Calculator() {
    }

    public Calculator(BigDecimal moneyInput, BigDecimal currentMoneyProvided, BigDecimal itemCost) {
        this.moneyInput = moneyInput;
        this.itemCost = itemCost;
        this.currentMoneyProvided.equals(0);
    }

    public void setCurrentMoneyProvided(BigDecimal currentMoneyProvided, BigDecimal moneyInput, boolean isPurchase){

//        double moneyAddedDouble = Double.parseDouble(moneyInput);
        if (isPurchase) {
            this.currentMoneyProvided = currentMoneyProvided.subtract(moneyInput);
        } else {
            this.currentMoneyProvided = currentMoneyProvided.add(moneyInput);
        }
    }

//    public void setCurrentMoneyProvided(double currentMoneyProvided, double itemCost){
//
////        double moneyAddedDouble = Double.parseDouble(moneyInput);
//        currentMoneyProvided -= itemCost;
//        this.currentMoneyProvided = currentMoneyProvided;
//    }

    public BigDecimal getMoneyInput() {
        return moneyInput;
    }

    public BigDecimal getCurrentMoneyProvided() {
        return currentMoneyProvided;
    }





}
