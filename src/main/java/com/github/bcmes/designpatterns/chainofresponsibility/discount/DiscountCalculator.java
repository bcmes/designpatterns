package com.github.bcmes.designpatterns.chainofresponsibility.discount;

import com.github.bcmes.designpatterns.chainofresponsibility.Budget;

import java.math.BigDecimal;

public class DiscountCalculator {
    public BigDecimal calculate(Budget budget){
        Discount discount = new DiscountForMoreThanFiveItems(
                new DiscountForAmountsGreaterThanOneHundred(
                        new NoDiscount()));
        return discount.calculate(budget);
    }
}
