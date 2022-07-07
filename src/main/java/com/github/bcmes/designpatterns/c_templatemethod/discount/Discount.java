package com.github.bcmes.designpatterns.c_templatemethod.discount;

import com.github.bcmes.designpatterns.c_templatemethod.Budget;

import java.math.BigDecimal;

public abstract class Discount {

    protected Discount nextDiscount;

    public Discount(Discount nextDiscount){
        this.nextDiscount = nextDiscount;
    }

    public BigDecimal calculate(Budget budget) {
        if (isApplicable(budget)) {
            return calculation(budget);
        }
        return nextDiscount.calculation(budget);
    }

    protected abstract BigDecimal calculation(Budget budget);
    protected abstract boolean isApplicable(Budget budget);
}
