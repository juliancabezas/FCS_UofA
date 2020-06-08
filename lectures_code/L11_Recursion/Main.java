class Main {
	public static void main(String[] args) {
		// Read command line argument and parse it to int type
		int n = Integer.parseInt(args[0]);
		
		// int res = Recursion.factorial(n);
		// System.out.println(res);
		boolean isP = Recursion.isPrime(n);
		if (isP) {
			System.out.println(n + " is prime");
		} else {
			System.out.println(n + " is not prime");
		}
	}
}