package com.github.bcmes.designpatterns.chainofresponsibility.discount;

import com.github.bcmes.designpatterns.chainofresponsibility.Budget;

import java.math.BigDecimal;

public abstract class Discount {

    protected Discount nextDiscount;

    public Discount(Discount nextDiscount){
        this.nextDiscount = nextDiscount;
    }

    public abstract BigDecimal calculate(Budget budget);
}
