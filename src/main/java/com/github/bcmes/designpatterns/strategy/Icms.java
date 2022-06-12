package com.github.bcmes.designpatterns.strategy;

import java.math.BigDecimal;

public class Icms implements Tax {

    public BigDecimal calculate(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }
}
