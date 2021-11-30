package org.abstractFactoryExample.AbstractFactory.parts.others;

import org.abstractFactoryExample.AbstractFactory.parts.Wing;

public class BmwSportWing implements Wing {
    @Override
    public String toString() {
        return ("BMW Sport Wing for sport cars");
    }
}
