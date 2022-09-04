package com.company.entities.animals.impl;


import com.company.PropertiesIsland;
import com.company.entities.animals.Herbivorous;

import java.util.concurrent.ThreadLocalRandom;

// кролик
public class Rabbit extends Herbivorous {
    public static String icon = PropertiesIsland.getRabbitIcon();
    public Rabbit() {
        weight = ThreadLocalRandom.current().nextInt(PropertiesIsland.getWeightRabbit());
        maxPopulationToSpawn = PropertiesIsland.getMaxPopulationToSpawnRabbit();
    }

    @Override
    public String getKind() {
        return "rabbit";
    }
}
