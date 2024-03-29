package com.github.bcmes.designpatterns.c_templatemethod;

import com.github.bcmes.designpatterns.c_templatemethod.discount.DiscountCalculator;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Budget budget1 = new Budget(new BigDecimal("200"), 4);
        Budget budget2 = new Budget(new BigDecimal("100"), 7);

        DiscountCalculator discountCalculator = new DiscountCalculator();
        System.out.println(discountCalculator.compute(budget1));
        System.out.println(discountCalculator.compute(budget2));
    }
}
