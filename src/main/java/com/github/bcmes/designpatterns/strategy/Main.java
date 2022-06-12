package com.github.bcmes.designpatterns.strategy;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"));
        TaxCalculator taxCalculator = new TaxCalculator();
        BigDecimal taxValue = taxCalculator.calculate(budget, new Icms());
        System.out.println("Tax Value = " + taxValue);
    }
}
