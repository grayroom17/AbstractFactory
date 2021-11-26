package org.abstractFactoryExample.AbstractFactory.Factories;


import org.abstractFactoryExample.AbstractFactory.parts.*;
import org.abstractFactoryExample.AbstractFactory.parts.bodies.AudiSedanBody;
import org.abstractFactoryExample.AbstractFactory.parts.engines.AudiSedanEngine;
import org.abstractFactoryExample.AbstractFactory.parts.suspensions.AudiMultiLinkSuspension;
import org.abstractFactoryExample.AbstractFactory.parts.transmissions.AudiSevenSpeedAutomaticTransmission;

public class AudiSedanFactory implements AbstractCarFactory {


    @Override
    public Engine createEngine() {
        return new AudiSedanEngine();
    }

    @Override
    public Suspension createSuspension() {
        return new AudiMultiLinkSuspension();
    }

    @Override
    public Body createBody() {
        return new AudiSedanBody();
    }

    @Override
    public Transmission createTransmission() {
        return new AudiSevenSpeedAutomaticTransmission();
    }

    @Override
    public Winch createWinch() {
        return null;
    }

    @Override
    public Wing createWing() {
        return null;
    }
}
