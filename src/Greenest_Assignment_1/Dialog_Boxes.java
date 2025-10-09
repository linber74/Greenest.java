package Greenest_Assignment_1;

import Greenest_Assignment_1.Plant_Super_Sub.Plant;

import javax.swing.*;

import java.util.List;

import static javax.swing.JOptionPane.showMessageDialog;

public class Dialog_Boxes {

    public static String userInput(List<Plant> plants) {

        while (true) {
            String message = "";
            String userInput = JOptionPane.showInputDialog(message);
            if (userInput == null || userInput.isEmpty()) {
                showMessageDialog(null, "Försök igen, får inte vara tomt!");
            }

            boolean plantFound = false;
            for (Plant plant : plants) {
                if (plant.getPlantType().equals(userInput)) {
                    plantFound = true;
                    break;
                }
            }
            showMessageDialog(null, "Namnet finns inte, försök igen!");
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