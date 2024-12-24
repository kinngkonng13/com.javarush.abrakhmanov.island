package Entity.Animal.Herbivore;

import Entity.Animal.Animal;
import Setting.SettingsAnimal;

import java.util.concurrent.ThreadLocalRandom;

public class Deer extends Animal {

    public Deer() {
        super.setSymbol(SettingsAnimal.SYMBOL_DEER);
        super.setWeight(SettingsAnimal.WEIGHT_DEER);
        super.setMaxSpeed(SettingsAnimal.MAX_SPEED_DEER);
        super.setMaxSatiety(SettingsAnimal.MAX_SATIETY_DEER);
        super.setCountOnOneCell(SettingsAnimal.COUNT_DEER_ON_ONE_CELL);
        super.setActualSatiety(SettingsAnimal.ACTUAL_SATIETY_DEER);
        super.setRandomAdvent(ThreadLocalRandom.current().nextInt(100));
    }
}
