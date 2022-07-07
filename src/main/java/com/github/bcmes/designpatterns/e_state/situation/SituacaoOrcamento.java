package com.github.bcmes.designpatterns.e_state.situation;

import com.github.bcmes.designpatterns.e_state.Budget;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Budget budget) {
        return BigDecimal.ZERO;
    }

    public void aprovar(Budget budget) {
        throw new RuntimeException("Orcamento nao pode ser aprovado.");
    }

    public void reprovar(Budget budget) {
        throw new RuntimeException("Orcamento nao pode ser reprovado.");
    }

    public void finalizar(Budget budget) {
        throw new RuntimeException("Orcamento nao pode ser finalizado.");
    }
}
