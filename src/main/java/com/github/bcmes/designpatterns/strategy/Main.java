package com.github.bcmes.designpatterns.strategy;

import com.github.bcmes.designpatterns.strategy.tax.Icms;
import com.github.bcmes.designpatterns.strategy.tax.TaxCalculator;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"));
        TaxCalculator taxCalculator = new TaxCalculator();
        BigDecimal taxValue = taxCalculator.calculate(budget, new Icms());
        System.out.println("Tax Value = " + taxValue);
    }
}
