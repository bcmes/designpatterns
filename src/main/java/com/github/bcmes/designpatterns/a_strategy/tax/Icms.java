package com.github.bcmes.designpatterns.a_strategy.tax;

import com.github.bcmes.designpatterns.a_strategy.Budget;
import java.math.BigDecimal;

public class Icms implements Tax {

    public BigDecimal calculate(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }
}
