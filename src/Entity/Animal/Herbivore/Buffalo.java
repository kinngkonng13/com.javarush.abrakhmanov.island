package Entity.Animal.Herbivore;

import Entity.Animal.Animals;
import Setting.SettingsAnimals;

import java.util.concurrent.ThreadLocalRandom;

public class Buffalo extends Animals {

    public Buffalo() {
        super.setSymbol(SettingsAnimals.SYMBOL_BUFFALO);
        super.setWeight(SettingsAnimals.WEIGHT_BUFFALO);
        super.setMaxSpeed(SettingsAnimals.MAX_SPEED_BUFFALO);
        super.setMaxSatiety(SettingsAnimals.MAX_SATIETY_BUFFALO);
        super.setCountOnOneCell(SettingsAnimals.COUNT_BUFFALO_ON_ONE_CELL);
        super.setActualSatiety(SettingsAnimals.ACTUAL_SATIETY_BUFFALO);
        super.setRandomAdvent(ThreadLocalRandom.current().nextInt(0, 2));
        super.setRandomCount(ThreadLocalRandom.current().nextInt(SettingsAnimals.COUNT_BUFFALO_ON_ONE_CELL + 1));
    }
}
