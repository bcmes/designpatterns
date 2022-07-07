package com.github.bcmes.designpatterns.g_observer.discount;

import com.github.bcmes.designpatterns.g_observer.Budget;

import java.math.BigDecimal;

public class DiscountCalculator {
    public BigDecimal compute(Budget budget){
        Discount discount = new DiscountForMoreThanFiveItems(
                new DiscountForAmountsGreaterThanOneHundred(
                        new NoDiscount()));

        return discount.calculate(budget);
    }
}
