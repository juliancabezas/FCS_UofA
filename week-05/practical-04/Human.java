import java.util.Scanner;

class Human extends Player{ 

    // Basic Constructor
    public Human() {
        super("Human Player");
    }

    // Parametrized constructor, allows user to input their name
    public Human(String name) {
        super(name);
    }

    // Methods
    public String performMove() {
        String move = this.readMove();
        return move;
    }

    // Reads user input in string form
    public String readMove() {
		Scanner input = new Scanner(System.in);
		String move = "";
		boolean getMove = false;
        
        // In case of errors type an exception
		while(!getMove) {
			System.out.print("Type your move: ");
			try {
                move = input.next();
				getMove = true;
			}
			catch (Exception e) {
				System.out.println("Please input a valid move (Rock, Paper or Scissors)");
				input.next();
			}
		}
		
	    return move;
    }

}