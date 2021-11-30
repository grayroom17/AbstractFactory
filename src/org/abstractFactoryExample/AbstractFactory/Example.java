package org.abstractFactoryExample.AbstractFactory;


import org.abstractFactoryExample.AbstractFactory.showrooms.AudiCarShowroom;
import org.abstractFactoryExample.AbstractFactory.showrooms.BmwCarShowroom;
import org.abstractFactoryExample.AbstractFactory.showrooms.CarShowroom;
import org.abstractFactoryExample.AbstractFactory.cars.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("Welcome to our car showroom!");
        CarShowroom showroom;
        CarType type;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {


            while (true) {
                System.out.println("Which car showroom we will go?");
                System.out.println("1 - Audi Showroom\n" +
                        "2 - BMW Showroom");
                try {
                    String input = reader.readLine();
                    if (input.equals("1")) {
                        showroom = new AudiCarShowroom();
                        break;
                    }
                    if (input.equals("2")) {
                        showroom = new BmwCarShowroom();
                        break;
                    } else throw new IllegalArgumentException();
                } catch (IllegalArgumentException illegalArgumentException) {
                    System.out.println("Incorrect input. Try again.");
                }
            }


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
