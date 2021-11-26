package org.abstractFactoryExample.AbstractFactory.cars;

import org.abstractFactoryExample.AbstractFactory.parts.*;

public abstract class Car {
    String model;
    Engine engine;
    Suspension suspension;
    Body body;
    Transmission transmission;
    Winch winch;
    Wing wing;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public abstract void createParts() throws InterruptedException;

    public void assemble() throws InterruptedException {
        System.out.println("The car assembly process has begun.");
        Thread.sleep(1000);
        System.out.println("Your car has been successfully assembled.\n" +
                "Now we can submit it for testing and additional adjusting.");

    }
    public abstract void adjust();

    @Override
    public String toString() {
        return model;
    }
}
