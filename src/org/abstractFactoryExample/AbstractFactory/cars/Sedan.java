package org.abstractFactoryExample.AbstractFactory.cars;

import org.abstractFactoryExample.AbstractFactory.Factories.AbstractCarFactory;

public class Sedan extends Car {
    AbstractCarFactory factory;

    public Sedan(AbstractCarFactory factory) {
        this.factory = factory;
        this.setModel("Audi A5");
    }

    @Override
    public void createParts() throws InterruptedException {
        System.out.println("The factory has took your order and started to create parts for your future car.");

        Thread.sleep(1000);
        engine = factory.createEngine();
        System.out.println("Engine was created: " + engine.toString());

        Thread.sleep(1000);
        suspension = factory.createSuspension();
        System.out.println("Suspension was created: " + suspension.toString());

        Thread.sleep(1000);
        body = factory.createBody();
        System.out.println("Body was created: " + body.toString());


        Thread.sleep(1000);
        transmission = factory.createTransmission();
        System.out.println("Transmission was created: " + transmission.toString());
        Thread.sleep(1000);
    }

    @Override
    public void adjust() {
        System.out.println("Setting the default parameters for the sedan.");
    }
}
