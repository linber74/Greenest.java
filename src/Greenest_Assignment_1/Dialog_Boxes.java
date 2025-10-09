package Greenest_Assignment_1;

import Greenest_Assignment_1.Plant_Super_Sub.Plant;

import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class Dialog_Boxes {

    public static String userInput(String plantName) {
        while (true) {
            String message = "";
            String userInput = JOptionPane.showInputDialog(message);
            if (userInput == null || userInput.trim().isEmpty()) {
                showMessageDialog(null, "Försök igen, får inte vara tomt!");
            }
            else if (!userInput.equals(Plant.plantName)){
                showMessageDialog(null, "Namnet finns inte, försök igen!");
            }
            else {
                return userInput;
            }

        }
    }

    public static void messageOutput(String message) {
        showMessageDialog(null, message);
    }

    public static int continueOrNot(String[] options) {
        return JOptionPane.showConfirmDialog (
                null, "Vill du fortsätta till nästa växt?",
                "Nästa?", JOptionPane.YES_NO_OPTION);
    }
}