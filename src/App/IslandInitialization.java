package App;

import Entity.Animal.Animals;
import Entity.Island;
import Entity.Plant.Plants;
import Setting.Cell;
import Setting.SettingsAnimals;


import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import static Setting.SettingsAnimals.ALL_ANIMALS;


public class IslandInitialization {

    // Инициализирует остров, заполняя его ячейки животными и растениями
    public static void start(Island island) {
        for (int i = 0; i < island.islandArray.length; i++) {
            for (int j = 0; j < island.islandArray[i].length; j++) {
                Cell cell = new Cell();
                cell.listPlant.addAll(createPlant());
                for (int k = 0; k < ALL_ANIMALS.length; k++) {
                    cell.listAnimal.addAll(createAnimal(ALL_ANIMALS[k], SettingsAnimals.COUNT_ON_CELL_ALL_ANIMALS[k]));
                }
                island.islandArray[i][j] = cell;
            }
        }
        System.out.println("Остров успешно инициализирован.");
    }

    // Создаёт случайное количество животных указанного типа
    public static List<Animals> createAnimal(Animals prototype, int maxCount) {
        List<Animals> animals = new ArrayList<>();
        for (int i = 0; i < ThreadLocalRandom.current().nextInt(maxCount); i++) {
            try {
                animals.add((Animals) prototype.clone());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        return animals;
    }

    // Создаёт случайное количество растений
    public static List<Plants> createPlant() {
        List<Plants> plants = new ArrayList<>();
        int randomPlants = ThreadLocalRandom.current().nextInt((int) Plants.maxCountPlant);
        for (int i = 0; i < randomPlants; i++) {
            plants.add(new Plants());
        }
        return plants;
    }
}

