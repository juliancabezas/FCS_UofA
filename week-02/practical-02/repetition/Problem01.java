// Import the Random library to generate randdom numbers
import java.util.Random;

public class Problem01 {
    public static void main(String[] args) {
        
        // New random object
        Random ran = new Random();

        // Generate empty number integer
        int number = 0;
        // Generate empty strig that will be filled with stars
        String nStars = "";

        // Loop of 10 numbers
        for (int i = 1; i < 11; i++) {

            // Use the nextint method to obtain a random integer from 0 to 20
            number = ran.nextInt(21);

            // Another loop to fill the nstars string with number of starts = random number
            for (int n = 1; n <= number; n++){

                // Add 1 star
                nStars = nStars + "*";

            }

            // Print the starts
            System.out.println("Number ("+ number + "):" + nStars);

            // Get an empty nstars string again
            nStars = "";

        }

    }
}