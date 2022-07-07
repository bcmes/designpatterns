package com.github.bcmes.designpatterns.b_chainofresponsibility.discount;

import com.github.bcmes.designpatterns.b_chainofresponsibility.Budget;

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
