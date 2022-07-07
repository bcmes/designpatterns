package com.github.bcmes.designpatterns.g_observer.pedido;

import com.github.bcmes.designpatterns.g_observer.Budget;
import com.github.bcmes.designpatterns.g_observer.pedido.acao.AcaoAposGerarPedido;

import java.time.LocalDate;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void executa(DadosPedido dadosPedido){
        Budget budget1 = new Budget(dadosPedido.getValorOrcamento(), dadosPedido.getQuantidadeItens());
        Pedido pedido = new Pedido(dadosPedido.getCliente(), LocalDate.now(), budget1);

        acoes.forEach(a->a.executarAcao(pedido));
    }
}
