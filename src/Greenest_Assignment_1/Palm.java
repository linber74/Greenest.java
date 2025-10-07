package Greenest_Assignment_1;

public class Palm extends Plant implements Fluid_requirements {

    private final Liquid_Type liquid_Type = Liquid_Type.TAPWATER;

    public Palm(String plantName, int heightOfPlant) {
        super(plantName, heightOfPlant);
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
}
