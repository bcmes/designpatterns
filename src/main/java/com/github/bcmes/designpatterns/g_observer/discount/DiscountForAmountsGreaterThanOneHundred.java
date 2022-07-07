package com.github.bcmes.designpatterns.g_observer.discount;

import com.github.bcmes.designpatterns.g_observer.Budget;

import java.math.BigDecimal;

public class DiscountForAmountsGreaterThanOneHundred extends Discount {

    public DiscountForAmountsGreaterThanOneHundred(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected BigDecimal calculation(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }

    @Override
    protected boolean isApplicable(Budget budget) {
        return budget.getValue().compareTo(new BigDecimal("100")) > 0;
    }
}
