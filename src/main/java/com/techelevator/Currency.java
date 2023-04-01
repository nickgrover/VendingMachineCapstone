package com.techelevator;

import java.math.BigDecimal;

public class Currency {

//    private final double NICKEL = .05;
//    private final double DIME = .10;
//    private final double QUARTER = .25;

    private final BigDecimal NICKEL = new BigDecimal(.05);
    private final BigDecimal DIME = new BigDecimal(.10);
    private final BigDecimal QUARTER = new BigDecimal(.25);


    public Currency() {
    }

    public BigDecimal getNICKEL() {
        return NICKEL;
    }

    public BigDecimal getDIME() {
        return DIME;
    }

    public BigDecimal getQUARTER() {
        return QUARTER;
    }



    public void returnChange(BigDecimal currentMoneyProvided) {
        int numberOfQuarters = 0;
        int numberOfNickels = 0;
        int numberOfDimes = 0;
//        double remainder;
        BigDecimal divideByQuarter = currentMoneyProvided.divideToIntegralValue(QUARTER);
        currentMoneyProvided = currentMoneyProvided.subtract(divideByQuarter.multiply(QUARTER));
        BigDecimal divideByDime = currentMoneyProvided.divideToIntegralValue(DIME);
        currentMoneyProvided = currentMoneyProvided.subtract(divideByDime.multiply(DIME));
        BigDecimal divideByNickel = currentMoneyProvided.divideToIntegralValue(NICKEL);
        currentMoneyProvided = currentMoneyProvided.subtract(divideByNickel.multiply(NICKEL));
        System.out.println("Returned change: ");
        System.out.println("Number of quarters: " + divideByQuarter);
        System.out.println("Number of dimes: " + divideByDime);
        System.out.println("Number of nickels: " + divideByNickel);
        }

        }




