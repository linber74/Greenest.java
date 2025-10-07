package Greenest_Assignment_1;

public abstract class Plant {

    private String plantName;
    private double lengthMeter;


    public Plant(String plantName, int heightOfPlant) {
        if (plantName == null || plantName.trim().isEmpty()) {
            throw new IllegalArgumentException();
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
}
