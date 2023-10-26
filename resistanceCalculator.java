/*
 * Resistance Calculator Program
 * By @SenShiza
 */

// Importing JOptionPane
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

        // WIP
        JOptionPane.showMessageDialog(null, "We're sorry. This feature is not currently available.");
    }

    public static void series() {

        // WIP
        JOptionPane.showMessageDialog(null, "We're sorry. This feature is not currently available.");

    }

    public static void retry() {

        // Redirects the user back to the confirmation() method

        confirmation();
    }
}
