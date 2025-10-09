package Greenest_Assignment_1.Plant_Super_Sub;

import Greenest_Assignment_1.Liquid_Type;

/**
 * Subklass till Plant
 */

public class Carnivorous_Plant extends Plant {

    private final Liquid_Type liquid_Type = Liquid_Type.PROTEINDRINK;

    //konsktruktor
    public Carnivorous_Plant (String plantType, String plantName, double heightOfPlant) {
        super(plantType, plantName, heightOfPlant);
    }

    //polymorfism, räknar ut hur mycket vätska
    @Override
    public double calculateLiquid(double literPerDay) {
        double liquidProtein = 0.2;
        double liter = 0.1;
        literPerDay = liter + (liquidProtein * getHeightOfPlant());
        return literPerDay;
    }

    //polymorfism
    @Override
    public String toString(){
        return "Köttätande växten " + getPlantName() +
                " behöver: " + calculateLiquid(getHeightOfPlant()) +
                " liter " + liquid_Type.drink + " per dag";
    }
}
