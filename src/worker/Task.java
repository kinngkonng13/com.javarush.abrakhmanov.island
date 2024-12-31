package worker;

import Entity.Animal.Animals;
import Entity.Island;
import Setting.Cell;

public class Task {
    private final Animals animal;
    private final Cell cell;
    private final Island island;

    public Task(Animals animal, Cell cell, Island island) {
        this.animal = animal;
        this.cell = cell;
        this.island = island;
    }

    public void doTask() {
        animal.worker();
        if (animal.eat(cell)){
            animal.reproduce(cell);
        }
        animal.die(animal, cell);
        animal.move(island);
    }
}


