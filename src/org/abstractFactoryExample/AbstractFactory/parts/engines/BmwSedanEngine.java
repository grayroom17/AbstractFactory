package org.abstractFactoryExample.AbstractFactory.parts.engines;

import org.abstractFactoryExample.AbstractFactory.parts.Engine;

public class BmwSedanEngine implements Engine {
    @Override
    public String toString() {
        return ("Twin-turbocharged 4.4-liter V-8 BMW Sedan engine");
    }
}
