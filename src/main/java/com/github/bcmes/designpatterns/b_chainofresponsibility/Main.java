package com.github.bcmes.designpatterns.b_chainofresponsibility;

import com.github.bcmes.designpatterns.b_chainofresponsibility.discount.DiscountCalculator;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Budget budget1 = new Budget(new BigDecimal("200"), 6);
        Budget budget2 = new Budget(new BigDecimal("1000"), 1);

        DiscountCalculator discountCalculator = new DiscountCalculator();
        System.out.println(discountCalculator.compute(budget1));
        System.out.println(discountCalculator.compute(budget2));
    }
}
