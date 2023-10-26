/*
 * Resistance Calculator Program
 * Author: @SenShiza
 */

// Importing JOptionPane for GUI
import javax.swing.JOptionPane;

public class resistance {
    
    public static void main(String[] args) {
        // Introduction to the program
        JOptionPane.showMessageDialog(null, "Welcome to the resistance calculator program");
        JOptionPane.showMessageDialog(null, "This program will calculate different types of resistances in a DC circuit");
        JOptionPane.showMessageDialog(null, "You can choose between parallel and series resistances in a DC circuit");
        confirmation();
    }

    public static void confirmation() {

        // Asking whether the user wants to calculate a paralell resistance or series resistance
        int parallel;
        parallel = JOptionPane.showConfirmDialog(null, "Would you like to calculate a parallel resistance?",
                                            "Would you like to calculate a parallel resistance?", JOptionPane.YES_NO_OPTION);

        // Asks the user again to make sure they selected the correct type of resistance
        if (parallel == JOptionPane.YES_OPTION) {
            int confirm;

            confirm = JOptionPane.showConfirmDialog(null, "Are you sure you're calculating a parallel resistance?",
                                                "Are you sure you're calculating a parallel resistance?", JOptionPane.YES_NO_OPTION);
            // redirecting the user to the parallel() method
            if (confirm == JOptionPane.YES_OPTION) {

                parallel();
            }
            else {
                retry(); // Having trouble redirecting the user back to the confirmation() method
            }
        }
        else {
            int series;
            series = JOptionPane.showConfirmDialog(null, "Would you like to calculate a series resistance?",
                                                "Would you like to calculate a series resistance?", JOptionPane.YES_NO_OPTION);

            // Asks the user again to make sure they selected the correct type of resistance
            if (series == JOptionPane.YES_OPTION) {
                int confirm;

                confirm = JOptionPane.showConfirmDialog(null, "Are you sure you're calculating a series resistance?",
                                                        "Are you sure you're calculating a series resistance?", 
                                                        JOptionPane.YES_NO_OPTION);

                // redirecting the user to the series() method
                if (confirm == JOptionPane.YES_OPTION) {

                    //series();
                    testSeries(); //TEMP METHOD
                }
                else {
                    retry(); // Having trouble redirecting the user back to the confirmation() method
                } 
            }
        }
    }

    // Test purposes only, having trouble redirecting the user back to the confirmation() method
    public static void retry() {

        confirmation();
    }

    public static void parallel() {

        // WIP
        JOptionPane.showMessageDialog(null, "We're sorry. This feature is not currently available.");
    }

    public static void series() {

        // WIP
        JOptionPane.showMessageDialog(null, "We're sorry. This feature is not currently available.");

    }

    public static void testSeries() {
        String input;
        String res;
        int amount = 0;
        float resistance = 0;
        float total;

        input = JOptionPane.showInputDialog("Please enter the amount of series resistances you wish to calculate");
        amount = Integer.parseInt(input);

        // NOT WORKING NEEDS FIX
        for(int i = 0; i == amount; i++){

            res = JOptionPane.showInputDialog("Enter the value of the number " + i + " resistance:");
            resistance = Float.parseFloat(res);

            total = resistance+=resistance;

            System.out.println(total);
        }
    }
}
