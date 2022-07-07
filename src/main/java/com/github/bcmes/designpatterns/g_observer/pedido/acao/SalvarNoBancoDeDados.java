package com.github.bcmes.designpatterns.g_observer.pedido.acao;

import com.github.bcmes.designpatterns.g_observer.pedido.Pedido;

public class SalvarNoBancoDeDados implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando pedido no banco de dados.");
    }
}
