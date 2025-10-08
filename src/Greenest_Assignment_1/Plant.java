package Greenest_Assignment_1;

public abstract class Plant implements Fluid_requirements {

    private String plantName;
    private double lengthMeter;


    public Plant(String plantName, int heightOfPlant) {
        if (plantName == null || plantName.trim().isEmpty()) {
            System.out.println("Försök igen!");
        }
        this.plantName = plantName;
        this.lengthMeter = heightOfPlant;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public double getHeightOfPlant() {
        return lengthMeter;
    }

    public void setHeightOfPlant(int heightOfPlant) {
        this.lengthMeter = heightOfPlant;
    }

    public double calculateLiquid(double literPerDay) {
        return literPerDay;
    }

    public String toString(){
        return plantName + " behöver: " +
                calculateLiquid(getHeightOfPlant()) + " l/dag";
    }
}
