package App;

import Entity.Animal.Animals;
import Entity.Island;
import Entity.Plant.Plants;
import Setting.Cell;
import Setting.SettingsAnimals;


import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

import static Setting.SettingsAnimals.ALL_ANIMALS;

public class IslandInitialization {
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
        return List.of(new Plants(), new Plants(), new Plants());
    }
}

