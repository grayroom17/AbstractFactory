package org.abstractFactoryExample.AbstractFactory.showrooms;


import org.abstractFactoryExample.AbstractFactory.cars.*;


public abstract class CarShowroom {

    public Car orderCar(CarType type) throws InterruptedException {
        Car car = createCar(type);
        car.assemble();
        car.adjust();
        System.out.println("Now your car is ready and you can pick it up at the car showroom.");
        return car;
    }

    protected abstract Car createCar(CarType type) throws InterruptedException;
}
