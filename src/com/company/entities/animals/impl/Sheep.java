package com.company.entities.animals.impl;

import com.company.PropertiesIsland;
import com.company.entities.animals.Herbivorous;

import java.util.concurrent.ThreadLocalRandom;

// овца
public class Sheep extends Herbivorous {
    public static String icon = PropertiesIsland.getSheepIcon();
    public Sheep() {
        weight = ThreadLocalRandom.current().nextInt(PropertiesIsland.getWeightSheep());
        maxPopulationToSpawn = PropertiesIsland.getMaxPopulationToSpawnSheep();
    }

    @Override
    public String getKind() {
        return "sheep";
    }
}
