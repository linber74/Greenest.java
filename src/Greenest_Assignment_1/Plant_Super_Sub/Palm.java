package Greenest_Assignment_1.Plant_Super_Sub;

import Greenest_Assignment_1.Liquid_Type;

public class Palm extends Plant {

    private final Liquid_Type liquid_Type = Liquid_Type.TAPWATER;

    public Palm (String plantType, String plantName, double heightOfPlant) {
        super(plantType, plantName, heightOfPlant);
    }

    @Override
    public double calculateLiquid(double literPerDay) {
        double liquidTap = 0.5;
        literPerDay = liquidTap * getHeightOfPlant();
       return literPerDay;
    }
    @Override
    public String toString(){
        return "Palmen " + getPlantName() +
                " behöver: " + calculateLiquid(getHeightOfPlant()) +
                 " liter " + liquid_Type.drink + " per dag";
    }
}
