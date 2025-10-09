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
        Cactus igge = new Cactus("Kaktus", "Igge", 0.20);
        Palm laura = new Palm("Palm", "Laura", 5);
        Carnivorous_Plant meatloaf = new Carnivorous_Plant("Köttätande växt", "Meatloaf", 0.7);
        Palm olof =  new Palm("Palm", "Olof", 1);

        List<Plant> plants = new ArrayList<>();
        plants.add(igge);
        plants.add(laura);
        plants.add(meatloaf);
        plants.add(olof);


    }

    public static void main(String args[]){

    }
}
