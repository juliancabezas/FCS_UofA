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
        int topNumber = 40;
        int bottomNumber = 1;

        // Create an empty string for the output
        String markerOutput = "";

        // For loop between the bottom and top integers
        for (int i = bottomNumber; i <= topNumber; i++){

            // Define an empty marker string
            String marker = "";

            // If number belongs to [1,10), use a * as marker
            if ((i > 0) && (i < 10)) {
                marker = "*"; 
            }
            // If number belongs to [10,20), use a = as marker
            else if ((i >= 10) && (i < 20)) {
                marker = "="; 
            }
            // If number belongs to [20,30), use a x as marker
            else if ((i >= 20) && (i < 30)) {
                marker = "x"; 
            }
            // If number belongs to [30,40], use a o as marker
            else if ((i >= 30) && (i <= 40)) {
                marker = "o"; 
            }
            // Loop to concatenate the numbers n times depending on the number
            for (int j = 0; j < i; j++) {
                markerOutput = markerOutput + marker;
            }

            // Print the markers
            System.out.println(markerOutput);

            // Put back the markeroutput to empty
            markerOutput = "";

        }

    }
}