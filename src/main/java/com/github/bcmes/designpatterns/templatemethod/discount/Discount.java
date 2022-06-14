package com.github.bcmes.designpatterns.templatemethod.discount;

import com.github.bcmes.designpatterns.templatemethod.Budget;

import java.math.BigDecimal;

public abstract class Discount {

    protected Discount nextDiscount;

    public Discount(Discount nextDiscount){
        this.nextDiscount = nextDiscount;
    }

    public BigDecimal performCalculate(Budget budget) {
        if (isApplicable(budget)) {
            return calculation(budget);
        }
        return nextDiscount.calculation(budget);
    }

    protected abstract BigDecimal calculation(Budget budget);
    protected abstract boolean isApplicable(Budget budget);
}
