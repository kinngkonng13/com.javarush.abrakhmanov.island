package Entity.Animal.Predator;

import Entity.Animal.Animals;
import Setting.SettingsAnimals;

import java.util.concurrent.ThreadLocalRandom;

public class Bear extends Animals {
    public Bear() {
        super.setSymbol(SettingsAnimals.SYMBOL_BEAR);
        super.setWeight(SettingsAnimals.WEIGHT_BEAR);
        super.setMaxSpeed(SettingsAnimals.MAX_SPEED_BEAR);
        super.setMaxSatiety(SettingsAnimals.MAX_SATIETY_BEAR);
        super.setActualSatiety(SettingsAnimals.ACTUAL_SATIETY_BEAR);
        super.setCountOnOneCell(SettingsAnimals.COUNT_BEAR_ON_ONE_CELL);
        super.setProbabilityEaten(SettingsAnimals.PROBABILITY_BEING_EATEN_BEAR);
        super.setRandomAdvent(ThreadLocalRandom.current().nextInt(0, 2));
        super.setRandomCount(ThreadLocalRandom.current().nextInt(SettingsAnimals.COUNT_BEAR_ON_ONE_CELL + 1));

    }
}
