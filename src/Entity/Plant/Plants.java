package Entity.Plant;

public class Plants {
    private static int weight = 1;

    public static int weightPlant = 1;
    public static int maxCountPlant = 200;

    public static double getWeight() {
        return weight;
    }

    public static void setWeight(int weight) {
        Plants.weight = weight;
    }

    public static double getWeightPlant() {
        return weightPlant;
    }

    public static void setWeightPlant(int weightPlant) {
        Plants.weightPlant = weightPlant;
    }
}
