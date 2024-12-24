package Entity.Animal.Herbivore;

import Entity.Animal.Animal;
import Setting.SettingsAnimal;

import java.util.concurrent.ThreadLocalRandom;

public class Buffalo extends Animal {

    public Buffalo() {
        super.setSymbol(SettingsAnimal.SYMBOL_BUFFALO);
        super.setWeight(SettingsAnimal.WEIGHT_BUFFALO);
        super.setMaxSpeed(SettingsAnimal.MAX_SPEED_BUFFALO);
        super.setMaxSatiety(SettingsAnimal.MAX_SATIETY_BUFFALO);
        super.setCountOnOneCell(SettingsAnimal.COUNT_BUFFALO_ON_ONE_CELL);
        super.setActualSatiety(SettingsAnimal.ACTUAL_SATIETY_BUFFALO);
        super.setRandomAdvent(ThreadLocalRandom.current().nextInt(100));
    }
}
