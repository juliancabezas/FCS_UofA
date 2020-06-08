class CalculatorApplication {
	public static void main(String[] args) {
		boolean keepRunning = true; // indicate whether to keep running the program
		ArithmeticOperation[] operations = {new Sum(), new Subtraction(), new Multiplication(), new Division()};

		while(keepRunning) {
			// Show the menu to the user
			Menu.displayMenu();

			// Read user's option
			int option = Menu.readInput();

			if (option > 0 && option <= 4) {
				// Print information
				operations[option-1].info(); // if option = 1 then option-1 = 0 => operations[0] => object of class Sum

				// Read first number
				int a = Menu.readInput();
				operations[option-1].setA(a); // using mutator to set the value for attribute a

				// Read second number
				int b = Menu.readInput();
				operations[option-1].setB(b); // using mutator to set the value for attribute b

				// Compute the result
				float res = operations[option-1].compute();
				System.out.println("The result is " + res);
				System.out.println();
			} else { // exit
				System.out.println("Exiting...");
				keepRunning = false;
			}
		}
	}
}