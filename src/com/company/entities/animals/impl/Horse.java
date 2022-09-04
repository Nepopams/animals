package com.company.entities.animals.impl;

import com.company.PropertiesIsland;
import com.company.entities.animals.Herbivorous;

import java.util.concurrent.ThreadLocalRandom;

// лошадь
public class Horse extends Herbivorous {
    public static String icon = PropertiesIsland.getHorseIcon();
    public Horse() {
        weight = ThreadLocalRandom.current().nextInt(PropertiesIsland.getWeightHorse());
        maxPopulationToSpawn = PropertiesIsland.getMaxPopulationToSpawnHorse();
    }

    @Override
    public String getKind() {
        return "horse";
    }
}
