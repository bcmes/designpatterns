package com.github.bcmes.designpatterns.g_observer.situation;

import com.github.bcmes.designpatterns.g_observer.Budget;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento {

    @Override
    public BigDecimal calcularValorDescontoExtra(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finalizar(Budget budget) {
        budget.setSituacao(new Finalizado());
    }
}
