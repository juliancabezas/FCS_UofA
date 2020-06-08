// The instructins pointed to get the minimum value but to track the maximum
// I tracked and printed both just in case

import java.util.Scanner;

public class MinValue2 {
	public static void main(String[] args){

		// New scanner object
		Scanner input = new Scanner(System.in);

		// Define variables, the maxnumber and minnumber variables are dummies
		// that will be replaced in the loop
		double number = 0.0d;
		double minNumber = Double.MAX_VALUE;

		for (int i = 0; i < 10; i++) {

			// Ask for user input and store the number
			System.out.print("Please input a positive number (can have decimals): ");
			number = input.nextDouble();

			// If the new number is smaller that the actual minValue and greater than 2.0, replace it
			if ((number < minNumber) && (number > 2.0d)) {
				minNumber = number;
			}

		}

		// Print the minumum greater than 2
		System.out.println("The minimum number greater than 2.0 from your input was " + minNumber);
	}
}