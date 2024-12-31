package Entity.Animal;

import Entity.Island;
import Fabric.AnimalFactory;
import Setting.Cell;
import Setting.Direction;

import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;


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
    private double  maxSatiety;
    private double actualSatiety;
    private int countOnOneCell;
    private Map<String, Integer> probabilityEaten;
    private int chanceEatCaterpillar;
    private int randomAdvent;
    //private Random random = new Random();
    //private int randomCount = random.nextInt(countOnOneCell + 1);
    private int randomCount;

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
        this.actualSatiety = this.actualSatiety - ((actualSatiety * 25.0) / 100.0);
    }

    //Съесть растение
    //plantsArrayList - Лист с растениями
    //Удаляется количество съеденной травы, если не превышен уровень максимальной сытости
    public boolean eat(Cell cell)
    {
        if (actualSatiety >= maxSatiety) return false;
        else {
//            for (int i = 0; i < weight; i++)
//            {
//                plantsArrayList.remove(i);
//            }
            return true;
        }
    }

    //Съесть животное
    //Если актуальная сытость не равна максимальной и не будет больше ее, то удаляем съеденное животное
//    public boolean eat(Cell cell)
//    {
//        if (actualSatiety >= maxSatiety) return false;
//        else
//        {
//            if (actualSatiety + weight > maxSatiety) return false;
//            else
//            {
//                //animals.remove(animal);
//                return true;
//            }
//        }
//
//    }
    // Переместиться в другую локацию
    public void move(Island island)
    {
        
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

        }
    }
    //Смерть
    public void die(Animals animal, Cell cell)
    {
        if (animal == null)
        {
            return;
        }
        else {
            cell.listAnimal.remove(animal);
        }

    }

}
