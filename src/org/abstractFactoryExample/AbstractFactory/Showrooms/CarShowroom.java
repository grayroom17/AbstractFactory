package org.abstractFactoryExample.AbstractFactory.Showrooms;


import org.abstractFactoryExample.AbstractFactory.Factories.*;
import org.abstractFactoryExample.AbstractFactory.cars.*;


public class CarShowroom {

    public Car orderCar(CarType type) throws InterruptedException {
        Car car = createCar(type);
        car.assemble();
        car.adjust();
        System.out.println("Now your car is ready and you can pick it up at the car showroom.");
        return car;
    }

    private Car createCar(CarType type) throws InterruptedException {
        Car car = null;
        switch (type) {
            case SEDAN:
                car = new Sedan(new AudiSedanFactory());
                break;
            case SPORT_CAR:
                car = new SportCar(new AudiSportCarFactory());
                break;
            case SUV:
                car = new Suv(new AudiSuvFactory());
                break;
        }

        car.createParts();
        return car;
    }
}
