package Greenest_Assignment_1.Plant_Super_Sub;

import Greenest_Assignment_1.Liquid_Type;

public class Palm extends Plant {

    private final Liquid_Type liquid_Type = Liquid_Type.TAPWATER;

    public Palm (String plantType, String plantName, int heightOfPlant) {
        super(plantType, plantName, heightOfPlant);
    }

    public Liquid_Type getLiquid_Type() {
        return liquid_Type;
    }


    @Override
    public double calculateLiquid(double literPerDay) {
        double LIQUIDTAP = 0.5;
        literPerDay = LIQUIDTAP * getHeightOfPlant();
       return literPerDay;
    }
    @Override
    public String toString(){
        return "Palmen " + getPlantName() +
                " behöver: " + liquid_Type +
                calculateLiquid(getHeightOfPlant()) + " l/dag";
    }
}
