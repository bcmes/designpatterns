package com.github.bcmes.designpatterns.e_state.discount;

import com.github.bcmes.designpatterns.e_state.Budget;

import java.math.BigDecimal;

public class DiscountCalculator {
    public BigDecimal compute(Budget budget){
        Discount discount = new DiscountForMoreThanFiveItems(
                new DiscountForAmountsGreaterThanOneHundred(
                        new NoDiscount()));

        return discount.calculate(budget);
    }
}
