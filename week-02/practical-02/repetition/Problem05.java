// Import Random and Math packages (Math was used for rounding)
import java.util.Random;
import java.lang.Math;

public class Problem05 {
    public static void main(String[] args) {
        
        // Ner random object
        Random ran = new Random();

        // Generate empty number integer
        int number = 0;
        // Generate empty strig that will be filled with stars
        String nMarkers = "";

        // Generate an empty sum integer
        int sum = 0;

        // Stars string for the mean
        String nStarsMean = "";

        // I will create a variable with the amount of random numbers I was to create
        // In a future this can be set for user input
        int amountRandomNumbers = 10;

        // Loop of 10 number
        for (int i = 1; i <= amountRandomNumbers; i++) {


            // I define a marker to represent the number, it will be empty ar the beginning
            String marker = "";

            // Use the nextint method to obtain a random integer from 0 to 20
            number = ran.nextInt(21);

            // Switch statement to define different markers acconding to ranges:
            switch (number) {
                // "o" for numbers between (0,5];
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    marker = "o";
                    break;

                // "x", for numbers between (5, 10];
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    marker = "x";
                    break;

                // "s" for numbers between (10, 15];
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    marker = "s";
                    break;

                //"*", for numbers bigger than 15; 
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                    marker = "*";
                    break;

                default:
                    marker = "";


            }

            // Another loop to fill the nstars string with number of markers = random number
            for (int n = 1; n <= number; n++) {

                nMarkers = nMarkers + marker;

            }

            // Print the starts
            System.out.println("Number ("+ number + "):" + nMarkers);

            // Get an empty nmarkers string again
            nMarkers = "";

            // Add the numbers to a global sum to calculate the mean
            sum = sum + number;

        }

        // Calculate and print mean
        double mean = (double) sum /  amountRandomNumbers;

        // Round the number using Math.round
        long meanRound = Math.round(mean);

        // Another loop to fill the nstars string with nuymber of starts = mean
        for (int m = 1; m <= meanRound; m++) {

             nStarsMean = nStarsMean + "*";

        }

        // Print the mean as starts
        System.out.println("Average ("+ meanRound + "):" + nStarsMean);

    }
}