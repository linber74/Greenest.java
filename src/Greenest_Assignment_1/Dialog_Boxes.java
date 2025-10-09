package Greenest_Assignment_1;

import javax.swing.*;

public class Dialog_Boxes {

    public static String userInput(String message) {
        while (true) {
            String userInput = JOptionPane.showInputDialog(message);
            if (userInput == null || userInput.trim().isEmpty()) {
                return null;
            }
            userInput = userInput.trim();
            if (!userInput.isEmpty()) {
                return userInput;
            }
            JOptionPane.showMessageDialog(null, "Försök igen!",
                    "FEL", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void messageOutput(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public static int continueOrNot(String[] options) {
        return JOptionPane.showConfirmDialog (
                null, "Vill du fortsätta till nästa växt?",
                "Nästa?", JOptionPane.YES_NO_OPTION);
    }
}