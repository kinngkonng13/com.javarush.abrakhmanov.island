package Entity.Animal.Herbivore;

import Entity.Animal.Animals;
import Setting.SettingsAnimals;

import java.util.concurrent.ThreadLocalRandom;

public class Caterpillar extends Animals {

    public Caterpillar() {
        super.setSymbol(SettingsAnimals.SYMBOL_CATERPILLAR);
        super.setWeight(SettingsAnimals.WEIGHT_CATERPILLAR);
        super.setMaxSpeed(SettingsAnimals.MAX_SPEED_CATERPILLAR);
        super.setMaxSatiety(SettingsAnimals.MAX_SATIETY_CATERPILLAR);
        super.setCountOnOneCell(SettingsAnimals.COUNT_CATERPILLAR_ON_ONE_CELL);
        super.setActualSatiety(SettingsAnimals.ACTUAL_SATIETY_CATERPILLAR);
        super.setRandomAdvent(ThreadLocalRandom.current().nextInt(0, 2));
        super.setRandomCount(ThreadLocalRandom.current().nextInt(SettingsAnimals.COUNT_CATERPILLAR_ON_ONE_CELL + 1));
    }
}
