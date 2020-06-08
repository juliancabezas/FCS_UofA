// Import the Scanner library to receive user input

import java.util.Scanner;

public class ComplexCalculator {

    public static void main(String[] args) {
     
        // Create an input object that contains the scanner methods
        Scanner input = new Scanner(System.in);

        // Methods for complex numbers
        ComplexCalculatorOperations complexOperations = new ComplexCalculatorOperations(); 

        // Create objects for the Real and imaginary components of the first number
        Double complexReal1;
        Double complexImaginary1;

        // Create objects for the Real and imaginary components of the second number
        Double complexReal2;
        Double complexImaginary2;

        // result array, index 0 is for the real component and index 1 is for the imaginary component
        Double[] complexResult;

        // I will use try-catch in case the user doesnt input an integer
        try {

            // Ask the user for the first number
            System.out.println("------------");
            System.out.println("This software will ask you for two imaginary numbers in the form a + bi");
            System.out.println("------------");
            System.out.println("First complex number (a + bi):");
            System.out.print("First number real component (a): ");

            // Create object with the real component of number1
            complexReal1 = input.nextDouble();

            System.out.print("First number imaginary compenent (b): ");

            // Create object with the real component of number1
            complexImaginary1 = input.nextDouble();

            // Now ask the user for the second complex number
            System.out.println("------------");
            System.out.println("Second complex number (ai + b):");
            System.out.print("Second number real component (a): ");

            // Create object with the real component of number2
            complexReal2= input.nextDouble();

            System.out.print("Second number imaginary component (b): ");
            
            // Create object with the imaginary component of number2
            complexImaginary2 = input.nextDouble();

            // Select an operation
            System.out.println("------------");
            System.out.println("Which operaion would you like to perform/");
            System.out.println("a) Additon");
            System.out.println("b) Substraction (First number - Second number)");
            System.out.println("c) Multiplication");
            System.out.println("b) Division (First number / Second number)");
            System.out.println("Enter any other character to exit");
            System.out.print("Option: ");

            // Read the First character of the user input 
            char option = input.next().charAt(0);

            //Switch for the different options
            switch(option) {

                // Adding two complex numbers using the methods contained in ComplexCalculationsOperations class and printing the operation and result
                case 'a':
                    complexResult = complexOperations.addComplex(complexReal1, complexImaginary1, complexReal2, complexImaginary2);
                    System.out.println("Operation: (" + complexReal1 + " + " + complexImaginary1 + "i)" + " + " + "(" + complexReal2 + " + " + complexImaginary2 + "i)");
                    System.out.println("Result = " + complexResult[0] + " + " + complexResult[1] + "i");
                    break;

                // Substracting two complex numbers using the methods contained in ComplexCalculationsOperations class and printing the operation and result
                case 'b':
                    complexResult = complexOperations.substractComplex(complexReal1, complexImaginary1, complexReal2, complexImaginary2);
                    System.out.println("Operation: (" + complexReal1 + " + " + complexImaginary1 + "i)" + " - " + "(" + complexReal2 + " + " + complexImaginary2 + "i)");
                    System.out.println("Result = " + complexResult[0] + " + " + complexResult[1] + "i");
                    break;

                // Multipliying two complex numbers using the methods contained in ComplexCalculationsOperations class and printing the operation and result
                case 'c':
                    complexResult = complexOperations.multiplyComplex(complexReal1, complexImaginary1, complexReal2, complexImaginary2);
                    System.out.println("Operation: (" + complexReal1 + " + " + complexImaginary1 + "i)" + " * " + "(" + complexReal2 + " + " + complexImaginary2 + "i)");
                    System.out.println("Result = " + complexResult[0] + " + " + complexResult[1] + "i");
                    break;

                // Dividing two complex numbers using the methods contained in ComplexCalculationsOperations class and printing the operation and result
                case 'd':
                    complexResult = complexOperations.divideComplex(complexReal1, complexImaginary1, complexReal2, complexImaginary2);
                    System.out.println("Operation: (" + complexReal1 + " + " + complexImaginary1 + "i)" + " / " + "(" + complexReal2 + " + " + complexImaginary2 + "i)");
                    System.out.println("Result = " + complexResult[0] + " + " + complexResult[1] + "i");
                    break;
                
                // If the user inputs anithing else just exit the program
                default:
                    System.out.println("Bye bye!");
                    break;
            }



        // If the user input is not a number return message
        } catch (Exception e) {
            System.out.println("Wrong input, please insert numbers");
            //e.printStackTrace();
            System.out.println("------------");
        }
    }
}

