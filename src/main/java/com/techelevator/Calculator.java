package com.techelevator;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {

    //private static final DecimalFormat moneyFormat = new DecimalFormat("0.00");

    private BigDecimal moneyInput;
    private BigDecimal currentMoneyProvided;
    private BigDecimal itemCost;


    public Calculator() {
        this.currentMoneyProvided = new BigDecimal("0.00");
    }

    public Calculator(BigDecimal moneyInput, BigDecimal currentMoneyProvided, BigDecimal itemCost) {
        this.moneyInput = moneyInput;
        this.itemCost = itemCost;
        this.currentMoneyProvided = new BigDecimal("0.00");
    }

    public void setCurrentMoneyProvided(BigDecimal currentMoneyProvided, BigDecimal moneyInput, boolean isPurchase){
        if (isPurchase) {
            this.currentMoneyProvided = currentMoneyProvided.subtract(moneyInput);
        } else {
            this.currentMoneyProvided = currentMoneyProvided.add(moneyInput);
        }
    }

    public BigDecimal getMoneyInput() {
        return moneyInput;
    }

    public BigDecimal getCurrentMoneyProvided() {
        return currentMoneyProvided;
    }

}
