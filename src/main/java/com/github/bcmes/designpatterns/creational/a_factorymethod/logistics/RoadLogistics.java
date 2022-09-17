package com.github.bcmes.designpatterns.creational.a_factorymethod.logistics;

import com.github.bcmes.designpatterns.creational.a_factorymethod.transport.Transport;
import com.github.bcmes.designpatterns.creational.a_factorymethod.transport.Truck;

public class RoadLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
