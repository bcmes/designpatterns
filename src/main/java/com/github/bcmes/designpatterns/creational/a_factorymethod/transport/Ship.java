package com.github.bcmes.designpatterns.creational.a_factorymethod.transport;

public class Ship implements Transport{
    @Override
    public String delivery() {
        return "by Ship";
    }
}
