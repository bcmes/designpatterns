package com.github.bcmes.designpatterns.strategy.tax;

import com.github.bcmes.designpatterns.strategy.Budget;
import java.math.BigDecimal;

public class Icms implements Tax {

    public BigDecimal calculate(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }
}
