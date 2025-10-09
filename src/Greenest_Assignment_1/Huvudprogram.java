package Greenest_Assignment_1;

import Greenest_Assignment_1.Plant_Super_Sub.Cactus;
import Greenest_Assignment_1.Plant_Super_Sub.Carnivorous_Plant;
import Greenest_Assignment_1.Plant_Super_Sub.Palm;
import Greenest_Assignment_1.Plant_Super_Sub.Plant;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Huvudprogram {

    public Huvudprogram() {

        List<Plant> plants = new ArrayList<>();

        Cactus igge = new Cactus("Kaktusen", "Igge", 0.20);
        Palm laura = new Palm("Palmen", "Laura", 5);
        Carnivorous_Plant meatloaf = new Carnivorous_Plant("Köttätande växten", "Meatloaf", 0.7);
        Palm olof =  new Palm("Palmen", "Olof", 1);

        plants.add(igge);
        plants.add(laura);
        plants.add(meatloaf);
        plants.add(olof);

        String input = Help_Class.userInput(plants);


    }

    public static void main(String[] args){
        Huvudprogram huvudprogram = new Huvudprogram();
    }
}
