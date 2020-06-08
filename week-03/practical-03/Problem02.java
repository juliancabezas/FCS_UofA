// Import the Scanner library to receive user input
import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
     
        // Create an input object that contains the scanner methods
        Scanner input = new Scanner(System.in);

        // The input number will be a long type
        long number;

        // Initialize the output message
        String outputMessage;

        // Ask the user for the number
        System.out.println("------------");
        System.out.print("Please, insert a number: ");

        // I will use try-catch in case the user doesnt input an integer
        try {

            // Create objet with the number
            number = input.nextLong();

            // Use the determinePrime method to generate an output message and print it
            outputMessage = determinePrime(number);
            System.out.println(outputMessage);
            System.out.println("------------");

        // If the user input is not an integer return message
        } catch (Exception e) {
            System.out.println("Wrong input, please insert an integer number");
            System.out.println("------------");
        }
    }


    public static String determinePrime(long number) {

        // Define an empty number of divisors integer
        int numberDivisors = 0;

        // Initialize the output message
        String isPrimeMessage = "";

        // Try catch in case there is an error in the for loop
        try {

            // This loop will test all the numbers between 1 and the input number
            // If it is divisuble add 1 to the numberDivisors counter
            for (int i=1;i <= number; i++) {

                if (number % i == 0)
                numberDivisors = numberDivisors + 1;

            }

            // The number should be divisible by 1 and the same number to be prime, so the number of divisors has to be 2
            if (numberDivisors == 2) {
                isPrimeMessage = "Your number is prime";
            } else {
                isPrimeMessage = "Your number is not prime";
            }

        // Throw error message in case something goes wrong with determining if the number is prime 
        } catch(Exception e){
            System.out.println("Error when determining if the number is prime");
        }

        return isPrimeMessage;

    }
}