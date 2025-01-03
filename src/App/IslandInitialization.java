package App;

import Entity.Animal.Animals;
import Entity.Animal.Herbivore.Herbivore;
import Entity.Animal.Predator.Predator;
import Entity.Island;
import Entity.Plant.Plants;
import Setting.Cell;
import Setting.SettingsAnimals;


import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

import static Setting.SettingsAnimals.ALL_ANIMALS;


public class IslandInitialization {

    // Метод заполняет ячейки Cell животными и растениями
    public static void start (Island island) {

        for (int i = 0; i < island.islandArray.length; i++) {
            for (int j = 0; j < island.islandArray[i].length; j++) {
                Cell cell = new Cell();
                cell.listPlant.addAll(createPlant());
                for (int k = 0; k < ALL_ANIMALS.length; k++) {
                    cell.listAnimal.addAll(createAnimal(ALL_ANIMALS[k]));
                }
                island.islandArray[i][j] = cell;
            }
        }
    }

    // Создает рандомным образом животных
    public static List<Animals> createAnimal(Animals animal)
    {
        List<Animals> animals = new CopyOnWriteArrayList<>();
        if(animal.getRandomAdvent() == 0);
        else {

            for(int i = 0; i < ThreadLocalRandom.current().nextInt(SettingsAnimals.COUNT_ON_CELL_ALL_ANIMALS[i]); i++)
            {
                animals.add(animal);
            }
        }
        return animals;
    }

    public static List<Plants> createPlant()
    {
        Random random = new Random();
        int randomPlants = random.nextInt(Plants.maxCountPlant);
        List<Plants> plants = new ArrayList<>();
        for (int i = 0; i < randomPlants; i++)
        {
            plants.add(i, new Plants());
        }
        return plants;
    }

}

