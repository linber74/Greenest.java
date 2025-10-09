package Greenest_Assignment_1.Plant_Super_Sub;

import Greenest_Assignment_1.Fluid_requirements;

public abstract class Plant implements Fluid_requirements {

    private final String plantType;
    public final String plantName;
    private final double heightOfPlant;


    public Plant(String plantType, String plantName, double heightOfPlant) {
        this.plantType = plantType;
        this.plantName = plantName;
        this.heightOfPlant = heightOfPlant;
    }

    public String getPlantType() {
        return plantType;
    }

    public String getPlantName() {
        return plantName;
    }

//    public void setPlantName(String plantName) {
//        this.plantName = plantName;
//    }

    public double getHeightOfPlant() {
        return heightOfPlant;
    }

//    public void setHeightOfPlant(int heightOfPlant) {
//        this.heightOfPlant = heightOfPlant;
//    }

    @Override
    public double calculateLiquid(double literPerDay) {
        return literPerDay;
    }

    @Override
    public String toString(){
        return plantName;
    }
}
