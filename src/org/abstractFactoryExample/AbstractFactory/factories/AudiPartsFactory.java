package org.abstractFactoryExample.AbstractFactory.factories;

import org.abstractFactoryExample.AbstractFactory.cars.CarType;
import org.abstractFactoryExample.AbstractFactory.parts.*;
import org.abstractFactoryExample.AbstractFactory.parts.bodies.*;
import org.abstractFactoryExample.AbstractFactory.parts.engines.*;
import org.abstractFactoryExample.AbstractFactory.parts.others.*;
import org.abstractFactoryExample.AbstractFactory.parts.suspensions.AudiMultiLinkSuspension;
import org.abstractFactoryExample.AbstractFactory.parts.transmissions.*;


public class AudiPartsFactory implements PartsFactory {
    @Override
    public Engine createEngine(CarType carType) {
        switch (carType) {
            case SEDAN:
                return new AudiSedanEngine();
            case SPORT_CAR:
                return new AudiSportCarEngine();
            case SUV:
                return new AudiSuvEngine();
        }
        return null;
    }

    @Override
    public Suspension createSuspension(CarType carType) {
        return new AudiMultiLinkSuspension();
    }


    @Override
    public Body createBody(CarType carType) {
        switch (carType) {
            case SEDAN:
                return new AudiSedanBody();
            case SPORT_CAR:
                return new AudiSportCarBody();
            case SUV:
                return new AudiSuvBody();
        }
        return null;
    }

    @Override
    public Transmission createTransmission(CarType carType) {
        switch (carType) {
            case SEDAN:
                return new AudiSevenSpeedAutomaticTransmission();
            case SPORT_CAR:
                return new AudiEightSpeedAutomaticTransmission();
            case SUV:
                return new AudiEightSpeedAutomaticTransmission();
        }
        return null;
    }

    @Override
    public Winch createWinch() {
        return new AudiWinch();
    }

    @Override
    public Wing createWing() {
        return new AudiSportWing();
    }
}
