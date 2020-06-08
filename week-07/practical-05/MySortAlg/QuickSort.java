import java.util.Random;

class QuickSort extends MySortAlg{
    public int[] sort(int[] array) {

        int arrayLength = array.length;

        // New random object to generate random numbers
        Random ran = new Random();

        // Base case
        if (arrayLength < 2) {
            return array;
        } else {

            // The pivot will be a random number on the array
            int pivotIndex = ran.nextInt(arrayLength);
            int pivot = array[pivotIndex];

            // Get the part of the matrix that is bigger and the one that is smaller
            int[] smallerPart = getSmallerPart(array, pivot);
            int[] biggerPart = getBiggerPart(array, pivot);

            // Get the part of the the array that is equal to the pivot
            int[] equalPart = getEqualPart(array, pivot);

            // Call the sort function recursively on both parts
            smallerPart = sort(smallerPart);
            biggerPart = sort(biggerPart);

            int[] mergedArray = concatenateArray(biggerPart,smallerPart, equalPart);
            return mergedArray;

        }

    }
    
    
    // Method to get the smaller than the pivot part of the matrix
    private int[] getSmallerPart(int[] array, int pivot) {
    
        int resultLength = 0;

        // Count the number of elements in the array that are smaller than the pivot
        for (int i = 0; i < array.length; i++) {
            if (array[i] < pivot) {
                resultLength++;    
            }
        }

        int[] resultArray = new int[resultLength];

        int indexResultArray = 0;

        // Make the resulting array
        for(int j = 0; j < array.length; j++) {

            if (array[j] < pivot) {
                resultArray[indexResultArray] = array[j];
                indexResultArray++;
            }


        }

        return resultArray;
    }



    // Method to get the smaller than the pivot part of the matrix
    private int[] getBiggerPart(int[] array, int pivot) {
    
        int resultLength = 0;

        // Count the number of elements in the array that are smaller than the pivot
        for (int i = 0; i < array.length; i++) {
            if (array[i] > pivot) {
                resultLength++;    
            }
        }

        // Make the empty resulting array
        int[] resultArray = new int[resultLength];

        int indexResultArray = 0;

        // Make the resulting array
        for(int j = 0; j < array.length; j++) {

            if (array[j] > pivot) {
                resultArray[indexResultArray] = array[j];
                indexResultArray++;
            }


        }

        return resultArray;
    }

    // Method to get the smaller than the pivot part of the matrix
    private int[] getEqualPart(int[] array, int pivot) {

        int resultLength = 0;

        // Count the number of elements in the array that are smaller than the pivot
        for (int i = 0; i < array.length; i++) {
            if (array[i] == pivot) {
                resultLength++;    
            }
        }
        
        // Make the empty resulting array
        int[] resultArray = new int[resultLength];

        int indexResultArray = 0;

        // Make the resulting array
        for(int j = 0; j < array.length; j++) {

            if (array[j] == pivot) {
                resultArray[indexResultArray] = array[j];
                indexResultArray++;
            }


        }

        return resultArray;
    }

    private int[] concatenateArray(int[] array1, int[] array2, int[] arrayPivot){

        // Get the length of the two arrays and add 1 for the pivot
        int lengthResultArray = array1.length + array2.length + arrayPivot.length;

        // Make the resulting array
        int[] resultArray = new int[lengthResultArray];

        int index = 0;

        // Put the first array into the result matrix
        for (int i = 0; i < array1.length; i++) {

            resultArray[index] = array1[i];
            index++;
        }

        // Put the array that is equal to the pivot into the result matrix
        for (int i = 0; i < arrayPivot.length; i++) {

            resultArray[index] = arrayPivot[i];
            index++;
        }

        // Now the second array
        for (int j = 0; j < array2.length; j++ ) {
            
            resultArray[index] = array2[j];
            index++;
        }

        return resultArray;

    }

}