import java.util.Scanner;

class Menu {
	
	public static void displayMenu() {
		System.out.println("---------------------------");
		System.out.println("Welcome to Calculator!!!");
		System.out.println("---------------------------");
		System.out.println("Options:");
		System.out.println("1) sum");
		System.out.println("2) sub");
		System.out.println("3) multiply");
		System.out.println("4) divide");
		System.out.println("0) exit");
	}

	public static int readInput() {
		Scanner input = new Scanner(System.in);
		int res = 0;
		boolean getInput = false;
		
		while(!getInput) {
			System.out.print("Your input: ");
			try {
				res = input.nextInt();
				getInput = true;
			}
			catch (Exception e) {
				System.out.println("Please input integer number!");
				input.next();
			}
		}
		
		return res;
	}

}