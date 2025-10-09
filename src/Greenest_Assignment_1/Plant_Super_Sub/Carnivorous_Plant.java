package Greenest_Assignment_1.Plant_Super_Sub;

import Greenest_Assignment_1.Liquid_Type;

public class Carnivorous_Plant extends Plant {

    private final Liquid_Type liquid_Type = Liquid_Type.PROTEINDRINK;

    public Carnivorous_Plant (String plantType, String plantName, int heightOfPlant) {
        super(plantType, plantName, heightOfPlant);
    }

    public Liquid_Type getLiquid_Type() {
        return liquid_Type;
    }

    @Override
    public double calculateLiquid(double literPerDay) {
        double LIQUIDPRO = 0.5;
        literPerDay = LIQUIDPRO * getHeightOfPlant();
        return literPerDay;
    }

    @Override
    public String toString(){
        return "Köttätande växten " + getPlantName() +
                " behöver: " + liquid_Type +
                calculateLiquid(getHeightOfPlant()) + " l/dag";
    }
}
