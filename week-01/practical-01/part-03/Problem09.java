/*Problem 09: User input*/

// Import the Scanner library
import java.util.Scanner;

// name, age, favorite food, height, weight, favorite toy, and owner's name;

public class Problem09 {
    public static void main(String[] args) {
     
        // Create an input object that contains the scanner methods
        Scanner input = new Scanner(System.in);
        
        // Ask the user for the name of the dog
        System.out.print("Enter the name of the dog: ");
        // Create string object with the name of the dog
        String name = input.nextLine();

        // Ask the user for the age of the
        System.out.print("Enter the age of the dog (in years of course): ");
        // Store their age as integer
        int age = input.nextInt();
        // This empty newline is to avoit the scanner to go to the next line
        // Check: https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
        input.nextLine();

        // Ask the user for the favorite food of the dog
        System.out.print("Enter the favorite food of the dog: ");
        // Store their favorite food as string
        String favoriteFood = input.nextLine();

        // Ask the user for the height of the dog
        System.out.print("Enter the height of the dog in centimeters (whole numbers please): ");
        // Store the height in an integer object as we asked for it in centimeters
        int height = input.nextInt();

        // Ask the user for the weight of the dog
        System.out.print("Enter the weight of the dogs in kilograms (whole numbers please): ");
        // Store weight in an integer object
        int weight = input.nextInt();
        input.nextLine();
        
        // Ask the user for the favorite toy of the dog
        System.out.print("Enter the favorite toy of the dog: ");
        // Create string object with their name
        String favoriteToy = input.nextLine();

        // Ask the user for the name of the owner of the dog
        System.out.print("Enter the name of the owner of the dog: ");
        // Create string object with their name
        String owner = input.nextLine();

        //Print thedata provided for the user, along with a funny message
        System.out.println("The name of the dog is " + name + " and belongs to "+ owner + ", his age is " + age + ", his favorite food is " + favoriteFood);
        System.out.println("His weight is " + weight + " and his height is "+ height);
        System.out.println("His favorite toy is " + favoriteToy + ". He is a GOOD BOY!");
                
    }
}