package com.github.bcmes.designpatterns.g_observer;

import com.github.bcmes.designpatterns.g_observer.pedido.DadosPedido;
import com.github.bcmes.designpatterns.g_observer.pedido.GeraPedidoHandler;
import com.github.bcmes.designpatterns.g_observer.pedido.acao.EnviarEmail;
import com.github.bcmes.designpatterns.g_observer.pedido.acao.SalvarNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DadosPedido dadosPedido = new DadosPedido("Cliente 1", new BigDecimal("600"), 4);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(new SalvarNoBancoDeDados(), new EnviarEmail())
        );
        handler.executa(dadosPedido);
    }
}
