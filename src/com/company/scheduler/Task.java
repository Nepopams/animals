package com.company.scheduler;

import com.company.islands.Area;
import com.company.islands.Island;

public class Task {

    private final Island island;
    private final Area area;
    public Task(Island island, int x, int y) {
        this.island = island;
        this.area = island.getareaByCoordinates(x, y);
    }
    public void work() {
        if (area.eatAnimals() && area.reproduceAnimals()) {
            if (area.lifeCycleAnimals())
                island.moveAnimalsOnarea(area);
        }
    }
}
