package Entity.Animal.Predator;

import Entity.Animal.Animal;
import Setting.SettingsAnimal;

import java.util.concurrent.ThreadLocalRandom;

public class Boa extends Animal {
    public Boa() {
        super.setSymbol(SettingsAnimal.SYMBOL_BOA);
        super.setWeight(SettingsAnimal.WEIGHT_BOA);
        super.setMaxSpeed(SettingsAnimal.MAX_SPEED_BOA);
        super.setMaxSatiety(SettingsAnimal.MAX_SATIETY_BOA);
        super.setActualSatiety(SettingsAnimal.ACTUAL_SATIETY_BOA);
        super.setCountOnOneCell(SettingsAnimal.COUNT_BOA_ON_ONE_CELL);
        super.setProbabilityEaten(SettingsAnimal.PROBABILITY_BEING_EATEN_BOA);
        super.setRandomAdvent(ThreadLocalRandom.current().nextInt(100));
    }
}
