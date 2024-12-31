package Entity.Animal.Herbivore;

import Entity.Animal.Animals;
import Setting.SettingsAnimals;

import java.util.concurrent.ThreadLocalRandom;

public class Rabbit extends Animals {

    public Rabbit() {
        super.setSymbol(SettingsAnimals.SYMBOL_RABBIT);
        super.setWeight(SettingsAnimals.WEIGHT_RABBIT);
        super.setMaxSpeed(SettingsAnimals.MAX_SPEED_RABBIT);
        super.setMaxSatiety(SettingsAnimals.MAX_SATIETY_RABBIT);
        super.setCountOnOneCell(SettingsAnimals.COUNT_RABBIT_ON_ONE_CELL);
        super.setActualSatiety(SettingsAnimals.ACTUAL_SATIETY_RABBIT);
        super.setRandomAdvent(ThreadLocalRandom.current().nextInt(0, 2));
        super.setRandomCount(ThreadLocalRandom.current().nextInt(SettingsAnimals.COUNT_RABBIT_ON_ONE_CELL + 1));

    }
}
