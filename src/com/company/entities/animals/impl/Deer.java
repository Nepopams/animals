package com.company.entities.animals.impl;


import com.company.PropertiesIsland;
import com.company.entities.animals.Herbivorous;

import java.util.concurrent.ThreadLocalRandom;

// олень
public class Deer extends Herbivorous {
    public static String icon = PropertiesIsland.getDeerIcon();
    public Deer() {
        weight = ThreadLocalRandom.current().nextInt(PropertiesIsland.getWeightDeer());
        maxPopulationToSpawn = PropertiesIsland.getMaxPopulationToSpawnDeer();
    }

    @Override
    public String getKind() {
        return "deer";
    }
}
