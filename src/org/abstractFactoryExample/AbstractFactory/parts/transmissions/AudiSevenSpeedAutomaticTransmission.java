package org.abstractFactoryExample.AbstractFactory.parts.transmissions;

import org.abstractFactoryExample.AbstractFactory.parts.Transmission;

public class AudiSevenSpeedAutomaticTransmission implements Transmission {
    @Override
    public String toString() {
        return ("Audi seven-speed automatic transmission");
    }
}
