package Entity.Animal.Herbivore;

import Entity.Animal.Animal;
import Setting.SettingsAnimal;

import java.util.concurrent.ThreadLocalRandom;

public class Goat extends Animal {

    public Goat() {
        super.setSymbol(SettingsAnimal.SYMBOL_GOAT);
        super.setWeight(SettingsAnimal.WEIGHT_GOAT);
        super.setMaxSpeed(SettingsAnimal.MAX_SPEED_GOAT);
        super.setMaxSatiety(SettingsAnimal.MAX_SATIETY_GOAT);
        super.setCountOnOneCell(SettingsAnimal.COUNT_GOAT_ON_ONE_CELL);
        super.setActualSatiety(SettingsAnimal.ACTUAL_SATIETY_GOAT);
        super.setRandomAdvent(ThreadLocalRandom.current().nextInt(100));
    }
}
