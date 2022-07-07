package com.github.bcmes.designpatterns.g_observer.pedido.acao;

import com.github.bcmes.designpatterns.g_observer.pedido.Pedido;

public class EnviarEmail implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Enviando email com dados do pedido.");
    }
}
