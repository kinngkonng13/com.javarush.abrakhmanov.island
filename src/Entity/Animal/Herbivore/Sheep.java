package Entity.Animal.Herbivore;

import Entity.Animal.Animal;
import Setting.SettingsAnimal;

import java.util.concurrent.ThreadLocalRandom;

public class Sheep extends Animal {

    public Sheep() {
        super.setSymbol(SettingsAnimal.SYMBOL_SHEEP);
        super.setWeight(SettingsAnimal.WEIGHT_SHEEP);
        super.setMaxSpeed(SettingsAnimal.MAX_SPEED_SHEEP);
        super.setMaxSatiety(SettingsAnimal.MAX_SATIETY_SHEEP);
        super.setCountOnOneCell(SettingsAnimal.COUNT_SHEEP_ON_ONE_CELL);
        super.setActualSatiety(SettingsAnimal.ACTUAL_SATIETY_SHEEP);
        super.setRandomAdvent(ThreadLocalRandom.current().nextInt(100));
    }
}
