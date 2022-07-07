package com.github.bcmes.designpatterns.f_command.pedido;

import com.github.bcmes.designpatterns.f_command.Budget;

import java.time.LocalDate;

public class Pedido {
    private String client;
    private LocalDate data;
    private Budget budget;

    public Pedido(String client, LocalDate data, Budget budget) {
        this.client = client;
        this.data = data;
        this.budget = budget;
    }

    public String getClient() {
        return client;
    }

    public LocalDate getData() {
        return data;
    }

    public Budget getBudget() {
        return budget;
    }
}
