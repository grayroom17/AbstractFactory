package org.abstractFactoryExample.AbstractFactory.parts.engines;

import org.abstractFactoryExample.AbstractFactory.parts.Engine;

public class AudiSuvEngine implements Engine {
    @Override
    public String toString() {
        return ("Turbocharged 3.0-liter V-6 Audi SUV engine, that uses a 48-volt hybrid system to make 335 horsepower.");
    }
}
