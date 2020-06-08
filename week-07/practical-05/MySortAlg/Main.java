class Main {
    public static void main(String[] args) {
        
        // Define the test arrays and their answers
        int[] testArray1 = {25,8,7,2,36,100,75};
        int[] answerArray1 = {100,75,36,25,8,7,2};

        int[] testArray2 = {1547,2,2,8,549,2,89,458,6};
        int[] answerArray2 = {1547,549,458,89,8,6,2,2,2};

        int[] testArray3 = {-5,-999999,0,53};
        int[] answerArray3 = {53,0,-5,-999999};

        // Print the test array and their answers
        System.out.println("Test arrays:");

        System.out.print("Test Array 1: ");
        printArray(testArray1);

        System.out.print("Sorted test 1 is: ");
        printArray(answerArray1);

        System.out.print("Test Array 2: ");
        printArray(testArray2);

        System.out.print("Sorted test 2 is: ");
        printArray(answerArray2);

        System.out.print("Test Array 3: ");
        printArray(testArray1);

        System.out.print("Sorted test 3 is: ");
        printArray(answerArray3);

        // Test the insertion sort
        System.out.println("-------------------");
        System.out.println("Now we will test each of the methods");
        System.out.println("");
        System.out.println("---------------------");
        System.out.println("Testing insertion sort");

        // Create insertion sort object
        InsertionSort insertSort = new InsertionSort();

        // Sort the three matrices
        int[] insertSortResultArray1 = insertSort.sort(testArray1);
        int[] insertSortResultArray2 = insertSort.sort(testArray2);
        int[] insertSortResultArray3 = insertSort.sort(testArray3);

        // Print the results of the tests
        System.out.print("Test 1 Result: ");
        printArray(insertSortResultArray1);
        System.out.println("Test 1 Result: " + test(answerArray1, insertSortResultArray1));

        System.out.print("Test 2 Result: ");
        printArray(insertSortResultArray2);
        System.out.println("Test 2 Result: " + test(answerArray2, insertSortResultArray2));

        System.out.print("Test 3 Result: ");
        printArray(insertSortResultArray3);
        System.out.println("Test 3 Result: " + test(answerArray3, insertSortResultArray3));

        // Test the merge sort
        System.out.println("");
        System.out.println("---------------------");
        System.out.println("Testing merge sort");

        // Create merge sort object
        MergeSort mergeSort = new MergeSort();

        // Sort the three matrices
        int[] mergeSortResultArray1 = mergeSort.sort(testArray1);
        int[] mergeSortResultArray2 = mergeSort.sort(testArray2);
        int[] mergeSortResultArray3 = mergeSort.sort(testArray3);

        // Print the results of the tests
        System.out.print("Test 1 Result: ");
        printArray(mergeSortResultArray1);
        System.out.println("Test 1 Result: " + test(answerArray1, mergeSortResultArray1));

        System.out.print("Test 2 Result: ");
        printArray(mergeSortResultArray2);
        System.out.println("Test 2 Result: " + test(answerArray2, mergeSortResultArray2));

        System.out.print("Test 3 Result: ");
        printArray(mergeSortResultArray3);
        System.out.println("Test 3 Result: " + test(answerArray3, mergeSortResultArray3));

        // Test the quick sort
        System.out.println("");
        System.out.println("---------------------");
        System.out.println("Testing quick sort");

        // Create merge sort object
        QuickSort quickSort = new QuickSort();

        // Sort the three matrices
        int[] quickSortResultArray1 = quickSort.sort(testArray1);
        int[] quickSortResultArray2 = quickSort.sort(testArray2);
        int[] quickSortResultArray3 = quickSort.sort(testArray3);

        // Print the results of the tests
        System.out.print("Test 1 Result: ");
        printArray(quickSortResultArray1);
        System.out.println("Test 1 Result: " + test(answerArray1, quickSortResultArray1));

        System.out.print("Test 2 Result: ");
        printArray(quickSortResultArray2);
        System.out.println("Test 2 Result: " + test(answerArray2, quickSortResultArray2));

        System.out.print("Test 3 Result: ");
        printArray(quickSortResultArray3);
        System.out.println("Test 3 Result: " + test(answerArray3, quickSortResultArray3));
        
        //-----------------------------------------
        // Test the compare method
        System.out.println("");
        System.out.println("---------------------");
        System.out.println("Testing compare method");

        // Make two new testing arrays
        int[] testArray4 = {25,8,7,2,36,100,75};
        int[] testArray5 = {25,75,2,25,8,7,2};

        // Print the test arrays
        System.out.print("Test Array: ");
        printArray(testArray4);
        System.out.print("Againist: ");
        printArray(testArray5);

        // Test the compare method and print the result
        System.out.println("Test Result: " + compare(testArray4, testArray5));

        // Another set of arrays for testing
        int[] testArray6 = {1547,2,2,8,549,2,89,458,6};
        int[] testArray7 = {1547,549,458,89,8,6,2,2,2};

        // Print the arrays
        System.out.print("Test Array: ");
        printArray(testArray6);
        System.out.print("Againist: ");
        printArray(testArray7);

        // Test the compare method and print the result
        System.out.println("Test Result: " + compare(testArray6, testArray7));


        //-----------------------------------------
        // Test the findSmallestSum method
        System.out.println("");
        System.out.println("---------------------");
        System.out.println("Testing find smallest sum method");

        // Use a test array
        int[] testArray8 = {1547,2,458,89,8,6,2,57,1547};

        // Print the test array
        System.out.print("Test Array: ");
        printArray(testArray8);

        // Execute FindSmallestSum and print results
        System.out.println("Smallest Sum: " + findSmallestSum(testArray8));

        // Try with another test array, this time with negatives
        int[] testArray9 = {99,2,-5,-7,224,0};

        // Print the test array
        System.out.print("Test Array: ");
        printArray(testArray9);

        // Execute FindSmallestSum and print results
        System.out.println("Smallest Sum: " + findSmallestSum(testArray9));
    }

    // Function to test if two arrays are EXACTLY the same (same order also)
    public static boolean test(int[] array1, int[] array2){

        // Default of this function is true, if one number is not the same then return false
        boolean equalArrays = true;

        int array1Length = array1.length;
        int array2Length = array2.length;

        // Compare the arrays only if the length is the same ,
        if (array1Length == array2Length) {

            // go through all the elements of the array
            for (int i = 0; i < array1Length; i++){

                // if any of the elements is not equal return false
                if (array1[i] != array2[i]){
                    equalArrays = false;
                } 
            }

        } else {
            equalArrays = false;
        }
        return equalArrays;

    }

    // Method to test if two arrays have the same elements (can be in different order)
    public static boolean compare(int[] arr1, int[] arr2){

        // First I will initilizce a quicksort object
        QuickSort quickSort = new QuickSort();

        // Sort both arrays
        int[] array1Sorted = quickSort.sort(arr1);
        int[] array2Sorted = quickSort.sort(arr2);

        // I can use the above programmed method test to compare two sorted arayys
        return test(array1Sorted,array2Sorted);

    }

    // Find the sum of the two smaller elements
    public static int findSmallestSum(int[] array){

        // First I will initilizce a quicksort object
        QuickSort quickSort = new QuickSort();

        // Sort the array
        int[] arraySorted = quickSort.sort(array);

        // Find the array length
        int arrayLength = arraySorted.length;

        // the two last objects in the array and sum them
        return arraySorted[arrayLength-1] + arraySorted[arrayLength-2];


    }

    // Method to print an array in the console
    public static void printArray(int[] inputArray){

        // Print openung bracket
        System.out.print("[ ");

        for (int i = 0; i < inputArray.length; i++) {

            // Print each element of the array and a blank space
            System.out.print("" + inputArray[i]);
            System.out.print(" ");

        }

        // Print closing bracket
        System.out.println("]");

    }

}