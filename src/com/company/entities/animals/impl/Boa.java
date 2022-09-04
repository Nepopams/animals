package com.company.entities.animals.impl;

import com.company.PropertiesIsland;
import com.company.entities.animals.Predator;

import java.util.concurrent.ThreadLocalRandom;

// класс "Удав"

public class Boa extends Predator {

    public Boa() {
        weight = ThreadLocalRandom.current().nextInt(PropertiesIsland.getWeightBoa());
        maxPopulationToSpawn = PropertiesIsland.getMaxPopulationToSpawnBoa();
    }
    public static String icon = PropertiesIsland.getBoaIcon();


    @Override
    public String getKind() {
        return "boa";
    }
}
