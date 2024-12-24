package Entity.Animal.Herbivore;

import Entity.Animal.Animal;
import Setting.SettingsAnimal;

import java.util.concurrent.ThreadLocalRandom;

public class Duck extends Animal {

    public Duck() {
        super.setSymbol(SettingsAnimal.SYMBOL_DUCK);
        super.setWeight(SettingsAnimal.WEIGHT_DUCK);
        super.setMaxSpeed(SettingsAnimal.MAX_SPEED_DUCK);
        super.setMaxSatiety(SettingsAnimal.MAX_SATIETY_DUCK);
        super.setCountOnOneCell(SettingsAnimal.COUNT_DUCK_ON_ONE_CELL);
        super.setActualSatiety(SettingsAnimal.ACTUAL_SATIETY_DUCK);
        super.setChanceEatCaterpillar(SettingsAnimal.CHANCE_EAT_CATERPILLAR_DUCK);
        super.setRandomAdvent(ThreadLocalRandom.current().nextInt(100));
    }
}
