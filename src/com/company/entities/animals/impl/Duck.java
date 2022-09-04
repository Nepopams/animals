package com.company.entities.animals.impl;
// утка


import com.company.Direction;
import com.company.PropertiesIsland;
import com.company.entities.animals.CanFly;
import com.company.entities.animals.Herbivorous;

import java.util.concurrent.ThreadLocalRandom;

public class Duck extends Herbivorous implements CanFly {
    public static String icon = PropertiesIsland.getDuckIcon();

    public Duck() {
        weight = ThreadLocalRandom.current().nextInt(2) + ThreadLocalRandom.current().nextFloat();
        maxPopulationToSpawn = PropertiesIsland.getMaxPopulationToSpawnDuck();
    }

    private float weight;
    @Override
    public String getKind() {
        return "duck";
    }

    @Override
    public void fly(Direction direction) {

    }
}
