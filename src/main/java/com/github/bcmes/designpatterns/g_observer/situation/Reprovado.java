package com.github.bcmes.designpatterns.g_observer.situation;

import com.github.bcmes.designpatterns.g_observer.Budget;

public class Reprovado extends SituacaoOrcamento {
    @Override
    public void finalizar(Budget budget) {
        budget.setSituacao(new Finalizado());
    }
}
