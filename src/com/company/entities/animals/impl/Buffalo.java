package com.company.entities.animals.impl;


import com.company.PropertiesIsland;
import com.company.entities.animals.Herbivorous;

import java.util.concurrent.ThreadLocalRandom;

// бык
public class Buffalo extends Herbivorous {

    public static String icon = PropertiesIsland.getBuffaloIcon();

    public Buffalo() {
        weight = ThreadLocalRandom.current().nextInt(PropertiesIsland.getWeightBuffalo());
        maxPopulationToSpawn = PropertiesIsland.getMaxPopulationToSpawnBuffalo();
    }

    @Override
    public String getKind() {
        return "buffalo";
    }
}
