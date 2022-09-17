package com.github.bcmes.designpatterns.c_templatemethod.discount;

import com.github.bcmes.designpatterns.c_templatemethod.Budget;

import java.math.BigDecimal;

public class DiscountForAmountsGreaterThanOneHundred extends Discount {

    public DiscountForAmountsGreaterThanOneHundred(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected BigDecimal calculation(Budget budget){
        return new BigDecimal("100");
    }

    @Override
    protected boolean isApplicable(Budget budget) {
        return budget.getValue().compareTo(new BigDecimal("100")) > 0;
    }
}
