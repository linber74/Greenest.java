package Greenest_Assignment_1.Plant_Super_Sub;

import Greenest_Assignment_1.Fluid_requirements;

/**
 * Superklassen som subklasserna ärver
 *
 */
public abstract class Plant implements Fluid_requirements {

    //inkapslade variabler
    private final String plantType;
    private final String plantName;
    private final double heightOfPlant;

    //konsktruktor
    public Plant(String plantType, String plantName, double heightOfPlant) {
        this.plantType = plantType;
        this.plantName = plantName;
        this.heightOfPlant = heightOfPlant;
    }

    // Getters endast getHeightOfPlant används
    public String getPlantType() {
        return plantType;
    }

    public String getPlantName() {
        return plantName;
    }

    public double getHeightOfPlant() {
        return heightOfPlant;
    }
    //polymorfism, toString
    @Override
    public String toString(){
        return plantName;
    }
}
