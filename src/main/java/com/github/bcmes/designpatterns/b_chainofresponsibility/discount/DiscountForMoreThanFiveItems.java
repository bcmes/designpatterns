package com.github.bcmes.designpatterns.b_chainofresponsibility.discount;

import com.github.bcmes.designpatterns.b_chainofresponsibility.Budget;

import java.math.BigDecimal;

public class DiscountForMoreThanFiveItems extends Discount {

    public DiscountForMoreThanFiveItems(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    public BigDecimal calculate(Budget budget){
        if (budget.getQuantityOfItems() > 5) {
            return budget.getValue().multiply(new BigDecimal("0.1"));
        }
        return nextDiscount.calculate(budget);
    }
}
