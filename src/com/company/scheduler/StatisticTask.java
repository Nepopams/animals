package com.company.scheduler;

import com.company.islands.Island;

public class StatisticTask implements Runnable {
    private final Island island;
    public StatisticTask(Island island) {
        this.island = island;
    }

    @Override
    public void run() {
        island.print();
    }
}
