package com.company.entities.animals.impl;


import com.company.PropertiesIsland;
import com.company.entities.animals.Herbivorous;

import java.util.concurrent.ThreadLocalRandom;

// мышь
public class Mouse extends Herbivorous {
    public static String icon = PropertiesIsland.getMouseIcon();
    public Mouse() {
        weight = ThreadLocalRandom.current().nextInt(2) + ThreadLocalRandom.current().nextFloat();
        maxPopulationToSpawn = PropertiesIsland.getMaxPopulationToSpawnMouse();
    }
    private float weight;

    @Override
    public String getKind() {
        return "mouse";
    }
}
