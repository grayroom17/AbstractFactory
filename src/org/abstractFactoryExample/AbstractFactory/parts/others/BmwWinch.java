package org.abstractFactoryExample.AbstractFactory.parts.others;

import org.abstractFactoryExample.AbstractFactory.parts.Winch;

public class BmwWinch implements Winch {
    @Override
    public String toString() {
        return ("BMW standard winch for SUV");
    }
}
