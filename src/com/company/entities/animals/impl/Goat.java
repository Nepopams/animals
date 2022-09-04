package com.company.entities.animals.impl;


import com.company.PropertiesIsland;
import com.company.entities.animals.Herbivorous;

import java.util.concurrent.ThreadLocalRandom;

// козел
public class Goat extends Herbivorous {
    public static String icon = PropertiesIsland.getGoatIcon();

    public Goat() {
        weight = ThreadLocalRandom.current().nextInt(PropertiesIsland.getWeightGoat());
        maxPopulationToSpawn = PropertiesIsland.getMaxPopulationToSpawnGoat();
    }

    @Override
    public String getKind() {
        return "goat";
    }
}
