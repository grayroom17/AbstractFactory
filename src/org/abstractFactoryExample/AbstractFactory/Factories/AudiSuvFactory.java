package org.abstractFactoryExample.AbstractFactory.Factories;


import org.abstractFactoryExample.AbstractFactory.parts.*;
import org.abstractFactoryExample.AbstractFactory.parts.bodies.AudiSuvBody;
import org.abstractFactoryExample.AbstractFactory.parts.engines.AudiSuvEngine;
import org.abstractFactoryExample.AbstractFactory.parts.others.AudiWinch;
import org.abstractFactoryExample.AbstractFactory.parts.suspensions.AudiMultiLinkSuspension;
import org.abstractFactoryExample.AbstractFactory.parts.transmissions.AudiEightSpeedAutomaticTransmission;

public class AudiSuvFactory implements AbstractCarFactory {


    @Override
    public Engine createEngine() {
        return new AudiSuvEngine();
    }

    @Override
    public Suspension createSuspension() {
        return new AudiMultiLinkSuspension();
    }

    @Override
    public Body createBody() {
        return new AudiSuvBody();
    }

    @Override
    public Transmission createTransmission() {
        return new AudiEightSpeedAutomaticTransmission();
    }

    @Override
    public Winch createWinch() {
        return new AudiWinch();
    }

    @Override
    public Wing createWing() {
        return null;
    }
}
