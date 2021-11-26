package org.abstractFactoryExample.AbstractFactory.parts.engines;

import org.abstractFactoryExample.AbstractFactory.parts.Engine;

public class AudiSportCarEngine implements Engine {
    @Override
    public String toString() {
        return ("Twin-turbocharged 4.0-liter V-8 Audi Sport Car engine, which generates 591 horsepower and 590 pound-feet of torque.");
    }
}
