package com.github.bcmes.designpatterns.b_chainofresponsibility.discount;

import com.github.bcmes.designpatterns.b_chainofresponsibility.Budget;

import java.math.BigDecimal;

public class DiscountCalculator {
    public BigDecimal compute(Budget budget){
        Discount discount = new DiscountForMoreThanFiveItems(
                new DiscountForAmountsGreaterThanOneHundred(
                        new NoDiscount()));

        return discount.calculate(budget);
    }
}
