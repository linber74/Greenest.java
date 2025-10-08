package Greenest_Assignment_1;

public class Carnivorous_Plant extends Plant {

    private final Liquid_Type liquid_Type = Liquid_Type.PROTEINDRINK;

    public Carnivorous_Plant(String plantName, int heightOfPlant) {
        super(plantName, heightOfPlant);
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
