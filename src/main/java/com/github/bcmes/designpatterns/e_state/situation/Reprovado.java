package com.github.bcmes.designpatterns.e_state.situation;

import com.github.bcmes.designpatterns.e_state.Budget;

import java.math.BigDecimal;

public class Reprovado extends SituacaoOrcamento {
    @Override
    public void finalizar(Budget budget) {
        budget.setSituacao(new Finalizado());
    }
}
