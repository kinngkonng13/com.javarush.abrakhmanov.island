package Entity.Animal.Predator;

import Entity.Animal.Animals;
import Setting.SettingsAnimals;

import java.util.concurrent.ThreadLocalRandom;

public class Boa extends Animals {
    public Boa() {
        super.setSymbol(SettingsAnimals.SYMBOL_BOA);
        super.setWeight(SettingsAnimals.WEIGHT_BOA);
        super.setMaxSpeed(SettingsAnimals.MAX_SPEED_BOA);
        super.setMaxSatiety(SettingsAnimals.MAX_SATIETY_BOA);
        super.setActualSatiety(SettingsAnimals.ACTUAL_SATIETY_BOA);
        super.setCountOnOneCell(SettingsAnimals.COUNT_BOA_ON_ONE_CELL);
        super.setProbabilityEaten(SettingsAnimals.PROBABILITY_BEING_EATEN_BOA);
        super.setRandomAdvent(ThreadLocalRandom.current().nextInt(0, 2));
        super.setRandomCount(ThreadLocalRandom.current().nextInt(SettingsAnimals.COUNT_BOA_ON_ONE_CELL + 1));

    }
}
