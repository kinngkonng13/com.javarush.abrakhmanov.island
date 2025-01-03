package App;

import Entity.Island;
import Setting.SettingsAnimals;
import Setting.SettingsIsland;
import Setting.Statistic;
import worker.AnimalWorker;
import worker.PlantsWorker;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CreatingMultithreading {
    private ScheduledExecutorService executorSimulationService;
    private ExecutorService serviceForCreaturesWorker;
    private ScheduledExecutorService executorServicePlant;
    private Island island;

    public CreatingMultithreading(Island island) {
        this.island = island;
        this.executorSimulationService = Executors.newScheduledThreadPool(SettingsIsland.getCountThreadShed());
        this.serviceForCreaturesWorker = Executors.newFixedThreadPool(SettingsIsland.getCountThread());
        this.executorServicePlant = Executors.newScheduledThreadPool(SettingsIsland.getCountThreadShedPlant());
    }

    public void islandStartLive() {
        executorSimulationService.scheduleWithFixedDelay(this::lifeCycle, 0, 1000, TimeUnit.MILLISECONDS);
        executorServicePlant.scheduleWithFixedDelay(new PlantsWorker(island), 0, 800, TimeUnit.MILLISECONDS);
    }

    private void lifeCycle() {
        AnimalWorker animalWorker = new AnimalWorker(island);
        serviceForCreaturesWorker.execute(animalWorker);
        if (Statistic.countNumberAnimal(island) == 0) {
           stopSimulation();
        }
 }

    private void stopSimulation() {
        serviceForCreaturesWorker.shutdown();
        try {
            if (!serviceForCreaturesWorker.awaitTermination(1, TimeUnit.SECONDS)) {
                serviceForCreaturesWorker.shutdownNow();
            }
        } catch (InterruptedException e) {
            serviceForCreaturesWorker.shutdownNow();
        }
        executorSimulationService.shutdown();
        try {
            if (!executorSimulationService.awaitTermination(1, TimeUnit.SECONDS)) {
                executorSimulationService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorSimulationService.shutdownNow();
        }
        try {
            if (!executorServicePlant.awaitTermination(2, TimeUnit.SECONDS)) {
                executorServicePlant.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorServicePlant.shutdownNow();
        }
    }
}
