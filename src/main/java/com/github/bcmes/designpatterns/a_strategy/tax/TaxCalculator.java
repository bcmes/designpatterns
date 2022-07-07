package com.github.bcmes.designpatterns.a_strategy.tax;

import com.github.bcmes.designpatterns.a_strategy.Budget;

import java.math.BigDecimal;

public class TaxCalculator {
    public BigDecimal compute(Budget budget, Tax tax) {
        return tax.calculate(budget);
    }
}
