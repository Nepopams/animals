package com.company.entities.animals.impl;


import com.company.PropertiesIsland;
import com.company.entities.animals.Herbivorous;

import java.util.concurrent.ThreadLocalRandom;

// гусеница
public class Caterpillar extends Herbivorous {
    public static String icon = PropertiesIsland.getCaterpillarIcon();
    private float weight;
    public Caterpillar() {
        weight = ThreadLocalRandom.current().nextInt(2) + ThreadLocalRandom.current().nextFloat();
        maxPopulationToSpawn = PropertiesIsland.getMaxPopulationToSpawnCaterpillar();
    }

    @Override
    public String getKind() {
        return "caterpillar";
    }
}
