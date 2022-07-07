package com.github.bcmes.designpatterns.e_state.situation;

import com.github.bcmes.designpatterns.e_state.Budget;

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
