package com.github.bcmes.designpatterns.f_command.discount;

import com.github.bcmes.designpatterns.f_command.Budget;

import java.math.BigDecimal;

public class DiscountForMoreThanFiveItems extends Discount {

    public DiscountForMoreThanFiveItems(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected BigDecimal calculation(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    protected boolean isApplicable(Budget budget) {
        return budget.getQuantityOfItems() > 5;
    }
}
