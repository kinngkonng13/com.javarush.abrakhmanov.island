package App;

import Entity.Island;
import Setting.Cell;
import Setting.Statistic;

public class App {
    public static void main(String[] args) {
        Island island = new Island();
        IslandInitialization.start(island);
        CreatingMultithreading creatingMultithreading = new CreatingMultithreading(island);
        creatingMultithreading.islandStartLive();

    }
}
