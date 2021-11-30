package org.abstractFactoryExample.AbstractFactory.showrooms;

import org.abstractFactoryExample.AbstractFactory.factories.*;
import org.abstractFactoryExample.AbstractFactory.cars.*;

public class BmwCarShowroom extends CarShowroom {
    @Override
    protected Car createCar(CarType type) throws InterruptedException {
        Car car = null;
        PartsFactory factory = new BmwPartsFactory();
        switch (type) {
            case SEDAN:
                car = new Sedan(factory);
                car.setModel("BMW 5 series");
                break;
            case SPORT_CAR:
                car = new SportCar(factory);
                car.setModel("BMW M5");
                break;
            case SUV:
                car = new Suv(factory);
                car.setModel("BMW X7");
                break;
        }

        car.createParts();
        return car;
    }
}
