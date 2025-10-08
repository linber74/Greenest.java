package Greenest_Assignment_1;

public class Cactus extends Plant {

    private final Liquid_Type liquid_Type = Liquid_Type.MINERALWATER;

    public Cactus(String plantName, int heightOfPlant) {
        super(plantName, heightOfPlant);
    }


    public Liquid_Type getLiquid_Type() {
        return liquid_Type;
    }

    @Override
    public double calculateLiquid(double literPerDay) {
        literPerDay = 0.2;
        return literPerDay;
    }

    @Override
    public String toString() {
        return "Kaktusen " + getPlantName() +
                " behöver: " + liquid_Type +
                calculateLiquid(getHeightOfPlant()) + " l/dag";
    }
}
