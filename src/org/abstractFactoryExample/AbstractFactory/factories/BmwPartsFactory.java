package org.abstractFactoryExample.AbstractFactory.factories;

import org.abstractFactoryExample.AbstractFactory.cars.CarType;
import org.abstractFactoryExample.AbstractFactory.parts.*;
import org.abstractFactoryExample.AbstractFactory.parts.bodies.*;
import org.abstractFactoryExample.AbstractFactory.parts.engines.*;
import org.abstractFactoryExample.AbstractFactory.parts.others.*;
import org.abstractFactoryExample.AbstractFactory.parts.suspensions.*;
import org.abstractFactoryExample.AbstractFactory.parts.transmissions.BmwEightSpeedAutomaticTransmission;


public class BmwPartsFactory implements PartsFactory {
    @Override
    public Engine createEngine(CarType carType) {
        switch (carType) {
            case SEDAN:
                return new BmwSedanEngine();
            case SPORT_CAR:
                return new BmwSportCarEngine();
            case SUV:
                return new BmwSuvEngine();
        }
        return null;
    }

    @Override
    public Suspension createSuspension(CarType carType) {
        switch (carType) {
            case SEDAN:
                return new BmwMultiLinkSuspension();
            case SPORT_CAR:
                return new BmwMultiLinkSuspension();
            case SUV:
                return new BmwDoubleWishboneMultiLinkSuspension();
        }
        return null;
    }


    @Override
    public Body createBody(CarType carType) {
        switch (carType) {
            case SEDAN:
                return new BmwSedanBody();
            case SPORT_CAR:
                return new BmwSportCarBody();
            case SUV:
                return new BmwSuvBody();
        }
        return null;
    }

    @Override
    public Transmission createTransmission(CarType carType) {
        return new BmwEightSpeedAutomaticTransmission();
    }

    @Override
    public Winch createWinch() {
        return new BmwWinch();
    }

    @Override
    public Wing createWing() {
        return new BmwSportWing();
    }
}
