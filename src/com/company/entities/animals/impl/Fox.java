package com.company.entities.animals.impl;

import com.company.PropertiesIsland;
import com.company.entities.animals.Predator;

import java.util.concurrent.ThreadLocalRandom;

// класс "Лиса"
// наследуется от класса "Животное" (Animal)
// имплементирует интерфейс "Хищник"(Predator)
public class Fox extends Predator{
    public Fox() {
        weight = ThreadLocalRandom.current().nextInt(PropertiesIsland.getWeightFox());
        maxPopulationToSpawn = PropertiesIsland.getMaxPopulationToSpawnFox();
    }
    public static String icon = PropertiesIsland.getFoxIcon();

    @Override
    public String getKind() {
        return "fox";
    }
}

