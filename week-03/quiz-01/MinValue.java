// The instructins pointed to get the minimum value but to track the maximum
// I tracked and printed both just in case

import java.util.Scanner;

public class MinValue {
	public static void main(String[] args){

		// New scanner object
		Scanner input = new Scanner(System.in);

		// Define variables, the maxnumber and minnumber variables are dummies
		// that will be replaced in the loop
		double number = 0.0d;
		double maxNumber = 0.0d;
		double minNumber = Double.MAX_VALUE;

		for (int i = 0; i < 10; i++) {

			// Ask for user input and store the number
			System.out.print("Pleate input a positive number (can have decimals): ");
			number = input.nextDouble();

			// If the new number is bigger that the actual maxValue, replace it
			if (number > maxNumber) {
				maxNumber = number;
			}

			// If the new number is smaller that the actual maxValue, replace it
			if (number < minNumber) {
				minNumber = number;
			}

		}

		// Print both the minumum and maximum
		System.out.println("The minimum number from your input was " + minNumber);
		System.out.println("The maximum number from your input was " + maxNumber);
	}
}