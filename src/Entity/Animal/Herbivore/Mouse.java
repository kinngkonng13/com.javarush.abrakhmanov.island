package Entity.Animal.Herbivore;

import Entity.Animal.Animal;
import Setting.SettingsAnimal;

import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Mouse extends Animal {

    public Mouse() {
        super.setSymbol(SettingsAnimal.SYMBOL_MOUSE);
        super.setWeight(SettingsAnimal.WEIGHT_MOUSE);
        super.setMaxSpeed(SettingsAnimal.MAX_SPEED_MOUSE);
        super.setMaxSatiety(SettingsAnimal.MAX_SATIETY_MOUSE);
        super.setCountOnOneCell(SettingsAnimal.COUNT_MOUSE_ON_ONE_CELL);
        super.setActualSatiety(SettingsAnimal.ACTUAL_SATIETY_MOUSE);
        super.setChanceEatCaterpillar(SettingsAnimal.CHANCE_EAT_CATERPILLAR_MOUSE);
        super.setRandomAdvent(ThreadLocalRandom.current().nextInt(100));
    }
}
