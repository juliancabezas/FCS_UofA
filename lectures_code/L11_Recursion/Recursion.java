class Recursion {
	public static int factorial(int n) {
		System.out.println("--------------");
		System.out.printf("Computing factorial %d\n", n);
		// Base case 
		if (n == 0) {
			System.out.println("Reached the base case. Returning 1.");
			return 1;
		} else { // recursive call
			System.out.println("Going deeper...");

			int n1Fact = factorial(n-1);
			int res = n * n1Fact;

			System.out.println("--------------");
			System.out.printf("Back to n = %d call\n", n);
			System.out.printf("Found %d! = %d\n", (n-1), n1Fact);
			System.out.printf("Returning %d! = %d * %d = %d\n", n, n, n1Fact, res);
			return res;
		}
	}


	// Prime number N / 2,3,4,...,N-1
	private static boolean isPrimeRec(int n, int d) {
		// Base case
		if (n == d) {
			return true;
		} else if (n % d == 0) { // another base case
			return false;
		} else { // recursive call
			return isPrimeRec(n, d+1);
		}
	}

	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		} else {
			return isPrimeRec(n, 2);
		}
	}

	// n = 4, d = 2 -> false
	// n = 5, d = 2 -> n = 5, d = 3 -> n = 5, d = 4 -> n = 5, d = 5 -> true
}