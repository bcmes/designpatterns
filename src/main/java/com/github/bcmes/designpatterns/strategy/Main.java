package com.github.bcmes.designpatterns.strategy;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"));
        TaxCalculator taxCalculator = new TaxCalculator();
        System.out.println(taxCalculator.calculator(budget, TaxType.ICMS));
    }
}
