package com.company.scheduler;

import com.company.PropertiesIsland;
import com.company.islands.Island;

public class PlantTask implements Runnable{

    private final Island island;

    public PlantTask(Island island) {
        this.island = island;
    }

    @Override
    public void run() {
        for (int x = 0; x < PropertiesIsland.getSizeHorizontal(); x++) {
            for (int y = 0; y < PropertiesIsland.getSizeVertical(); y++) {
                island.getareaByCoordinates(x, y).plantGrass();
            }
        }
    }
}
