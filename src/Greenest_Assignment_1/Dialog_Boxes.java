package Greenest_Assignment_1;

import Greenest_Assignment_1.Plant_Super_Sub.Plant;

import javax.swing.*;
import java.util.List;

import static javax.swing.JOptionPane.showMessageDialog;

public class Dialog_Boxes {

    public static String userInput(List<Plant> plants) {

        while (true) {

            String input = JOptionPane.showInputDialog("Vilken växt ska vattnas?");

            if (input == null ) {
                showMessageDialog(null, "Programmet stängs");
                return null;
            }

            if (input.isEmpty()){
                showMessageDialog(null, "Får inte vara tomt, försök igen!");
                continue;
            }

            for (Plant plant : plants) {
                String name = plant.getPlantName();
                String plantType = plant.getPlantType();
                if (name.equalsIgnoreCase(input) || (plantType + " " + name).equalsIgnoreCase(input)) {
                    return name;
                }
            }
            showMessageDialog(null, "Namnet finns inte på hotellet, försök igen!");
        }
    }

    public static void messageOutput(String message) {
        showMessageDialog(null, message);
    }

    public static int continueOrNot() {
        return JOptionPane.showConfirmDialog(
                null, "Vill du fortsätta till nästa växt?",
                "Nästa?", JOptionPane.YES_NO_OPTION);
    }
}