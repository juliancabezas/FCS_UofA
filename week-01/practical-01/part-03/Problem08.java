/*Problem 08: User input*/

// Import the Scanner library
import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
     
        // Create an input object that contains the scanner methods
        Scanner input = new Scanner(System.in);
        
        // Ask the user for their name
        System.out.print("Enter your name: ");
        // Create string object with their name
        String name = input.nextLine();

        // Ask the user for their age
        System.out.print("Enter your age (in years of course): ");
        // Store their age as integer
        int age = input.nextInt();
        // This empty newline is to avoit the scanner to go to the next line
        // Check: https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
        input.nextLine();

        // Ask the user for their favorite food
        System.out.print("Enter your favorite food: ");
        // Store their favorite food as string
        String favoriteFood = input.nextLine();

        // Ask the user for their grade in english
        System.out.print("Enter your grade in english: ");
        // Store the grade as double
        double eng = input.nextDouble();

        // Ask the user for their grade in maths
        System.out.print("Enter your grade in maths: ");
        // Store the grade in double
        double math = input.nextDouble();

        // Ask the user for their height
        System.out.print("Enter your height in centimeters (whole numbers please): ");
        // Store the height in an integer object as we asked for it in centimeters
        int height = input.nextInt();

        // Ask the user for their weight
        System.out.print("Enter your weight in kilograms (whole numbers please): ");
        // Store weight in an integer object
        int weight = input.nextInt();

        // Ask the user for their subject number
        System.out.print("Enter your number of subjects: ");
        // Store subject number in integer
        int subject = input.nextInt();

        //Print the data provided for the user, along with an educative message
        System.out.println("Your name is " + name + ", your age is " + age + ", your favorite food is " + favoriteFood);
        System.out.println("Also, your grade in english was " + eng + " and in math " + math);
        System.out.println("Your weight is " + weight + " and your height is "+ height);
        System.out.println("Subject number: " + subject);    
        System.out.println("Thank you for giving us your personal data");
        System.out.println("Please don't give anyone your data so easily, it could be dangerous :)");
                
    }
}