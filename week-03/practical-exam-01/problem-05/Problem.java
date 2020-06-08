//==================================
// Foundations of Computer Science
// Student: Julian Cabezas Pena
// id: a1785086
// Semester: 1
// Year: 2020
// Practical Exam Number: 1
//===================================

public class Problem{
	public static void main(String [] args){

		// The output says this has to be the first line although it says its the last line, just following instructions
		System.out.println("This is the last line of the code!");

		// Define the ths variable
		int ths = 25;

		// i has to be the fisrt for to start, as j needs it to be already declared
		for(int i = 0; i < 10; i++){

			// j after i, then k will require j to be already declared
			for(int j = i; j < 10; j++){

				// Last loop is k, that starts from j
				for (int k = j; k < 10; k ++){

				// Calculate the value
				int value = i * j * k;

					// Only print thew value if its equal to zero 
					if(value != 0){

						// Print the value if its a multiple of 25
						if(value % ths == 0 ){

							// Print, i, then j, and then the k and value
							System.out.print("i: " + i);
							System.out.print(" j: " + j);
							System.out.println(" k: " + k + " - value " + value);
						}
					}
				}
			}
		}

		// Although it says first, acording to the instructions it has to be the last
		System.out.println("This is the first line of the code!");

	}
}









