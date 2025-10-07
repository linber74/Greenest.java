package Greenest_Assignment_1;

public enum Liquid_Type {
    TAPWATER ("Kranvatten"),
    MINERALWATER ("Mineralvatten"),
    PROTEINDRINK ("proteindryck");

    public final String drink;

    Liquid_Type(String drink) {
        this.drink = drink;
    }
}
