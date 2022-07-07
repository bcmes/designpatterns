package com.github.bcmes.designpatterns.c_templatemethod;

import java.math.BigDecimal;

public class Budget {
    private BigDecimal value;
    private Integer quantityOfItems;

    public Budget(BigDecimal value, Integer quantityOfItems) {
        this.value = value;
        this.quantityOfItems = quantityOfItems;
    }

    public BigDecimal getValue() {
        return value;
    }
    public Integer getQuantityOfItems() {
        return quantityOfItems;
    }
}
