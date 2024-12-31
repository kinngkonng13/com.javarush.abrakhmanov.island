package Entity.Animal.Herbivore;

import Entity.Animal.Animals;
import Setting.SettingsAnimals;

import java.util.concurrent.ThreadLocalRandom;

public class Sheep extends Animals {

    public Sheep() {
        super.setSymbol(SettingsAnimals.SYMBOL_SHEEP);
        super.setWeight(SettingsAnimals.WEIGHT_SHEEP);
        super.setMaxSpeed(SettingsAnimals.MAX_SPEED_SHEEP);
        super.setMaxSatiety(SettingsAnimals.MAX_SATIETY_SHEEP);
        super.setCountOnOneCell(SettingsAnimals.COUNT_SHEEP_ON_ONE_CELL);
        super.setActualSatiety(SettingsAnimals.ACTUAL_SATIETY_SHEEP);
        super.setRandomAdvent(ThreadLocalRandom.current().nextInt(0, 2));
        super.setRandomCount(ThreadLocalRandom.current().nextInt(SettingsAnimals.COUNT_SHEEP_ON_ONE_CELL + 1));

    }
}
