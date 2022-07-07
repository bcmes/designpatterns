package com.github.bcmes.designpatterns.f_command.pedido;

import com.github.bcmes.designpatterns.f_command.Budget;

import java.time.LocalDate;

public class GeraPedidoHandler {
    public void executa(DadosPedido dadosPedido){
        Budget budget1 = new Budget(dadosPedido.getValorOrcamento(), dadosPedido.getQuantidadeItens());
        Pedido pedido = new Pedido(dadosPedido.getCliente(), LocalDate.now(), budget1);

    }
}
