package com.github.bcmes.designpatterns.c_templatemethod.discount;

import com.github.bcmes.designpatterns.c_templatemethod.Budget;

import java.math.BigDecimal;

public class DiscountForMoreThanFiveItems extends Discount {

    public DiscountForMoreThanFiveItems(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected BigDecimal calculation(Budget budget){
        return new BigDecimal("200");
    }

    @Override
    protected boolean isApplicable(Budget budget) {
        return budget.getQuantityOfItems() > 5;
    }
}
