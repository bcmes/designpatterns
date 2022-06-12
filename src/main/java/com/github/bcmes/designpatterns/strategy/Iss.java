package com.github.bcmes.designpatterns.strategy;

import java.math.BigDecimal;

public class Iss implements Tax {

    public BigDecimal calculate(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.06"));
    }
}
