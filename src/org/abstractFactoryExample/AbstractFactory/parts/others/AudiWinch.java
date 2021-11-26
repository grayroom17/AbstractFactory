package org.abstractFactoryExample.AbstractFactory.parts.others;

import org.abstractFactoryExample.AbstractFactory.parts.Winch;

public class AudiWinch implements Winch {
    @Override
    public String toString() {
        return ("Audi standard winch for SUV");
    }
}
