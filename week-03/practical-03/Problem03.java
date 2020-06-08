// Import the Scanner library to receive user input
import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
     
        // Create an input object that contains the scanner methods
        Scanner input = new Scanner(System.in);

        // The input numbers will be long type
        long number1;
        long number2;

        // Initialize the output message
        String outputMessage;

        // I will use try-catch in case the user doesnt input an integer
        try {

            // Ask the user for the first number
            System.out.println("------------");
            System.out.print("Please, insert a number: ");

            // Create objet with the number
            number1 = input.nextLong();

            // Ask the user for the second number
            System.out.print("Please, insert a number: ");

            // Create objet with the number
            number2 = input.nextLong();

            // Use the determineMax method to determine the bigger number, generate an output message and print it
            outputMessage = determineMax(number1, number2);
            System.out.println(outputMessage);
            System.out.println("------------");

        // If the user input is not an integer return message
        } catch (Exception e) {
            System.out.println("Wrong input, please insert integer numbers");
            System.out.println("------------");
        }
    }


    public static String determineMax(long number1, long number2) {

        // Initialize the output message
        String maxNumberMessage = "";

        // Try catch in case there is an error in the operation
        try {

            // Determine the bigger number, if both are equal inform that
            if (number1 > number2) {
                maxNumberMessage = "The bigger number is " + number1;
            } else if (number2 > number1) {
                maxNumberMessage = "The bigger number is " + number2;
            } else {
                maxNumberMessage = "Both numbers are equal";
            }

        // Throw error message in case something goes wrong with determining the bigger number
        } catch(Exception e){
            System.out.println("Error when determining the bigger number");
        }

        return maxNumberMessage;

    }
}