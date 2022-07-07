package com.github.bcmes.designpatterns.b_chainofresponsibility.discount;

import com.github.bcmes.designpatterns.b_chainofresponsibility.Budget;

import java.math.BigDecimal;

public class DiscountForAmountsGreaterThanOneHundred extends Discount {

    public DiscountForAmountsGreaterThanOneHundred(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    public BigDecimal calculate(Budget budget){
        if (budget.getValue().compareTo(new BigDecimal("100")) > 0) {
            return budget.getValue().multiply(new BigDecimal("0.1"));
        }
        return nextDiscount.calculate(budget);
    }
}
