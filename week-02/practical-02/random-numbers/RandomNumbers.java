// Import the Random library to generate randdom numbers
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        // Create a Random object
        Random ran = new Random();

        // I create a long object to store the sum, 
        // I need it to be long because the random integer values will be large
        long sum = 0;

        // I will create a variable with the amount of random numbers I was to create
        // In a future this can be set for user input
        int amountRandomNumbers = 10;

        // The problem asks for a positive integer, so I need to get the maximum positive integer
        int maxInteger = Integer.MAX_VALUE;

        // Print it to be sure
        System.out.println("Maximum integer: " + maxInteger);

        for (int i = 1; i <= amountRandomNumbers; i++) {

            // Generate integer between 1 and the maximum integer (2^23-1)
            int nxt = ran.nextInt(maxInteger) + 1;

            // Print the resulting random number
            System.out.println ("The Randomly generated integer is : " + nxt); 

            // Add the numbers to a global sum
            sum = sum + nxt;

            // Print the sum
            System.out.println ("Sum is: " + sum); 

            // Print the iteration number
            System.out.println ("iteration number: " + i); 

        }

        System.out.println ("Numbers generated: " + amountRandomNumbers);

        // Calculate mean
        double mean = (double) sum /  amountRandomNumbers;

        System.out.println ("Mean is " + mean);

    }
}

