package Entity.Animal.Herbivore;

import Entity.Animal.Animal;
import Setting.SettingsAnimal;

import java.util.concurrent.ThreadLocalRandom;

public class Boar extends Animal {
    private int chanceEatCaterpillarBoar;
    public Boar() {
        super.setSymbol(SettingsAnimal.SYMBOL_BOAR);
        super.setWeight(SettingsAnimal.WEIGHT_BOAR);
        super.setMaxSpeed(SettingsAnimal.MAX_SPEED_BOAR);
        super.setMaxSatiety(SettingsAnimal.MAX_SATIETY_BOAR);
        super.setCountOnOneCell(SettingsAnimal.COUNT_BOAR_ON_ONE_CELL);
        super.setActualSatiety(SettingsAnimal.ACTUAL_SATIETY_BOAR);
        super.setChanceEatCaterpillar(SettingsAnimal.CHANCE_EAT_CATERPILLAR_BOAR);
        super.setRandomAdvent(ThreadLocalRandom.current().nextInt(100));
    }
}
