package com.company;

import com.company.islands.Island;
import com.company.scheduler.PlantTask;
import com.company.scheduler.StatisticTask;
import com.company.scheduler.TaskScheduler;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Executor {

    public void execute(Island island){
        ScheduledExecutorService executorService = java.util.concurrent.Executors.newScheduledThreadPool(2);
        executorService.scheduleAtFixedRate(new PlantTask(island), 0, 20, TimeUnit.SECONDS);
        executorService.scheduleAtFixedRate(new StatisticTask(island), 0, 10, TimeUnit.SECONDS);
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(PropertiesIsland.getNumberOfThreads());
        fixedThreadPool.submit(new TaskScheduler(island));
    }
}
