package App;

import Entity.Animal.Herbivore.Herbivore;
import Entity.Animal.Predator.Predator;
import Entity.Island;
import Setting.Cell;
import Setting.Statistic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        Island island = new Island();
        startingSimulation(island);
        CreatingMultithreading creatingMultithreading = new CreatingMultithreading(island);
        creatingMultithreading.islandStartLive();


    }

    public static void startingSimulation(Island island)
    {
        boolean flag = false;
        do {
            IslandInitialization.start(island);
            List<Predator> predatorList = Arrays.stream(island.islandArray).flatMap(Arrays::stream).flatMap(cell -> cell.listAnimal.stream())
                    .filter(c -> c instanceof Predator).map(c -> (Predator) c).toList();
            int sizePredatorSet = new HashSet<Predator>(predatorList).size();

            List<Herbivore> herbivoreList = Arrays.stream(island.islandArray).flatMap(Arrays::stream).flatMap(cell -> cell.listAnimal.stream())
                    .filter(c -> c instanceof Herbivore).map(c -> (Herbivore) c).toList();
            int sizeHerbivoreSet = new HashSet<Herbivore>(herbivoreList).size();
            if (sizeHerbivoreSet < 10 && sizePredatorSet < 5) {
                flag = false;
            }
            else flag = true;
        }while(!flag);
    }
}
