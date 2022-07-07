package com.github.bcmes.designpatterns.f_command.situation;

import com.github.bcmes.designpatterns.f_command.Budget;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento {

    @Override
    public BigDecimal calcularValorDescontoExtra(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void aprovar(Budget budget) {
        budget.setSituacao(new Aprovado());
    }

    @Override
    public void reprovar(Budget budget) {
        budget.setSituacao(new Reprovado());
    }
}
