package Greenest_Assignment_1.Plant_Super_Sub;

import Greenest_Assignment_1.Liquid_Type;

public class Cactus extends Plant {

    Liquid_Type liquid_Type = Liquid_Type.MINERALWATER;

    public Cactus(String plantType, String plantName, double heightOfPlant) {
        super(plantType, plantName, heightOfPlant);
    }

    @Override
    public double calculateLiquid(double literPerDay) {
        return 0.2;
    }

    @Override
    public String toString() {
        return "Kaktusen " + getPlantName() +
                " behöver: " + calculateLiquid(getHeightOfPlant()) +
                " liter " + liquid_Type.drink + " per dag";
    }
}
