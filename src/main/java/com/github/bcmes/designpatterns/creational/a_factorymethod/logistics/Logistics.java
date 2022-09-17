package com.github.bcmes.designpatterns.creational.a_factorymethod.logistics;

import com.github.bcmes.designpatterns.creational.a_factorymethod.transport.Transport;

public abstract class Logistics {

    public String planDelivery() {
        Transport transport = createTransport();
        String messageA = "The delivery will be ";
        String messageB = transport.delivery();
        return messageA + messageB;
    }

    public abstract Transport createTransport();
}
