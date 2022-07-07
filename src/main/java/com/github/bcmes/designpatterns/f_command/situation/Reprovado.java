package com.github.bcmes.designpatterns.f_command.situation;

import com.github.bcmes.designpatterns.f_command.Budget;

public class Reprovado extends SituacaoOrcamento {
    @Override
    public void finalizar(Budget budget) {
        budget.setSituacao(new Finalizado());
    }
}
