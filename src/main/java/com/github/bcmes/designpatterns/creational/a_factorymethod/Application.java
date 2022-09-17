package com.github.bcmes.designpatterns.creational.a_factorymethod;

import com.github.bcmes.designpatterns.creational.a_factorymethod.logistics.Logistics;
import com.github.bcmes.designpatterns.creational.a_factorymethod.logistics.RoadLogistics;

public class Application {
    public static void main(String[] args) {
        Logistics logistics = new RoadLogistics();

        String message = logistics.planDelivery();
        System.out.println(message);
    }
}
