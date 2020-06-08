// Import the Scanner library to receive user input

import java.util.Scanner;

public class MatrixDeterminantCalculation {

    public static void main(String[] args) {
     
        // Create an input object that contains the scanner methods
        Scanner input = new Scanner(System.in);

        // Create objects ffor the array determinant and the dimension index
        long arrayDeterminant;
        int dimIndex;

        // Empty 2x2 and 3x3 long arrays
        long [] [] inputArray2x2 = new long[2][2] ;
        long [] [] inputArray3x3 = new long[3][3] ;

                
        // Ask the user for the first option
        System.out.println("Welcome to Matrix Determinant Calculator!");
        System.out.println("Would you like to calculate the determinant of a new matrix?");
        System.out.println("1. Yes 2. No");
        System.out.print("Option: ");

        // Read the First character of the user input 
        char option = input.next().charAt(0);

        // Switch for the different options
        switch(option) {

            // Option 1 takes the user to the dimension input
            case '1':

                // Ask user for the dimension of the matrix, 2x2 or 3x3
                System.out.println("What is the dimension of the matrix?");
                System.out.println("a) 2x2 b) 3x3");
                System.out.print("Option: ");

                // Read the First character of the user input 
                char optionDim = input.next().charAt(0);

                // Exception handler in case the user throws a double; string or anything like that
                try {
                    switch(optionDim) {

                        // If a, calculate determinant for 2x2 matrix
                        case 'a':

                            System.out.println("Input: 2x2"); 

                            // The dimension index will be 1 as the matrix index starts from zero in java
                            dimIndex = 1;

                            // Input 2x2 matrix
                            for (int rows = 0;rows <= dimIndex; rows++) {
                                for (int cols =0; cols <= dimIndex; cols++) {

                                    // These are the index that are going to be shown to the user when requesting input
                                    int rowIndexUser = rows + 1;
                                    int colIndexUser = cols + 1;
                                    System.out.print("New matrix [" + rowIndexUser +"]["+ colIndexUser + "]:");

                                    long inputNumber = input.nextLong();

                                    inputArray2x2[rows][cols] = inputNumber;
                                }
                            }

                            /* Determminant calculation using the following formula
                            |a b| = ad - bc
                            |c d|
                            */
                            arrayDeterminant = (inputArray2x2[0][0] * inputArray2x2[1][1])
                                 - (inputArray2x2[0][1] * inputArray2x2[1][0]);

                            // Print results
                            System.out.println("");
                            System.out.println("The determinant of yout matrix is:");
                            System.out.println("");

                            // Print 2x2 matrix
                            for (int rows = 0;rows <= dimIndex; rows++) {

                                // Start each row with a "|"
                                System.out.print("| ");

                                // For llop for printing all elements of the matrix
                                for (int cols = 0; cols <= dimIndex; cols++) {

                                    System.out.print("" + inputArray2x2[rows][cols]);

                                    // In all columns but the last one print a comma
                                    if (cols != dimIndex){
                                        System.out.print(", ");
                                    }
                                }
                                System.out.println(" |");
                            }


                            // Print determinant result
                            System.out.println("");
                            System.out.println("Determinant:" + arrayDeterminant);

                            break;

                        // 3x3 dimension matrix
                        case 'b':
                            System.out.println("Input: 3x3"); 

                            // The dimension index will be 2 as the matrix index starts from zero in java
                            dimIndex = 2;

                            // Input matrix
                            for (int rows = 0;rows <= dimIndex; rows++) {
                                for (int cols =0; cols <= dimIndex; cols++) {

                                    // These are the index that are going to be shown to the user when requesting input
                                    int rowIndexUser = rows + 1;
                                    int colIndexUser = cols + 1;
                                    System.out.print("New matrix [" + rowIndexUser +"]["+ colIndexUser + "]:");

                                    long inputNumber = input.nextLong();

                                    inputArray3x3[rows][cols] = inputNumber;
                                }
                            }

                            /* Determminant calculation using the following formula
                            |a b c|
                            |d e f| = aei + bfg + cdh - ceg - bdi - afh
                            |g h i|
                            */
                            arrayDeterminant = (inputArray3x3[0][0] * inputArray3x3[1][1] * inputArray3x3[2][2]) 
                                + (inputArray3x3[0][1] * inputArray3x3[1][2] * inputArray3x3[2][0])
                                + (inputArray3x3[0][2] * inputArray3x3[1][0] * inputArray3x3[2][1])
                                - (inputArray3x3[0][2] * inputArray3x3[1][1] * inputArray3x3[2][0])
                                - (inputArray3x3[0][1] * inputArray3x3[1][0] * inputArray3x3[2][2])
                                - (inputArray3x3[0][0] * inputArray3x3[1][2] * inputArray3x3[2][1]);

                            System.out.println("");
                            System.out.println("The determinant of yout matrix is:");
                            System.out.println("");

                            // Print 3x3 matrix
                            for (int rows = 0;rows <= dimIndex; rows++) {

                                // Start each row with a "|"
                                System.out.print("| ");

                                // For llop for printing all elements of the matrix
                                for (int cols = 0; cols <= dimIndex; cols++) {

                                    System.out.print("" + inputArray3x3[rows][cols]);

                                    // In all columns but the last one print a comma
                                    if (cols != dimIndex){
                                        System.out.print(", ");
                                    }
                                }
                                System.out.println(" |");
                            }

                            System.out.println("");
                            System.out.println("Determinant:" + arrayDeterminant);

                            break;

                        // In case the user prints some other than a or b print an invalid option message
                        default:
                            System.out.println("Invalid option, exiting software");
                            break;
                    }

                } catch (Exception e) {
                    System.out.println("Invalid input, This software only accepts integer numbers");
                }

            break;
                
            // // 2 exists the software
            case '2':
                System.out.println("Bye Bye, see you next time!");
                break;

            // In case the user prints some other than 1 or 2 print an invalid option message
            default:
                System.out.println("Invalid option, exiting software");
                break;
        }

    }
}

