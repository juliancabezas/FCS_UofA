abstract class MySortAlg {
    
    abstract int[] sort(int[] array);

    // Swaps element of an array and returns a new array
    public int[] swapElement(int[] array, int index1, int index2){

        // I create the new swapped array
        int[] swappedArray = array;

        // Store both elements in temporary integers
        int tmp1 = swappedArray[index1];
        int tmp2 = swappedArray[index2];

        // Put the temprary elements in the array
        swappedArray[index1] = tmp2;
        swappedArray[index2] = tmp1;

        return swappedArray;

    }

}