package org.abstractFactoryExample.AbstractFactory.showrooms;

import org.abstractFactoryExample.AbstractFactory.factories.*;
import org.abstractFactoryExample.AbstractFactory.cars.*;

public class AudiCarShowroom extends CarShowroom {
    @Override
    protected Car createCar(CarType type) throws InterruptedException {
        Car car = null;
        PartsFactory factory = new AudiPartsFactory();
        switch (type) {
            case SEDAN:
                car = new Sedan(factory);
                car.setModel("Audi A5");
                break;
            case SPORT_CAR:
                car = new SportCar(factory);
                car.setModel("Audi RS6");
                break;
            case SUV:
                car = new Suv(factory);
                car.setModel("Audi Q7");
                break;
        }

        car.createParts();
        return car;
    }
}
