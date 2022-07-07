package com.github.bcmes.designpatterns.a_strategy.tax;

import com.github.bcmes.designpatterns.a_strategy.Budget;

import java.math.BigDecimal;

public interface Tax {
    BigDecimal calculate(Budget budget);
}
