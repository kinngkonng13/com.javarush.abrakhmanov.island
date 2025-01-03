package Entity.Animal.Herbivore;

import Entity.Animal.Animals;
import Setting.SettingsAnimals;
import Setting.SettingsIsland;

import java.util.concurrent.ThreadLocalRandom;

public class Horse extends Herbivore {

    public Horse() {
        super.setSymbol(SettingsAnimals.SYMBOL_HORSE);
        super.setWeight(SettingsAnimals.WEIGHT_HORSE);
        super.setMaxSpeed(SettingsAnimals.MAX_SPEED_HORSE);
        super.setMaxSatiety(SettingsAnimals.MAX_SATIETY_HORSE);
        super.setCountOnOneCell(SettingsAnimals.COUNT_HORSE_ON_ONE_CELL);
        super.setActualSatiety(SettingsAnimals.ACTUAL_SATIETY_HORSE);
        super.setRandomAdvent(ThreadLocalRandom.current().nextInt(0, SettingsIsland.getChanceCreating() + 1));
        super.setRandomCount(ThreadLocalRandom.current().nextInt(SettingsAnimals.COUNT_HORSE_ON_ONE_CELL + 1));

    }
}
