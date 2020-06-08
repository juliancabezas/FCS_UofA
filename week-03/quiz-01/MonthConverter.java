import java.util.Scanner;

public class MonthConverter{
	public static void main(String[] args) {

		// New scanner object
		Scanner input = new Scanner(System.in);

		// Ask for the moth number and read it in the scanner
		System.out.println("Please figure out the current month number from 1 to 12");
		System.out.println("Example: March is 3 and December is 12");
		System.out.print("Please input the number of the current month: ");
		int monthNumber = input.nextInt();

		// Usins Switch to make cases acoording to the corresponding season
		switch(monthNumber){
			case 12:
			case 1:
			case 2: 
				System.out.println("You are in Summer!");
				System.out.println("Go to the beach and be careful of fires!");
				break;

			case 3:
			case 4:
			case 5: 
				System.out.println("You are in Autumn!");
				System.out.println("Go step on the dry leaves!");
				break;

			case 6:
			case 7:
			case 8: 
				System.out.println("You are in Winter!");
				System.out.println("Get your jacket and drink wine");
				break;

			case 9:
			case 10:
			case 11: 
				System.out.println("You are in Spring!");
				System.out.println("Aaahhh, the season of love and heavy alergies <3");
				break;

			default:
			System.out.println("That is not a valid month number");

		}

	}
}