package com.github.bcmes.designpatterns.strategy.tax;

import com.github.bcmes.designpatterns.strategy.Budget;

import java.math.BigDecimal;

public class TaxCalculator {
    public BigDecimal calculate(Budget budget, Tax tax) {
        return tax.calculate(budget);
    }
}
