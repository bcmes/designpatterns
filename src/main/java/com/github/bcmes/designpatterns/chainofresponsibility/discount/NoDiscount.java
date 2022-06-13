package com.github.bcmes.designpatterns.chainofresponsibility.discount;

import com.github.bcmes.designpatterns.chainofresponsibility.Budget;

import java.math.BigDecimal;

public class NoDiscount extends Discount {

    public NoDiscount() {
        super(null);
    }

    @Override
    public BigDecimal calculate(Budget budget){
        return BigDecimal.ZERO;
    }
}
