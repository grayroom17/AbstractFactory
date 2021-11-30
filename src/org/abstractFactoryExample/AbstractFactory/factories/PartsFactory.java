package org.abstractFactoryExample.AbstractFactory.factories;


import org.abstractFactoryExample.AbstractFactory.cars.CarType;
import org.abstractFactoryExample.AbstractFactory.parts.*;

public interface PartsFactory {
    Engine createEngine(CarType carType);
    Suspension createSuspension(CarType carType);
    Body createBody(CarType carType);
    Transmission createTransmission(CarType carType);
    Winch createWinch();
    Wing createWing();
}
