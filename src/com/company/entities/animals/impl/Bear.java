package com.company.entities.animals.impl;

import com.company.PropertiesIsland;
import com.company.entities.animals.Predator;

import java.util.concurrent.ThreadLocalRandom;

// класс "Медведь"
// наследуется от класса "Животное" (Animal)
// имплементирует интерфейс "Хищник"(Predator)
public class Bear extends Predator {


    public Bear() {
        weight = ThreadLocalRandom.current().nextInt(PropertiesIsland.getWeightBear());
        maxPopulationToSpawn = PropertiesIsland.getMaxPopulationToSpawnBear();
    }

    public static String icon = PropertiesIsland.getBearIcon();

    @Override
    public String getKind() {
        return "bear";
    }
}

