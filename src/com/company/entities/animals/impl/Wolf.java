package com.company.entities.animals.impl;

import com.company.PropertiesIsland;
import com.company.entities.animals.Predator;

import java.util.concurrent.ThreadLocalRandom;

// класс "Волк"
public class Wolf extends Predator{
    public static String icon = PropertiesIsland.getWolfIcon();
    public Wolf() {
        weight = ThreadLocalRandom.current().nextInt(PropertiesIsland.getWeightWolf());
        maxPopulationToSpawn = PropertiesIsland.getMaxPopulationToSpawnWolf();
    }

    @Override
    public String getKind() {
        return "wolf";
    }
}
