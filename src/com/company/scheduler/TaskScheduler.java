package com.company.scheduler;

import com.company.PropertiesIsland;
import com.company.islands.Area;
import com.company.islands.Island;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class TaskScheduler implements Runnable{


    private final Island island;
    private final Queue<Task> tasks = new ConcurrentLinkedQueue<>();

    public TaskScheduler
            (Island island) {
        this.island = island;
    }
    @Override
    public void run() {
        for (int x = 0; x < PropertiesIsland.getSizeHorizontal(); x++) {
            for (int y = 0; y < PropertiesIsland.getSizeVertical(); y++) {
                Area area = island.getareaByCoordinates(x, y);
                if (area != null) {
                    area.getLock().lock();
                    try {
                        tasks.add(new Task(island, x, y));
                    } finally {
                        area.getLock().unlock();
                    }
                }
                tasks.forEach(Task::work);
                tasks.clear();
            }
        }
    }
}
