package org.abstractFactoryExample.AbstractFactory.parts.transmissions;

import org.abstractFactoryExample.AbstractFactory.parts.Transmission;

public class AudiEightSpeedAutomaticTransmission implements Transmission {
    @Override
    public String toString() {
        return ("Audi eight-speed automatic transmission");
    }
}
