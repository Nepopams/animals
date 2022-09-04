package com.company.entities.animals.impl;


import com.company.PropertiesIsland;
import com.company.entities.animals.Herbivorous;

import java.util.concurrent.ThreadLocalRandom;

// кабан
public class Boar extends Herbivorous {

    public Boar() {
        weight = ThreadLocalRandom.current().nextInt(PropertiesIsland.getWeightBoar());
        maxPopulationToSpawn = PropertiesIsland.getMaxPopulationToSpawnBoar();
    }
    public static String icon = PropertiesIsland.getBoarIcon();

    @Override
    public String getKind() {
        return "boar";
    }
}
