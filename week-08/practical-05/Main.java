public class Main {
    public static void main(String[] args) {
        
        // Test arrays for the searching methods

        // Test array number one
        int[] testArray1 = {54,2,-5,0,1};
        // The number that the algorithm needs to find
        int findNumber1 = -5;
        // The answer that the algorithm should give, as the -5 element is in the position 2
        int answerIndex1 = 2;

        // Same with two other test cases
        int[] testArray2 = {35345,-345,0,2,1,5};
        int findNumber2 = 3;
        int answerIndex2 = -1; // Number three is not in the array, so it should return -1

        int[] testArray3 = {45,6,-99,987,9999};
        int findNumber3 = 45;
        int answerIndex3 = 0; // 45 is in the first position, so it should return a zero
        
        //-------------------------------------
        // test the linear search method

        // Intiialize a linear search object
        LinearSearch linearSearch = new LinearSearch();

        // Result for the first test case
        int indexLinear1 = linearSearch.search(testArray1, findNumber1);

        System.out.println("");
        System.out.println("Test number 1 - Linear search algorithm");
        System.out.println("The number " + findNumber1 + " is in position " + indexLinear1 + " of array:");
        printArray(testArray1);
        System.out.println("Results are: " + test(indexLinear1,answerIndex1));

        // Results for the second use case
        int indexLinear2 = linearSearch.search(testArray2, findNumber2);

        System.out.println("");
        System.out.println("Test number 2 - Linear search algorithm");
        System.out.println("The number " + findNumber2 + " is in position " + indexLinear2 + " of array:");
        printArray(testArray2);
        System.out.println("Results are: " + test(indexLinear2,answerIndex2));

        // Results for the third use case
        int indexLinear3 = linearSearch.search(testArray3, findNumber3);

        System.out.println("");
        System.out.println("Test number 3 - Linear search algorithm");
        System.out.println("The number " + findNumber3 + " is in position " + indexLinear3 + " of array:");
        printArray(testArray3);
        System.out.println("Results are: " + test(indexLinear3,answerIndex3));


        //-------------------------------------
        // Test the binary search method

        // Intialize a Binary search object
        BinarySearch binarySearch = new BinarySearch();

        System.out.println("");
        System.out.println("----------------------------------");
        System.out.println("Testing the Binary Search algorithm");

        // Result for the first test case
        int indexBinary1 = binarySearch.search(testArray1, findNumber1);

        System.out.println("");
        System.out.println("Test number 1 - Binary search algorithm");
        System.out.println("The number " + findNumber1 + " is in position " + indexBinary1 + " of array:");
        printArray(testArray1);
        System.out.println("Results are: " + test(indexBinary1,answerIndex1));

        // Results for the second use case
        int indexBinary2 = binarySearch.search(testArray2, findNumber2);

        System.out.println("");
        System.out.println("Test number 2 - Binary search algorithm");
        System.out.println("The number " + findNumber2 + " is in position " + indexBinary2 + " of array:");
        printArray(testArray2);
        System.out.println("Results are: " + test(indexBinary2,answerIndex2));

        // Results for the third use case
        int indexBinary3 = binarySearch.search(testArray3, findNumber3);

        System.out.println("");
        System.out.println("Test number 3 - Binary search algorithm");
        System.out.println("The number " + findNumber3 + " is in position " + indexBinary3 + " of array:");
        printArray(testArray3);
        System.out.println("Results are: " + test(indexBinary3,answerIndex3));


        //-----------------------------------------------
        // Test the Find Maximum value method

        System.out.println("");
        System.out.println("----------------------------------");
        System.out.println("Testing the FindMaxValue method");
        System.out.println("");

        // Test cases
        int[] testArray4 = {1,5,8,12,9,7,-1};
        int answerTest4 = 3; // Max value is 12 and is in position 4

        int[] testArray5 = {1,15,0};
        int answerTest5 = 1; // Max value is 15 and is in position 1

        // Testing the first case
        int indexMax4 = findMaxvalue(testArray4);
        System.out.println("The maximum number is in position " + indexMax4 + " of array:");
        printArray(testArray4);
        System.out.println("Results are: " + test(indexMax4,answerTest4));

        // Testing the second case case
        int indexMax5 = findMaxvalue(testArray5);
        System.out.println("The maximum number is in position " + indexMax5 + " of array:");
        printArray(testArray5);
        System.out.println("Results are: " + test(indexMax5,answerTest5));

    }


    // Method to test if the searching algorithms are working correctly
    // It compares two integer and returns true if both are equal
    public static boolean test(int result, int ans){

        boolean isEqual;

        if (result == ans) { // If both numbers are the same return true
            isEqual = true;
        } else {
            isEqual = false;
        }

        return isEqual;

    }

    // Method to print an array in the console
    public static void printArray(int[] inputArray){

        // Print opening bracket
        System.out.print("[ ");

        for (int i = 0; i < inputArray.length; i++) {

            // Print each element of the array and a blank space
            System.out.print("" + inputArray[i]);
            System.out.print(" ");

        }

        // Print closing bracket
        System.out.println("]");

    }

    // Method to find the index of the maximum value in an array
    private static int findMaxvalue(int[] array){

        // First find the maximum value, starts from the initial value of the array
        int maxValue = array[0];

        // Go through the array
        for (int i = 0; i < array.length; i++){

            if (array[i] > maxValue) {
                maxValue = array[i]; // if the element is bigger than the max replace the max value
            }

        }

        // Not using the binary search find the index of the max value and return it
        BinarySearch binarySearch = new BinarySearch();
        return binarySearch.search(array,maxValue);

    }
}