package com.github.bcmes.designpatterns.f_command;

import com.github.bcmes.designpatterns.f_command.situation.EmAnalise;
import com.github.bcmes.designpatterns.f_command.situation.SituacaoOrcamento;

import java.math.BigDecimal;

public class Budget {
    private BigDecimal value;
    private Integer quantityOfItems;
    private SituacaoOrcamento situacao;

    public Budget(BigDecimal value, Integer quantityOfItems) {
        this.value = value;
        this.quantityOfItems = quantityOfItems;
        this.situacao = new EmAnalise();
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public void applyExtraDiscount(){
        BigDecimal valorDescontoExtra = this.getSituacao().calcularValorDescontoExtra(this);
        this.value = this.value.subtract(valorDescontoExtra);
    }

    public void aprovar() {
        this.getSituacao().aprovar(this);
    }

    public void reprovar() {
        this.getSituacao().reprovar(this);
    }

    public void finalizar() {
        this.getSituacao().finalizar(this);
    }


    public BigDecimal getValue() {
        return value;
    }
    public Integer getQuantityOfItems() {
        return quantityOfItems;
    }
}
