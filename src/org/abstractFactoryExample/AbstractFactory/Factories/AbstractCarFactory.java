package org.abstractFactoryExample.AbstractFactory.Factories;


import org.abstractFactoryExample.AbstractFactory.parts.*;

public interface AbstractCarFactory {
    Engine createEngine();
    Suspension createSuspension();
    Body createBody();
    Transmission createTransmission();
    Winch createWinch();
    Wing createWing();
}
