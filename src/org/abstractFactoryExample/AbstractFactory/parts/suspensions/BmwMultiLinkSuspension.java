package org.abstractFactoryExample.AbstractFactory.parts.suspensions;

import org.abstractFactoryExample.AbstractFactory.parts.Suspension;

public class BmwMultiLinkSuspension implements Suspension {
    @Override
    public String toString() {
        return ("BMW multilink suspension with BMW xDrive all-wheel drive technology.");
    }
}
