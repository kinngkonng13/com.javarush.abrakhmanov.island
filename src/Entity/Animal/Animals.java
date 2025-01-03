package Entity.Animal;

import Entity.Island;
import Fabric.AnimalFactory;
import Setting.Cell;
import Setting.Direction;

import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public abstract class Animals {
    /*Символ
     * Вес
     * Максимальная скорость
     * Максимальное насыщение
     * Фактическая сытость
     * Количество животных на одной клетке
     * Вероятности съедения животного
     * Шанс съедения гусеницы
     * Шанс появления при инициализации острова
     * Шанс заселения на ячейку*/
    private double weight;
    private int maxSpeed;
    protected double  maxSatiety;
    protected double actualSatiety;
    private int countOnOneCell;
    private Map<String, Integer> probabilityEaten;
    private int chanceEatCaterpillar;
    private int randomAdvent;
    private int randomCount;
    Lock lock = new ReentrantLock();

    public void setRandomCount(int randomCount) {
        this.randomCount = randomCount;
    }

    //Геттеры
    public double getWeight() {
        return weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getMaxSatiety() {
        return maxSatiety;
    }

    public double getActualSatiety() {
        return actualSatiety;
    }

    public int getCountOnOneCell() {
        return countOnOneCell;
    }

    public Map<String, Integer> getProbabilityEaten() {
        return probabilityEaten;
    }

    public int getChanceEatCaterpillar() {
        return chanceEatCaterpillar;
    }

    public int getRandomAdvent() {
        return randomAdvent;
    }

    public int getRandomCount() {
        return randomCount;
    }

    //Сеттеры
    public void setProbabilityEaten(Map<String, Integer> probabilityBeingEatenWolf) {
        this.probabilityEaten = probabilityBeingEatenWolf;
    }

    public void setCountOnOneCell(int countOnOneCell) {
        countOnOneCell = countOnOneCell;
    }

    public void setActualSatiety(double actualSatiety) {
        this.actualSatiety = actualSatiety;
    }

    public void setMaxSatiety(double maxSatiety) {
        this.maxSatiety = maxSatiety;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSymbol(String symbol) {
    }

    public void setChanceEatCaterpillar(int chanceEatCaterpillar) {
        this.chanceEatCaterpillar = chanceEatCaterpillar;
    }

    public void setRandomAdvent(int randomAdvent) {
        this.randomAdvent = randomAdvent;
    }

    //Уменьшение значения поля текущей сытости
    //Уменьшение сытости на 25%
    public void worker()
    {
        lock.lock();
        this.actualSatiety = this.actualSatiety - (actualSatiety * 0.25);
        lock.unlock();
    }

    //Съесть растение
    //plantsArrayList - Лист с растениями
    //Удаляется количество съеденной травы, если не превышен уровень максимальной сытости
    public boolean eat(Cell cell)
    {
        if (actualSatiety >= maxSatiety) return false;
        else {
            return true;
        }
    }

    // Переместиться в другую локацию
    public void move(Island island)
    {
        lock.lock();
        try {
            Cell[][] islandArrays = island.islandArray;
            for (int i = 0; i < islandArrays.length; i++) {
                for (int j = 0; j < islandArrays.length; j++) {
                    if (islandArrays[i][j].listAnimal.contains(this)) {
                        int randomStep = ThreadLocalRandom.current().nextInt(0, this.maxSpeed + 1);
                        int randomDirection = ThreadLocalRandom.current().nextInt(1, 9);
                        int newI = i;
                        int newJ = j;
                        switch (randomDirection) {
                            case 1 -> newI -= randomStep; // Вверх
                            case 2 -> {
                                newI -= randomStep;
                                newJ += randomStep;
                            } // Вверх вправо
                            case 3 -> newJ += randomStep; // Вправо
                            case 4 -> {
                                newI += randomStep;
                                newJ += randomStep;
                            } // Вниз вправо
                            case 5 -> newI += randomStep; // Вниз
                            case 6 -> {
                                newI += randomStep;
                                newJ -= randomStep;
                            } // Вниз влево
                            case 7 -> newJ -= randomStep; // Влево
                            case 8 -> {
                                newI -= randomStep;
                                newJ -= randomStep;
                            } // Вверх влево
                        }
                        newI = (newI + islandArrays.length) % islandArrays.length;
                        newJ = (newJ + islandArrays[i].length) % islandArrays[i].length;
                        int sizeAnimal = islandArrays[newI][newJ].listAnimal.stream().filter(animal -> this.getClass()
                                .equals(animal.getClass())).toList().size();
                        if (sizeAnimal >= this.countOnOneCell) {
                            return;
                        }
                        islandArrays[newI][newJ].listAnimal.add(this);
                        islandArrays[i][j].listAnimal.remove(this);
                        return;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
        } finally {
            lock.unlock();
        }
    }

    //Выбрать направление
    // Рандомно выбирается направление движения животного
    public Direction chooseDirection()
    {
        final int ORIGIN = 1;
        final int BOUND = 4;
        Direction direction = null;
        int chooseDirectionRandom = ThreadLocalRandom.current().nextInt(ORIGIN, BOUND + 1);
        switch (chooseDirectionRandom)
        {
            case 1:
                direction = Direction.UP;
                break;
            case 2:
                direction = Direction.RIGHT;
                break;
            case 3:
                direction = Direction.DOWN;
                break;
            case 4:
                direction = Direction.LEFT;
                break;
        }
        return direction;
    }
    //Размножение
    public void reproduce(Cell cell)
    {
        lock.lock();
        try {
            CopyOnWriteArrayList<Animals> listAnimal = cell.listAnimal;
            int randomNum = ThreadLocalRandom.current().nextInt(1, 101);
            if (randomNum >= 10) {
                int sizeIndividual = listAnimal.stream().filter(count -> this.getClass()
                        .equals(count.getClass())).toList().size();
                if (sizeIndividual < 2) {
                    return;
                }
                if (sizeIndividual >= countOnOneCell) {
                    return;
                }
                String simpleName = this.getClass().getSimpleName();
                listAnimal.add(AnimalFactory.giveBirthAnimal(simpleName));
            }
        } finally {
            lock.unlock();
        }
    }
    //Смерть
    public void die(Animals animal, Cell cell)
    {
        lock.lock();
        try {
            if (this.actualSatiety <= 0) {
                cell.listAnimal.remove(animal);
            }
        } finally {
            lock.unlock();
        }

    }

}
