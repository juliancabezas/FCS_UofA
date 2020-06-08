//==================================
// Foundations of Computer Science
// Student: Julian Cabezas Pena
// id: a1785086
// Semester: 1
// Year: 2020
// Practical Exam Number: 1
//===================================

// Public class Problem (same as file) and main method, output is void
public class Problem {
    public static void main(String[] args){

        // Define the top integer and the bottom integer of the series
        int topNumber = 101;
        int bottomNumber = 89;

        // For loop between the top and bottom integers
        for (int i = topNumber; i >= bottomNumber; i--){

            // If the counter is equal to the top integer print a square bracket in the beggining to start the count 
            if (i == topNumber) {
                System.out.print("[" + i + ", ");
            }
            // In between both top and bottom numbers, print and put a comma in betwwen numbers
            else if ((i < topNumber) && (i > bottomNumber)) {
                System.out.print("" + i + ", ");   			
            }
            // Finish with another square bracket when the count reaches the bottom number
            else if (i == bottomNumber) {
                System.out.println(""+ i + "]");
            }
        }

    }
}