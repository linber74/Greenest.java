package Greenest_Assignment_1;

import Greenest_Assignment_1.Plant_Super_Sub.Plant;
import javax.swing.*;
import java.util.List;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 * En hjälpklass där dialogrutorna finns
 * I metoden userInput checkas det så att inte kraschar och
 * rätt namn skrivits in
 * Text och titlar i dialogrutor är inkapslade i variabler
 */

public class Help_Class {

    //Text i rutorna
    private static final String WHICHPLANT = "Vilken växt ska vattnas?";
    private static final String PROGRAMCLOSE = "Programmet stängs";
    private static final String EMPTY = "Får inte vara tomt, försök igen";
    private static final String NAMENOTHERE  = "Namnet finns inte på hotellet, försök igen!";

    //Titlar på rutorna
    private static final String TITLEINPUT = "VÄXTHOTELLET";
    private static final String TITLEERROR = "Error";
    private static final String TITLECLOSE = "Avslutas";

    //Stänger program
    protected static void messageClose() {
        showMessageDialog(null, Help_Class.PROGRAMCLOSE,TITLECLOSE , JOptionPane.INFORMATION_MESSAGE);
    }

    //Utskrift
    private static void messageOutput(String message) {
        showMessageDialog(null, message, TITLEINPUT, JOptionPane.INFORMATION_MESSAGE);
    }

    // Om tomt
    private static void errorOutput() {
        showMessageDialog(null, EMPTY, TITLEERROR,JOptionPane.WARNING_MESSAGE);
    }

    protected static void userInput(List<Plant> plants) {

        while (true) {

            String input = JOptionPane.showInputDialog(null, WHICHPLANT, TITLEINPUT,
                    JOptionPane.QUESTION_MESSAGE);

            if (input == null ) {
                messageClose ();
                return;
            }
            input = input.trim();
            if (input.isEmpty()){
                errorOutput ();
                continue;
            }

            boolean plantFound = false;

            for (Plant plant : plants) {
                String name = plant.getPlantName();
                String plantType = plant.getPlantType();
                if (name.equalsIgnoreCase(input) || (plantType + " " + name).equalsIgnoreCase(input)) {
                    messageOutput(plant.toString());
                    break;
                }
            }
            if (!plantFound) {
                messageOutput(NAMENOTHERE);
            }
        }
    }
}