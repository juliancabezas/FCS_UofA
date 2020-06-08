

public class ComplexCalculatorOperations {

	// Method for adding two complex numbers
    public static Double[] addComplex(Double complexReal1, Double complexImaginary1, Double complexReal2, Double complexImaginary2) {

    	// Create empty result matrix
        Double [] complexResult = new Double[2];

        // Try catch in case there is an error in the operation
        try {

        	// Add the real components
            complexResult[0] = complexReal1 + complexReal2;

            // Ass the imaginary components
            complexResult[1] = complexImaginary1 + complexImaginary2  ;  
        
        // Throw error message in case something goes wrong
        } catch(Exception e){
            System.out.println("Error when adding complex number");
            //e.printStackTrace();
        }

        return complexResult;
    }

    // Method for substractions a complex number
    public static Double[] substractComplex(Double complexReal1, Double complexImaginary1, Double complexReal2, Double complexImaginary2) {

    	// Empty output matrix
        Double [] complexResult = new Double[2];

        // Try catch in case there is an error in the operation
        try {

        	// Substract the real components
            complexResult[0] = complexReal1 - complexReal2;

            // Substracty the imaginary components
            complexResult[1] = complexImaginary1 - complexImaginary2  ;  
        
        // Throw error message in case something goes wrong 
        } catch(Exception e){
            System.out.println("Error when substracting complex number");
            //e.printStackTrace();
        }

        return complexResult;
    }

    // Method to multiply complex numbers
    public static Double[] multiplyComplex(Double complexReal1, Double complexImaginary1, Double complexReal2, Double complexImaginary2) {

        Double [] complexResult = new Double[2];

        /* I will use the FOIL method
        (a + bi) * (c + di) = ac + adi +bci +bdi2
        Solving it:
        (ac - bd) + (ad + bc) i */

        // Try catch in case there is an error in the operation
        try {

        	// Determining real component
            complexResult[0] = (complexReal1 * complexReal2) - (complexImaginary1 * complexImaginary2);

            // Determining imaginary component
            complexResult[1] = (complexReal1 * complexImaginary2) + (complexImaginary1 * complexReal2)  ;  

        // Throw error message in case something goes wrong
        } catch(Exception e){
            System.out.println("Error when multipling complex numbers");
            //e.printStackTrace();
        }

        return complexResult;
    }

    public static Double[] divideComplex(Double complexReal1, Double complexImaginary1, Double complexReal2, Double complexImaginary2) {

        Double [] complexResult = new Double[2];

        /* To perform the division of two complex numbers we need to multiply it by its conjugate
        (a+bi)/(c+di) * (c-di)/(c-di)
        Solving
        ((ac+bd)+(bc-ad)i) / (c2 + d2)
        */

        // Try catch in case there is an error in the operation
        try {

        	//Determine the real component
            complexResult[0] = ((complexReal1 * complexReal2) + (complexImaginary1 * complexImaginary2)) / ((complexImaginary2 * complexImaginary2) + (complexReal2 * complexReal2)) ;

            // Determine the imaginary component
            complexResult[1] = ((complexImaginary1 * complexReal2) - (complexReal1 * complexImaginary2)) / ((complexImaginary2 * complexImaginary2) + (complexReal2 * complexReal2)) ;  

        
        // Throw error message in case something goes wrong
        } catch(Exception e){
            System.out.println("Error when dividing complex numbers, solution does not exists");
            //e.printStackTrace();
        }

        return complexResult;
    }
}
