package Entity.Animal.Predator;

import Entity.Animal.Animal;
import Setting.SettingsAnimal;

import java.util.concurrent.ThreadLocalRandom;

public class Eagle extends Animal {
    public Eagle() {
        super.setSymbol(SettingsAnimal.SYMBOL_EAGLE);
        super.setWeight(SettingsAnimal.WEIGHT_EAGLE);
        super.setMaxSpeed(SettingsAnimal.MAX_SPEED_EAGLE);
        super.setMaxSatiety(SettingsAnimal.MAX_SATIETY_EAGLE);
        super.setActualSatiety(SettingsAnimal.ACTUAL_SATIETY_EAGLE);
        super.setCountOnOneCell(SettingsAnimal.COUNT_EAGLE_ON_ONE_CELL);
        super.setProbabilityEaten(SettingsAnimal.PROBABILITY_BEING_EATEN_EAGLE);
        super.setRandomAdvent(ThreadLocalRandom.current().nextInt(100));
    }
}
