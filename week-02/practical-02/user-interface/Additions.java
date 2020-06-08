// Import the Scanner library to receive user input
import java.util.Scanner;

public class Additions {
    public static void main(String[] args) {
     
        // Create an input object that contains the scanner methods
        Scanner input = new Scanner(System.in);
        
        // Define the option, I will start in zero
        char option = 'a';

        // Empty input numbers, the software will work with integers
        int number1;
        int number2;

        // Start while loop, stop only if user inputs a b (exit)
        while (option != 'b') {

            // Initial user Screen, welcome message and option choosing
            System.out.println("Welcome dear user");
            System.out.println("Would you like to:");
            System.out.println("a) sum again");
            System.out.println("b) exit");
            System.out.print("Option: ");

            // Read the First character of the user input 
            option = input.next().charAt(0);

            // If the option is b trow message and go out
            if (option == 'b') {
                System.out.println("Thank you! Have a good day.");
            } 
            // If option is a do the calculations
            else if (option == 'a') {

                //Ask for first number
                System.out.print("Please, insert the first number: ");

                // I will use hasNextInt to check if the user input is an integer
                while (!input.hasNextInt()) {

                    // Print error pessage and ask again for first number, loop until the inputs integer
                    System.out.println("This machine only accepts integers! (sorry for the inconvenience)");
                    System.out.print("Please, insert the first number: ");
                    input.next();
                }

                // Create integer object with the first number
                number1 = input.nextInt();

                // Now request the second number
                System.out.print("Please, insert the second number: ");

                // I will use hasNextInt to check if the user input is an integer, same as before
                while (!input.hasNextInt()) {

                    System.out.println("This machine only accepts integers! (sorry for the inconvenience)");
                    System.out.print("Please, insert the second number: ");
                    input.next();
                }

                // Create integer object with the second number
                number2 = input.nextInt();

                // Sum both integers
                int sum = number1 + number2;

                // Print the result and loop again
                System.out.println("--------");
                System.out.println("Thank you for your enquiry, the sum between " + number1 + " and " + number2 + " is " + sum);
                System.out.println("--------");

                }
            // If the option is neither a or b print an error message
            else {
                System.out.println("--------");
                System.out.println("Please input a valid option, a or b");
                System.out.println("--------");
            } 
        }     
    }
}

