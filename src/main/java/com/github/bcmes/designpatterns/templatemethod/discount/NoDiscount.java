package com.github.bcmes.designpatterns.templatemethod.discount;

import com.github.bcmes.designpatterns.templatemethod.Budget;

import java.math.BigDecimal;

public class NoDiscount extends Discount {

    public NoDiscount() {
        super(null);
    }

    @Override
    protected BigDecimal calculation(Budget budget){
        return BigDecimal.ZERO;
    }

    @Override
    protected boolean isApplicable(Budget budget) {
        return true;
    }
}
