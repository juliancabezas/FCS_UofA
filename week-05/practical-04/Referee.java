import java.util.Scanner;

public class Referee {

    // The referee knows which are the valid inputs he will accept, they are all in lower case
    // The game will be played by nnon natuve english speakers, so he acceps misspelling
    String validScissors [] = {"scissor", "scissors", "sissor", "cissor","scisor","cisor","sisor","sissor","cissor"};
    String validRock [] = {"rock","rocks","rok","roc","roock","rooock","roooock","rook","rooc"};
    String validPaper [] = {"paper","papel","paaper","papper","papers"};


    // Display the welcome message for the game
	public void displayWelcome() {
		System.out.println("---------------------------");
        System.out.println("In year 2054, humanity is at war with the machines");
        System.out.println("After months of negociations both sides agree that the outcome");
        System.out.println("of the war will be decided in a one round Rock-Paper-Scissor game");
        System.out.println("Your are the champion of humanity. In this game you will play against an elite robot");
        
    }
    
    // Display the move options
    public void displayOptions() {
		System.out.println("What will your move be?");
        System.out.println("Rock, Paper or Scissors?");
    }
    
    // Validates ans transforms the humans player move
	public String ValidateMove(String playerMove) {

		String validMove = "Invalid";
        String move;
		
        System.out.println("Checking move...");
        try {
            move = playerMove;
            
            // Convert the string to lower case
            move = move.toLowerCase();
            
            // Check the players input agains the arrays defined in this class and transforms to valid move (Rock, Paper, Scissors)
            if (this.checkInput(validScissors, move)) {
                validMove = "Scissors";
            } else if (this.checkInput(validRock, move)) {
                validMove = "Rock";
            } else if (this.checkInput(validPaper, move)) {
                validMove = "Paper";
            }

        }
        catch (Exception e) {
            System.out.println("Please input a valid move (Rock, Paper or Scissors)");
        }
		
	    return validMove;
    }

    // This funcions checks a single input agains an arrays, its like the IN operator
    private boolean checkInput(String[] validInput, String userInput) 
    { 
        // Linear reach to check if the user input is in the array
        boolean test = false; 
        String validElement = "";

        // For loop that goes through all the elements of the valid input matrix
        for (int i =0; i < validInput.length; i++) { 

            validElement = validInput[i];

            // If any element is equal to the user input returns true
            if (userInput.equals(validElement)) { 
                test = true; 
            } 
        } 
  
        return test;
    } 
  

    // Asks and reads the human player name
    public String readPlayerName() {
		Scanner input = new Scanner(System.in);
		String name = "";
		boolean getName = false;
		
		while(!getName) {
			System.out.print("What is your name, champion?: ");
			try {
                // Use nextline method to read names composed by more than one word
                name = input.nextLine();
				getName = true;
			}
			catch (Exception e) {
				System.out.println("Please input a valid name, without special characters");
				input.next();
			}
		}
		
		return name;
    }

    // Method to determikne the winner giving the human and robot moves (after using the validateMove method)
    public String determineWinner(String humanMove, String robotMove) {
        String winner = "Undefined";
        
		// Situation where bot moves are equal		
		if (humanMove.equals(robotMove)) {
            winner = "Tie";
        // 3 situations where the robot wins
        } else if ((humanMove.equals("Scissors")) && (robotMove.equals("Rock"))) {
            winner = "Robot";
        } else if ((humanMove.equals("Rock")) && (robotMove.equals("Paper"))) {
            winner = "Robot";
        } else if ((humanMove.equals("Paper")) && (robotMove.equals("Scissors"))) {
            winner = "Robot";
        // 3 situations where the human wins
        } else if ((humanMove.equals("Paper")) && (robotMove.equals("Rock"))) {
            winner = "Human";
        } else if ((humanMove.equals("Scissors")) && (robotMove.equals("Paper"))) {
            winner = "Human";
        } else if ((humanMove.equals("Rock")) && (robotMove.equals("Scissors"))) {
            winner = "Human";
        }
		
		return winner;
    }
    


}