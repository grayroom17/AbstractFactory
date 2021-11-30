package org.abstractFactoryExample.AbstractFactory.parts.engines;

import org.abstractFactoryExample.AbstractFactory.parts.Engine;

public class BmwSportCarEngine implements Engine {
    @Override
    public String toString() {
        return ("Twin-turbo 4.4-liter V-8 BMW Sport Car engine with 600 horsepower and 553 lb-ft of torque");
    }
}
