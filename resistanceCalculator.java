/*
 * Resistance Calculator Program
 * By @SenShiza
 */

// Importing JOptionPane and Arrays
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class resistanceCalculator {
    
    public static void main(String args[]) {

        // Introduction to the program
        JOptionPane.showMessageDialog(null, "Welcome to the Resistance Calculator Program");
        JOptionPane.showMessageDialog(null, "You can calculate a series resistance or parallel resistance in a circuit");
        confirmation();

    }

    public static void confirmation() {
        // Asking the user if they're calculating a parallel or series resistances
        int confirm;

        confirm = JOptionPane.showConfirmDialog(null,"Would you like to calculate parallel resistances?",
                                              "Parallel resistances", JOptionPane.YES_NO_OPTION);

        if(confirm == JOptionPane.YES_OPTION) {

            // Making sure the user selected the correct type
            confirm = JOptionPane.showConfirmDialog(null,"Are you sure you're calculating parallel resistances?",
                                         "Are you sure?", JOptionPane.YES_NO_OPTION);
            
            if(confirm == JOptionPane.NO_OPTION){

                retry();
            }
            
            else {

                parallel();
            }
        }

        else {

            confirm = JOptionPane.showConfirmDialog(null,"Would you like to calculate series resistances?",
                                              "Series resistances", JOptionPane.YES_NO_OPTION); 
            if (confirm == JOptionPane.YES_OPTION) {

                // Making sure the user selected the correct type
                confirm = JOptionPane.showConfirmDialog(null, "Are you sure you're calculating series resistances?",
                                                "Series Resistances", JOptionPane.YES_NO_OPTION);
                
                if(confirm == JOptionPane.NO_OPTION){

                    retry();
                }

                else {

                    series();
                }
            }

            else {

                retry();
            }
        }

    }

    public static void parallel() {
        // This method calculates parallel resistances
        
        int amount = 0;
        float total = 0;

        // Asks the user how many resistances wants to calculate in order to create an array of that size
        amount = Integer.parseInt(JOptionPane.showInputDialog("How many resistances would you like to calculate?"));

        // Creates an array of a given size from the user
        float[] Resistance = new float[amount];

        // Adds each resistance value into the Resistance[] array
        for (int i = 0; i < amount; i++) {
            
            int temp = i + 1;
            Resistance[i] = Float.parseFloat(JOptionPane.showInputDialog("Please enter the value of resistance number " + temp + " (in kΩ)"));

        }

        // Turns each resistance into its reciprocal
        for (int j = 0; j < amount; j++) {

            Resistance[j] = 1/Resistance[j];
        }

        // Sums all resistances
        for (int k = 0; k < amount; k++) {

            total = total + Resistance[k];

        }

        // Turns the total value into the reciprocal
        total = 1 / total;

        // Shows the result in a GUI
        JOptionPane.showMessageDialog(null, "Your result is: " + total + "kΩ");

        // Redirects the user to the Restart() method
        restart();

    }

    public static void series() {
        // This method calculates series resistances

        int amount = 0;
        float total = 0;

        // Asks the user how many resistances wants to calculate in order to create an array of that size
        amount = Integer.parseInt(JOptionPane.showInputDialog("How many resistances would you like to calculate?"));

        // Creates an array of a given size from the user
        float[] Resistance = new float[amount];

        // Adds each resistance value into the Resistance[] array
        for (int i = 0; i < amount; i++) {
            
            int temp = i + 1;
            Resistance[i] = Float.parseFloat(JOptionPane.showInputDialog("Please enter the value of resistance number " + temp + " (in kΩ)"));

        }

        // Sums all resistances
        for (int k = 0; k < amount; k++) {

            total = total + Resistance[k];

        }

        // Shows the result in a GUI
        JOptionPane.showMessageDialog(null, "Your result is: " + total + "kΩ");

        restart();
        
    }

    public static void retry() {

        // Redirects the user back to the confirmation() method

        confirmation();
    }
    
    public static void restart() {

        //Asks the user whether they want to calculate more resistances or not
        int restart;

        restart = JOptionPane.showConfirmDialog(null, "Would you like to calculate more resistances?",
                                "One more time?", JOptionPane.YES_NO_OPTION);
        
        if (restart == JOptionPane.YES_OPTION) {

            confirmation();
        }
        else {

            exit();
        }
    }
    
    public static void exit() {

        // Gives a thank you message before closing the program
        JOptionPane.showMessageDialog(null, "Thank you for using the Resistance Calculator Program by SenShiza");
        JOptionPane.showMessageDialog(null, "Press OK to exit");
    }
}
