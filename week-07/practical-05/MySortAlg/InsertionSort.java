class InsertionSort extends MySortAlg {

    public int[] sort(int[] array) {

        // Make an object with the length of the sorted array
        int arrayLength = array.length;

        // I create the object for the sorted array that will be the result
        int[] sortedArray = array.clone();

        // Go through the elements of the array
        for (int i = 1; i < arrayLength; i++){
            
            // This is the element we are going to sort
            int keyElement = sortedArray[i];

            int j = i-1;

            // Move the elements to the right to make space
            while (j >= 0 && sortedArray[j] < keyElement){

                sortedArray[j+1] = sortedArray[j];
                j = j - 1;

            }

            // Put the element in the right place
            sortedArray[j+1] = keyElement;

        }

        return sortedArray;

    }

} 