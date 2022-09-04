package com.company.entities.animals.impl;

import com.company.Direction;
import com.company.PropertiesIsland;
import com.company.entities.animals.CanFly;
import com.company.entities.animals.Predator;

import java.util.concurrent.ThreadLocalRandom;

// класс "Орел"
public class Eagle extends Predator implements CanFly {
    public Eagle() {
        weight = ThreadLocalRandom.current().nextInt(PropertiesIsland.getWeightEagle());
        maxPopulationToSpawn = PropertiesIsland.getMaxPopulationToSpawnEagle();
    }
    public static String icon = PropertiesIsland.getEagleIcon();


    @Override
    public String getKind() {
        return "eagle";
    }

    @Override
    public void fly(Direction direction) {

    }
}
