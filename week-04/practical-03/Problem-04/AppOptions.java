import java.util.Scanner;

class AppOptions {
	
	// Mthod to display the initial options available in the app
	public static void displayOptions() {

		System.out.println("+++++++++++++++++++++++");
        System.out.println("What do you want to do?");
		System.out.println("1) Display the characteristics of the bikes under repairment");
		System.out.println("2) Display the characteristics of the checkedsvn  out bikes");
        System.out.println("3) Check out a bike");
		System.out.println("4) exit");
	}

	// Method to read options, returns an integer
	public static int readOption() {
		Scanner input = new Scanner(System.in);

		// Picked option
		int res = 0;
		boolean validInput = false;
		
		while(!validInput) {
			System.out.print("Input your option: ");
			try {
				// Read next integer and exit the while loop
				res = input.nextInt();
				validInput = true;
			}
			// Catch exception and ask again for an input
			catch (Exception e) {
				System.out.println("Please input a valid option!");
				input.next();
			}
		}
		
		return res;
	}

	// This method reads an ID to pick a bicycle, similar to the above method but with different messages
	public static int readID() {
		Scanner input = new Scanner(System.in);
		int ID = 0;
		boolean validInput = false;
		
		while(!validInput) {
			System.out.print("Input the ID of the bike you want to check out: ");
			try {
				ID = input.nextInt();
				validInput = true;
			}
			catch (Exception e) {
				System.out.println("Please input a valid ID number");
				input.next();
			}
		}
		
		return ID;
	}

	// This methods reads an string from the user, representing the date.
	public static String readDate() {
		Scanner input = new Scanner(System.in);
		String date = "";
		boolean validInput = false;
		
		while(!validInput) {
			System.out.print("Input the check out data in DD-MM-YYYY format: ");
			try {
				date = input.next();
				validInput = true;
			}
			catch (Exception e) {
				System.out.println("Please input a valid date");
				input.next();
			}
		}
		
		return date;
	}

}