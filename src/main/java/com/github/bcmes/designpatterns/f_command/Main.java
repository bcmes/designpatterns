package com.github.bcmes.designpatterns.f_command;

import com.github.bcmes.designpatterns.f_command.pedido.DadosPedido;
import com.github.bcmes.designpatterns.f_command.pedido.GeraPedidoHandler;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        DadosPedido dadosPedido = new DadosPedido("Cliente 1", new BigDecimal("600"), 4);
        GeraPedidoHandler handler = new GeraPedidoHandler();
        handler.executa(dadosPedido);
    }
}
