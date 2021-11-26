package org.abstractFactoryExample.AbstractFactory;


import org.abstractFactoryExample.AbstractFactory.Showrooms.CarShowroom;
import org.abstractFactoryExample.AbstractFactory.cars.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("Welcome to our car showroom!");
        CarShowroom showroom = new CarShowroom();
        CarType type;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("Please, choose the car type you would prefer to buy.\n" +
                        "1 - Sedan\n" +
                        "2 - Sport Car\n" +
                        "3 - SUV");
                try {
                    type = CarType.values()[Integer.parseInt(reader.readLine()) - 1];
                } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    System.out.println("Incorrect input. Try again.");
                    continue;
                }
                break;
            }
        }
        Car car = showroom.orderCar(type);
        System.out.println("Here is your " + car
        + "\nHave a good trip!");
    }
}
