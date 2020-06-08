
public class BaseOperations {

    // PRINT ARRAY METHODS

    // Method overloading

    // Using integer as input
    public void printArray(int [] array) {

        // Debugging purposes only
        // System.out.println("Using integer array method");

        // Start by printing the initial square bracket
        System.out.print("[");

        // Loop to print each element o f the array
        for (int i = 0; i < array.length; i++){
            System.out.print("" + array[i]);

            // In betwwen elements print a comma, exepting in the last element
            if (i < array.length -1) {
                System.out.print(",");
            }
        }

        // End with the cling bracket and go to a new line
        System.out.println("]");
    }

    // Using String as input
    public void printArray(String [] array) {

        // Debugging purposes only
        // System.out.println("Using String array method");

        // Start by printing the initial square bracket
        System.out.print("[");

        // Loop to print each element o f the array
        for (int i = 0; i < array.length; i++){
            System.out.print("" + array[i]);

            // In betwwen elements print a comma, exepting in the last element
            if (i < array.length -1) {
                System.out.print(",");
            }
        }

        // End with the cling bracket and go to a new line
        System.out.println("]");
    }

        // Using Float as input
    public void printArray(Float [] array) {

        // Debugging purposes only
        // System.out.println("Using float array method");

        // Start by printing the initial square bracket
        System.out.print("[");

        // Loop to print each element o f the array
        for (int i = 0; i < array.length; i++){
            System.out.print("" + array[i]);

            // In betwwen elements print a comma, exepting in the last element
            if (i < array.length -1) {
                System.out.print(",");
            }
        }

        // End with the cling bracket and go to a new line
        System.out.println("]");
    }

    // REVERSE ARRAY METHODS


    // Using integer as input
    public int[] reverseArray(int [] array) {

        // Debugging purposes only
        // System.out.println("Using integer array method");

        // Create a empty reversed array for the output, the same length as the input array
        int [] reversedArray = new int[array.length];

        // Create an index that will go down in the for loop
        int indexInputArray = array.length;

        // Loop that will be getting the last value of the array (indexInputArray and will put in the first of the reversed array)
        for (int i = 0; i < array.length; i++){

            // Starts from array.length to index = 0
            indexInputArray = indexInputArray -1;
            reversedArray[i] = array[indexInputArray];
        }

        return reversedArray;
    }


    // Using float as input
    public Float[] reverseArray(Float [] array) {

        // Debugging purposes only
        // System.out.println("Using integer array method");

        // Create a empty reversed array for the output, the same length as the input array
        Float [] reversedArray = new Float[array.length];

        // Create an index that will go down in the for loop
        int indexInputArray = array.length;

        // Loop that will be getting the last value of the array (indexInputArray and will put in the first of the reversed array)
        for (int i = 0; i < array.length; i++){

            // Starts from array.length to index = 0
            indexInputArray = indexInputArray -1;
            reversedArray[i] = array[indexInputArray];
        }

        return reversedArray;
    }


    // Using String as input
    public String[] reverseArray(String [] array) {

        // Debugging purposes only
        // System.out.println("Using String array method");

        // Create a empty reversed array for the output, the same length as the input array
        String [] reversedArray = new String[array.length];

        // Create an index that will go down in the for loop
        int indexInputArray = array.length;

        // Loop that will be getting the last value of the array (indexInputArray and will put in the first of the reversed array)
        for (int i = 0; i < array.length; i++){

            // Starts from array.length to index = 0
            indexInputArray = indexInputArray -1;
            reversedArray[i] = array[indexInputArray];
        }

        return reversedArray;
    }

}
