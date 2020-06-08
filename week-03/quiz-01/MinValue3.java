import java.util.Scanner;

public class MinValue3 {
	public static void main(String[] args){

		// New scanner object
		Scanner input = new Scanner(System.in);

		// Define variables, the maxnumber and minnumber variables are dummies
		// that will be replaced in the loop
		double number = 0.0d;
		double minNumber = Double.MAX_VALUE;
		int count = 1;

		System.out.println("This program will run until you input a negative number");
		System.out.println("If you input a negative number in the first iteration, the result will be zero");

		while (number >= 0.0d) {

			// Ask for user input and store the number
			System.out.print("Please input a number (can have decimals): ");
			number = input.nextDouble();

			// If the new number is smaller that the actual minValue, replace it
			// It WILL consider the negative numbers
			if (number < minNumber) {
				minNumber = number;
			}

			// In case the first input is less than zero, it will print zero in the end
			if ((number < 0.0d) && (count == 1)) {
				minNumber = 0.0d;
			}

			// Add 1 to the count
			count = count +1;

		}

		// Print the minumum greater than 2
		System.out.println("The minimum number from your input was " + minNumber);
	}
}