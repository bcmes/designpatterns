package com.github.bcmes.designpatterns.strategy.tax;

import com.github.bcmes.designpatterns.strategy.Budget;

import java.math.BigDecimal;

public interface Tax {
    BigDecimal calculate(Budget budget);
}
