package Greenest_Assignment_1;

import Greenest_Assignment_1.Plant_Super_Sub.Plant;

import javax.swing.*;
import java.util.List;

import static javax.swing.JOptionPane.showMessageDialog;

public class Help_Class {

    public static final String WHICHPLANT = "Vilken växt ska vattnas?";
    public static final String TITLEINPUT = "VÄXTHOTELLET";
    public static final String PROGRAMCLOSE = "Programmet stängs";
    public static final String EMPTY = "Får inte vara tomt, försök igen";
    public static final String TITLEERROR = "Error";
    public static final String NAMENOTHERE  = "Namnet finns inte på hotellet, försök igen!";

    public static void messageOutput(String message) {
        showMessageDialog(null, message, "Avslutas", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void errorOutput(String message) {
        showMessageDialog(null, message, TITLEERROR,JOptionPane.WARNING_MESSAGE);
    }

    public static void continueOrNot() {
        JOptionPane.showConfirmDialog(
                null, "Vill du fortsätta till nästa växt?",
                "Nästa?", JOptionPane.YES_NO_OPTION);
    }

    public static void userInput(List<Plant> plants) {

        while (true) {

            String input = JOptionPane.showInputDialog(null, WHICHPLANT, TITLEINPUT,
                    JOptionPane.QUESTION_MESSAGE);

            if (input == null ) {
                messageOutput (PROGRAMCLOSE);
                return;
            }

            if (input.isEmpty()){
                errorOutput (EMPTY);
                continue;
            }

            for (Plant plant : plants) {
                String name = plant.getPlantName();
                String plantType = plant.getPlantType();
                if (name.equalsIgnoreCase(input) || (plantType + " " + name).equalsIgnoreCase(input)) {
                    messageOutput(plant.toString());
                    return;
                }
            }
            messageOutput(NAMENOTHERE);
        }
    }


}