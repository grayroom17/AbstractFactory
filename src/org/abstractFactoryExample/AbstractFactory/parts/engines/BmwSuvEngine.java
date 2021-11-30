package org.abstractFactoryExample.AbstractFactory.parts.engines;

import org.abstractFactoryExample.AbstractFactory.parts.Engine;

public class BmwSuvEngine implements Engine {
    @Override
    public String toString() {
        return ("Twin-turbo 4.4-liter V-8 BMW SUV engine, that makes 523 horses.");
    }
}
