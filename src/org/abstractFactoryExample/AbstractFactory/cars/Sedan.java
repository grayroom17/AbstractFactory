package org.abstractFactoryExample.AbstractFactory.cars;

import org.abstractFactoryExample.AbstractFactory.factories.PartsFactory;

public class Sedan extends Car {
    PartsFactory factory;
    final CarType carType = CarType.SEDAN;

    public Sedan(PartsFactory factory) {
        this.factory = factory;
    }

    @Override
    public void createParts() throws InterruptedException {
        System.out.println("The factory has took your order and started to create parts for your future car.");

        Thread.sleep(1000);
        engine = factory.createEngine(carType);
        System.out.println("Engine was created: " + engine.toString());

        Thread.sleep(1000);
        suspension = factory.createSuspension(carType);
        System.out.println("Suspension was created: " + suspension.toString());

        Thread.sleep(1000);
        body = factory.createBody(carType);
        System.out.println("Body was created: " + body.toString());


        Thread.sleep(1000);
        transmission = factory.createTransmission(carType);
        System.out.println("Transmission was created: " + transmission.toString());
        Thread.sleep(1000);
    }

    @Override
    public void adjust() {
        System.out.println("Setting the default parameters for the sedan.");
    }
}
