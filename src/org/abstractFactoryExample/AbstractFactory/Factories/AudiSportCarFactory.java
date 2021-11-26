package org.abstractFactoryExample.AbstractFactory.Factories;


import org.abstractFactoryExample.AbstractFactory.parts.*;
import org.abstractFactoryExample.AbstractFactory.parts.bodies.AudiSportCarBody;
import org.abstractFactoryExample.AbstractFactory.parts.bodies.AudiSuvBody;
import org.abstractFactoryExample.AbstractFactory.parts.engines.AudiSportCarEngine;
import org.abstractFactoryExample.AbstractFactory.parts.others.AudiSportWing;
import org.abstractFactoryExample.AbstractFactory.parts.suspensions.AudiMultiLinkSuspension;
import org.abstractFactoryExample.AbstractFactory.parts.transmissions.AudiEightSpeedAutomaticTransmission;

public class AudiSportCarFactory implements AbstractCarFactory {


    @Override
    public Engine createEngine() {
        return new AudiSportCarEngine();
    }

    @Override
    public Suspension createSuspension() {
        return new AudiMultiLinkSuspension();
    }

    @Override
    public Body createBody() {
        return new AudiSportCarBody();
    }

    @Override
    public Transmission createTransmission() {
        return new AudiEightSpeedAutomaticTransmission();
    }

    @Override
    public Winch createWinch() {
        return null;
    }

    @Override
    public Wing createWing() {
        return new AudiSportWing();
    }
}
