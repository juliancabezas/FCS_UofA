// Import the Scanner library to receive user input
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     
        // Create an input object that contains the scanner methods
        Scanner input = new Scanner(System.in);
        
        // Define the empty cash integer (zero)
        int cash = 0;

        // Ask the user for the amount of cash he/she wants)
        System.out.println("Hi!, Welcome to the ATM, we currently just have $20 and $50 notes available");
        System.out.print("How much cash do you want to withdraw?: ");

        // I will use hasNextInt to check if the user input is an integer
        if (input.hasNextInt()) {

            // Create integer object with the ammount of cash
            cash = input.nextInt();

            // Use the run function to get the output message
            String outputMessage = run(cash);

            // Print the message
            System.out.println(outputMessage);

        // If the user input is not an integer resturn message
        } else {
            System.out.print("Sorry, the value you input cannot be withdrew, please enter an integer");
        }
                
    }

    // Define the function "run", it needs the input "money" and produces an string with the ATM's message
    public static String run(int money) {

        // Create empty message variable
        String message;

        // Create zero integers for the number of notes
        int n20Notes = 0;
        int n50Notes = 0;

        // This is just to have a more meaningful variable name
        // The remaionder will be equal to the requested money at the beggining
        int remainder = money; 

        // The requirement states that it should be the minor possible amount of notes

        // True boolean that will go to false if the number can not be withdrew
        boolean validValue = true;

        // Start with th $20 notes, if it is possible to take $50 notes break the loop
        while ((remainder % 50 != 0) && (remainder != 0)) {

            // Add one $20 note
            n20Notes = n20Notes + 1;
            // Substract $20 from the remainder
            remainder = remainder - 20;

            // if it goes to negative it means the value cant be withdrew
            if (remainder < 0) {
                validValue = false; 
                break;
            }
        }

        // Now we can take the $50 notes
        while (remainder != 0)  {

            // Add 1 $50 note
            n50Notes = n50Notes + 1;
            // Substract $50 from the remainder
            remainder = remainder - 50;

            // if it goes to negative it means the value cant be withdrew
            if (remainder < 0) {
                validValue = false; 
                break;
            }
        }

        // If the value is valid the message will be the number of notes
        if (validValue) {
            message = "Here is " + n20Notes + " $20 notes and " + n50Notes + " $50 notes";
        } else {
        // If the value is not valid return an error message
            message = "Sorry, the value you input cannot be withdrew, only $20 and $50 notes available";
        }

        // The output of the function is the message
        return message;

    } 

}

