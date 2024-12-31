package Entity.Animal.Predator;

import Entity.Animal.Animals;
import Setting.SettingsAnimals;

import java.util.concurrent.ThreadLocalRandom;

public class Wolf extends Animals {
    public Wolf() {
        super.setSymbol(SettingsAnimals.SYMBOL_WOLF);
        super.setWeight(SettingsAnimals.WEIGHT_WOLF);
        super.setMaxSpeed(SettingsAnimals.MAX_SPEED_WOLF);
        super.setMaxSatiety(SettingsAnimals.MAX_SATIETY_WOLF);
        super.setActualSatiety(SettingsAnimals.ACTUAL_SATIETY_WOLF);
        super.setCountOnOneCell(SettingsAnimals.COUNT_WOLF_ON_ONE_CELL);
        super.setProbabilityEaten(SettingsAnimals.PROBABILITY_BEING_EATEN_WOLF);
        super.setRandomAdvent(ThreadLocalRandom.current().nextInt(0, 2));
        super.setRandomCount(ThreadLocalRandom.current().nextInt(SettingsAnimals.COUNT_WOLF_ON_ONE_CELL + 1));

    }
}
