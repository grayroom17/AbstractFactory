package org.abstractFactoryExample.AbstractFactory.parts.transmissions;

import org.abstractFactoryExample.AbstractFactory.parts.Transmission;

public class BmwEightSpeedAutomaticTransmission implements Transmission {
    @Override
    public String toString() {
        return ("BMW eight-speed automatic transmission");
    }
}
