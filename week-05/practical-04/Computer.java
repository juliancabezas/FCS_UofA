// Import the Random library
import java.util.Random;

public class Computer extends Player {

    // Basic Constructor
    public Computer() {
        super("Robot");
    }


    // Methods
    public String performMove() {
        
        // Initialize random number
        Random ran = new Random();
        String move = "";

        // It will draw a 0, 1 or 2 randomly
        int number = ran.nextInt(3);
        
        // Each number is associated with a move
        switch(number) {
            case 0:
                move = "Scissors";
                break;
            case 1: 
                move = "Rock";
                break;
            case 2: 
                move = "Paper";
                break;
            default:
                move = "Invalid";
                break;
        }

        return move;
    }

}