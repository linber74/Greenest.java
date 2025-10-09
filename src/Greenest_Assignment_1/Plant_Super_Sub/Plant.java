package Greenest_Assignment_1.Plant_Super_Sub;

import Greenest_Assignment_1.Fluid_requirements;

public abstract class Plant implements Fluid_requirements {

    private String plantType;
    private String plantName;
    private double heightOfPlant;


    public Plant(String plantType, String plantName, int heightOfPlant) {
//        if (plantName == null || plantName.trim().isEmpty()) {
//            System.out.println("Försök igen!");
//        }
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

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public double getHeightOfPlant() {
        return heightOfPlant;
    }

    public void setHeightOfPlant(int heightOfPlant) {
        this.heightOfPlant = heightOfPlant;
    }

    @Override
    public double calculateLiquid(double literPerDay) {
        return literPerDay;
    }

    @Override
    public String toString(){
        return plantName;
    }
}
