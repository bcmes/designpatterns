package com.github.bcmes.designpatterns.f_command.discount;

import com.github.bcmes.designpatterns.f_command.Budget;

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
