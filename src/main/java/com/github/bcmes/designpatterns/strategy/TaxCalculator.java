package com.github.bcmes.designpatterns.strategy;

import java.math.BigDecimal;

public class TaxCalculator {
    public BigDecimal calculator(Budget budget, TaxType taxType) {
        switch (taxType){
            case ICMS: return budget.getValue().multiply(new BigDecimal("0.1"));
            case ISS: return budget.getValue().multiply(new BigDecimal("0.06"));
            default: return BigDecimal.ZERO;
        }
    }
}
