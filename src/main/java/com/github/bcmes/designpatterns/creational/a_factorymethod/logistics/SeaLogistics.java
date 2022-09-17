package com.github.bcmes.designpatterns.creational.a_factorymethod.logistics;

import com.github.bcmes.designpatterns.creational.a_factorymethod.transport.Ship;
import com.github.bcmes.designpatterns.creational.a_factorymethod.transport.Transport;
import com.github.bcmes.designpatterns.creational.a_factorymethod.transport.Truck;

public class SeaLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
