//==================================
// Foundations of Computer Science
// Student: Julian Cabezas
// id: a1785086
// Semester: 1
// Year: 2020
// Practical Exam Number: 2
//===================================

public class HandlingArrays {

        // Print an array
    public static void printArray(double [] testArray) {

        // Get length of array and store in dim
        int dim = testArray.length;

        // Start the printing with a "["
        System.out.print("[");

        for (int i=0; i < dim; i++){
            System.out.print("" + testArray[i]);

            // In all columns but the last one print a comma
            if (i != (dim-1)){
                System.out.print(", ");
            }
        }

        // Finish the printing with a "]"
        System.out.println("]");

    }

    // Add two arrays elementt wise
    public static double[] sumElements(double [] firstArray, double [] secondArray) {

        // Store both array length
        int dim1 = firstArray.length;
        int dim2 = secondArray.length;
        
        double[] resultArray = new double[dim1]; 

        // Throw runtime exeption if the arrays have different dimensions
        if (dim1 != dim2) {
    		throw new RuntimeException("Error - Arrays different shape");
        } else {
            // Add element by element
            for (int i=0; i < dim1; i++){

                resultArray[i] = firstArray[i] + secondArray[i];
    
            }
        }

    return resultArray;

    }

    
    public static double[] reverseArray(double [] testArray) {

        // Get length of array and store in dim
        int dim = testArray.length;

        double[] resultArray = new double[dim]; 

        for (int i=0; i < dim; i++){

            resultArray[i] = firstArray[i] + secondArray[i];

        }
    }

}