package Entity.Animal.Herbivore;

import Entity.Animal.Animals;
import Setting.SettingsAnimals;

import java.util.concurrent.ThreadLocalRandom;

public class Deer extends Animals {

    public Deer() {
        super.setSymbol(SettingsAnimals.SYMBOL_DEER);
        super.setWeight(SettingsAnimals.WEIGHT_DEER);
        super.setMaxSpeed(SettingsAnimals.MAX_SPEED_DEER);
        super.setMaxSatiety(SettingsAnimals.MAX_SATIETY_DEER);
        super.setCountOnOneCell(SettingsAnimals.COUNT_DEER_ON_ONE_CELL);
        super.setActualSatiety(SettingsAnimals.ACTUAL_SATIETY_DEER);
        super.setRandomAdvent(ThreadLocalRandom.current().nextInt(0, 2));
        super.setRandomCount(ThreadLocalRandom.current().nextInt(SettingsAnimals.COUNT_DEER_ON_ONE_CELL + 1));
    }
}
