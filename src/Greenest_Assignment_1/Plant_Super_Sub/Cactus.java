package Greenest_Assignment_1.Plant_Super_Sub;

import Greenest_Assignment_1.Liquid_Type;

/**
 * Subklass till Plant
 */

public class Cactus extends Plant {

    //inkapslad kan inte ändras
    private final Liquid_Type liquid_Type = Liquid_Type.MINERALWATER;

    //konsktruktor
    public Cactus(String plantType, String plantName, double heightOfPlant) {
        super(plantType, plantName, heightOfPlant);
    }

    //polymorfism
    @Override
    public double calculateLiquid(double literPerDay) {
        return 0.2;
    }

    //polymorfism
    @Override
    public String toString() {
        return "Kaktusen " + getPlantName() +
                " behöver: " + calculateLiquid(getHeightOfPlant()) +
                " liter " + liquid_Type.drink + " per dag";
    }
}
