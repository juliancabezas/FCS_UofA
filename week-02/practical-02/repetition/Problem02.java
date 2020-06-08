// Import Random and Math packages (Math was used for rounding)
import java.util.Random;
import java.lang.Math;

public class Problem02 {
    public static void main(String[] args) {
        
        // New random object
        Random ran = new Random();

        // Generate empty number integer
        int number = 0;
        // Generate empty strig that will be filled with stars
        String nStars = "";

        // Generate an empty sum integer
        int sum = 0;

        // Stars string for the mean
        String nStarsMean = "";

        // I will create a variable with the amount of random numbers I was to create
        // In a future this can be set for user input
        int amountRandomNumbers = 10;

        // Loop of 10 number
        for (int i = 1; i <= amountRandomNumbers; i++) {

            // Use the nextint method to obtain a random integer from 0 to 20
            number = ran.nextInt(21);

            // Another loop to fill the nstars string with nuymber of starts = random number
            for (int n = 1; n <= number; n++) {

                // Add 1 star to the string
                nStars = nStars + "*";

            }

            // Print the starts
            System.out.println("Number ("+ number + "):" + nStars);

            // Get an empty nstars string again
            nStars = "";

            // Add the numbers to a global sum to calculate the mean
            sum = sum + number;

        }

        // Calculate and print mean, cast to double to get decimals
        double mean = (double) sum /  amountRandomNumbers;

        // Round the number using Math.round, it has a long as output
        long meanRound = Math.round(mean);

        // Another loop to fill the nstars string with the number of starts = mean
        for (int m = 1; m <= meanRound; m++) {

             nStarsMean = nStarsMean + "*";

        }

        // Print the mean as starts
        System.out.println("Average ("+ meanRound + "):" + nStarsMean);

    }
}