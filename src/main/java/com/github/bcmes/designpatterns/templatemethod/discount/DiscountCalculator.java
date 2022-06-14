package com.github.bcmes.designpatterns.templatemethod.discount;

import com.github.bcmes.designpatterns.templatemethod.Budget;

import java.math.BigDecimal;

public class DiscountCalculator {
    public BigDecimal calculate(Budget budget){
        Discount discount = new DiscountForMoreThanFiveItems(
                new DiscountForAmountsGreaterThanOneHundred(
                        new NoDiscount()));
        return discount.performCalculate(budget);
    }
}
