package Entity.Animal.Predator;

import Entity.Animal.Animal;
import Setting.SettingsAnimal;

import java.util.concurrent.ThreadLocalRandom;

public class Fox extends Animal {
    public Fox() {
        super.setSymbol(SettingsAnimal.SYMBOL_FOX);
        super.setWeight(SettingsAnimal.WEIGHT_FOX);
        super.setMaxSpeed(SettingsAnimal.MAX_SPEED_FOX);
        super.setMaxSatiety(SettingsAnimal.MAX_SATIETY_FOX);
        super.setActualSatiety(SettingsAnimal.ACTUAL_SATIETY_FOX);
        super.setCountOnOneCell(SettingsAnimal.COUNT_FOX_ON_ONE_CELL);
        super.setProbabilityEaten(SettingsAnimal.PROBABILITY_BEING_EATEN_FOX);
        super.setRandomAdvent(ThreadLocalRandom.current().nextInt(100));
    }
}
