public class MergeSort extends MySortAlg{

    public int[] sort(int[] array) {
        
        // Dethermine the length of the array
        int arrayLength = array.length;

        // Base case
        if (arrayLength < 2) {
            return array;
        } else {

        // Find the fisrt and second half of the array
        int[] firstHalfArray = this.getFirstHalfArray(array); // This one includes the middle point
        int[] secondHalfArray = this.getSecondHalfArray(array); 

        // Call the sort function recursively in both cases
        firstHalfArray = sort(firstHalfArray);
        secondHalfArray = sort(secondHalfArray);

        // Merge both halves
        int [] mergedArray = this.mergeSorted(firstHalfArray,secondHalfArray);
        return mergedArray; 
        
        }

    }

    // Method to get the fisrt half of the array
    private int[] getFirstHalfArray(int[] array) {

        // Get the length of the array
        int arrayLength = array.length;

        // Get the middle of the matrix
        int middleIndex = Math.round(arrayLength/2.0f);

        // if the middle is greater than zero make the matrix
        if (middleIndex > 0) {

            int[] firstHalfArray = new int[middleIndex];

            // Loop thorugh the first part of the array, it does not include the middle
            for (int i = 0; i < middleIndex; i++){
                
                firstHalfArray[i] = array[i];

            }

            return firstHalfArray;
        
        // In case the middle is zero just return an emptu array 
        } else {
            int[] firstHalfArray = {};
            return firstHalfArray;
        }
    }

    
    // Method to get the second half of the array
    private int[] getSecondHalfArray(int[] array) {

        // Get the length of the array
        int arrayLength = array.length;

        // Get the middle of the matrix
        int middleIndex = Math.round(arrayLength/2.0f);

        // if the middle is greater than zero make the matrix
        if (middleIndex > 0) {

            // In this case the length is  middle +1 because it includes the middle
            int[] secondHalfArray = new int[arrayLength-middleIndex];

            int index = 0;

            // Loop thorugh the first part of the array, it does not include the middle
            for (int i = middleIndex; i < arrayLength; i++){
                
                secondHalfArray[index] = array[i];
                index++;

            }

            return secondHalfArray;
        
        // In case the middle is zero just return an empty array 
        } else {
            int[] secondHalfArray = {};
            return secondHalfArray;
        }
    }

    private int[] mergeSorted(int[] array1, int[] array2){

        // I will create two indexes to go through the two arrays
        int index1 = 0;
        int index2 = 0;
        
        // Get the lengths of the arrays
        int array1Length = array1.length;
        int array2Length = array2.length;

        int sumLengths = array1Length + array2Length;

        int[] mergedArray = new int[sumLengths];

        for (int i = 0; i < sumLengths; i++){

            // While both indexes are lower than the length go coping the bigger value
            if (index1 < array1Length && index2 < array2Length){

                // if array1 is bigger copy it into the merget matrix, if not go for array2
                if (array1[index1] > array2[index2]) {
                    mergedArray[i] = array1[index1];
                    index1++;
                    
                } else {
                    mergedArray[i] = array2[index2];
                    index2++;
                }

            // If there is an element in array 1 missing
            } else if (index1 < array1Length) {
                mergedArray[i] = array1[index1];
                index1++;
            // Same with array2
            } else if (index2 < array2Length) {
                mergedArray[i] = array2[index2];
                index2++;
            }

        }

        return mergedArray;


    }



}