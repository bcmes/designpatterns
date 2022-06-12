package com.github.bcmes.designpatterns.strategy;

import java.math.BigDecimal;

public interface Tax {
    BigDecimal calculate(Budget budget);
}
