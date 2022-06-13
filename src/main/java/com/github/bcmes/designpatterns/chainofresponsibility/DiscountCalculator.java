package com.github.bcmes.designpatterns.chainofresponsibility;

import java.math.BigDecimal;

public class DiscountCalculator {
    public BigDecimal calcular(Budget budget){
        if (budget.getQuantityOfItems() > 5) {
            return budget.getValue().multiply(new BigDecimal("0.1"));
        }
        if (budget.getValue().compareTo(new BigDecimal("500")) > 0) {
            return budget.getValue().multiply(new BigDecimal("0.1"));
        }
        return BigDecimal.ZERO;
    }
}
