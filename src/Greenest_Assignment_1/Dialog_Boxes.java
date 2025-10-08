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

    public static void messageOutput (String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}