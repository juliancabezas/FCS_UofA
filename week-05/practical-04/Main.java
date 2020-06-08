/* 0 Design of the software

1. Inheritance tree and classes
    Parental class Person
    attributes: String member (human (with name or computer))
    abstract method performMove()
        Child classes
        - Human
        - Computer

    Other classes
    -Referee:
    methods: printWelcome(), printOpetion(), validateMove(String),determineWinner()  
    -GameArt: Ascii art for the moves and winner of the game
    methods: printRock(), printScissor(),printPaper() printWinner()
    -Main: has the main method, used to test the software and order the workflow of the game

2. Sketch of the building of the code

a. Make the parent class, make it abstract so I can have an abstract performMove method
b. Create human class, it will have a method to input a move
c. Create a computer class, it will have a random number generator that will determine the move
d. Create the referee class, it need a method to validate the human class performMove method, 
for that I will need a set of "valid values" for each move. I will use another method to determine the winner of the match, using if else statemens
This class will also need display methods to be printing the different stages of the game
e. Create the main class with the workflow, put some while loops to take a valid input from the player
The workflow will be: Welcome message, player performs move (input), validation of the input, computer performs move ans then the referee defines the winner
f. Create the gameart class, that will contain ascii art taken from the internet

3. Testing of the code.

a. I will try the code by using common misspellings of the moves (e.g. cissor, rok)
b. Try the code with capital letters in the moves (e.g. SCISSOR, roCK)
c. Try the code using numbers as input for the moves, as well as special characters
d. see what happerns where there is a tie, maybe another while loop is needed.

*/

public class Main {
    public static void main(String[] args) {
        
        // Initalize the referee and players objects
        Referee referee = new Referee();
        Player human = new Human();
        Player robot = new Computer();

        // Valiable initialization
        String winner = "Tie";
        String playerMove = "";
        String validPlayerMove = "Invalid";
        String robotMove = "";

        // The referee print the welcome message
        referee.displayWelcome();

        System.out.println("-----------------");

        // The referee asks for the human's player name and then set it
        String name = referee.readPlayerName();
        human.setMember(name);
        System.out.println("-----------------");

        // Prints the get ready message
        System.out.println("Hi " + human.getMember() + ", get ready for the game!");

        // Perform while loop if there is a tie
        while (winner.equals("Tie")) {

            validPlayerMove = "Invalid";

            // Initialize a plaver move string, that will be overwritten by a valid move by the referee of necessary
            while (validPlayerMove.equals("Invalid")) {

                referee.displayOptions();
                playerMove = human.performMove();
                validPlayerMove = referee.ValidateMove(playerMove);

                if (validPlayerMove.equals("Invalid")) {
                    System.out.println("---------------------");
                    System.out.println("Please input a valid move (Rock, Paper or Scissors)");
                }
            }

            // Prints the ascii art for the human's move
            GameArt.printMove(validPlayerMove,human.getMember());

            // The robot performs his move using a random number generator
            robotMove = robot.performMove();

            // Prints ascii for the winner
            GameArt.printMove(robotMove,robot.getMember());

            // The referee determines who is the winner
            winner = referee.determineWinner(validPlayerMove, robotMove);

            // In case of a tie print message and go with the player move again
            if (winner.equals("Tie")) {
                System.out.println("");
                System.out.println("It is a tie!!!. Play again to determine the absolute winner!");
            }
        }
        
        System.out.println("");

        // Prints winner message
        if (winner.equals("Human")) {
            System.out.println("" + human.getMember() + " WINS!!!. Humanity will never be defeated!");
        } else if (winner.equals("Robot")) {
            System.out.println("THE ROBOT WINS!!!. Humanity is clearly obsolete");
        }

        // Print Game art of the winner
        GameArt.printWinner(winner);

    }
}



