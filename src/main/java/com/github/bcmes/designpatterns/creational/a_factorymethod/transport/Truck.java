package com.github.bcmes.designpatterns.creational.a_factorymethod.transport;

public class Truck implements Transport{
    @Override
    public String delivery() {
        return "by Truck";
    }
}
