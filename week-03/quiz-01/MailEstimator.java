import java.util.Scanner;

public class MailEstimator{
	public static void main(String[] args){

		// Create new scanner variable
		Scanner input = new Scanner(System.in);

		// Require input from the user
		System.out.println("Please read the weight of the package to post");
		System.out.print("Enter the weight of the package in grams: ");
		// Save it as int
		int weight = input.nextInt();

		// Declare variables
		double cost = 0.00d;
		double extraCost = 0.00d;
		long extraWeight = 0;

		// Weight between zero and 100, cost 3.00
		if ((weight >= 0) && (weight < 100)) {
			cost = 3.00d;
		} 
		// Weight between 100 and 500, cost 10.00
		else if ((weight >= 100) && (weight < 500)) {
			cost = 10.00d;
		}
		// Weight more than 500, one extra cent per extra gram
		else if (weight >= 500) {
			extraWeight = weight - 500;
			extraCost = (double) extraWeight * 0.01d;
			cost = 10.00d + extraCost;
		}
		else {
			// Get an error if the input weight is negative value
			throw new java.lang.RuntimeException("Please input a valid weight value");
		}

		// Priont the cost
		// The %.2f tells java to represent the number with 2 decimal places, 
		// as the dividion sometimes gives weird results
		System.out.printf("The total cost of your package is: $%.2f %n",cost);
	}
}