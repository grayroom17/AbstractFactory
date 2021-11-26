package org.abstractFactoryExample.AbstractFactory.parts.engines;

import org.abstractFactoryExample.AbstractFactory.parts.Engine;

public class AudiSedanEngine implements Engine {
    @Override
    public String toString() {
        return ("Two turbocharged four-cylinder Audi Sedan engine, which generates 261 horses");
    }
}
