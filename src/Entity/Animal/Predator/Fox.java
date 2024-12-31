package Entity.Animal.Predator;

import Entity.Animal.Animals;
import Setting.SettingsAnimals;

import java.util.concurrent.ThreadLocalRandom;

public class Fox extends Animals {
    public Fox() {
        super.setSymbol(SettingsAnimals.SYMBOL_FOX);
        super.setWeight(SettingsAnimals.WEIGHT_FOX);
        super.setMaxSpeed(SettingsAnimals.MAX_SPEED_FOX);
        super.setMaxSatiety(SettingsAnimals.MAX_SATIETY_FOX);
        super.setActualSatiety(SettingsAnimals.ACTUAL_SATIETY_FOX);
        super.setCountOnOneCell(SettingsAnimals.COUNT_FOX_ON_ONE_CELL);
        super.setProbabilityEaten(SettingsAnimals.PROBABILITY_BEING_EATEN_FOX);
        super.setRandomAdvent(ThreadLocalRandom.current().nextInt(0, 2));
        super.setRandomCount(ThreadLocalRandom.current().nextInt(SettingsAnimals.COUNT_FOX_ON_ONE_CELL + 1));

    }
}
