package Entity.Animal.Herbivore;

import Entity.Animal.Animal;
import Setting.SettingsAnimal;

import java.util.concurrent.ThreadLocalRandom;

public class Caterpillar extends Animal {

    public Caterpillar() {
        super.setSymbol(SettingsAnimal.SYMBOL_CATERPILLAR);
        super.setWeight(SettingsAnimal.WEIGHT_CATERPILLAR);
        super.setMaxSpeed(SettingsAnimal.MAX_SPEED_CATERPILLAR);
        super.setMaxSatiety(SettingsAnimal.MAX_SATIETY_CATERPILLAR);
        super.setCountOnOneCell(SettingsAnimal.COUNT_CATERPILLAR_ON_ONE_CELL);
        super.setActualSatiety(SettingsAnimal.ACTUAL_SATIETY_CATERPILLAR);
        super.setRandomAdvent(ThreadLocalRandom.current().nextInt(100));
    }
}
