class BinarySearch extends MySearchAlg {

    // Search method with only the array and the number as inputs
    public int search(int[] array, int num) {

        // Fisrt sort the array using Bubble
        int[] sortedArray = Bubble.sort(array);

        // Get the indexes of the arrays
        int[] indexSorted = Bubble.sortIndex(array); // Sorting array first

        // Get the position of the sorted array usign the recursive method
        int sortedPosition = this.searchRecursive(sortedArray, num, 0, array.length-1);
        
        int originalPosition;

        // Get the position of the element in the original array and return it
        if (sortedPosition == -1) {
            return -1; // If the number was not found return -1
        } else {
            originalPosition = indexSorted[sortedPosition]; // Find position in original unsorted array
		    return originalPosition;
        }
	}

    // Method to search an array recursivery, REQUIRES A SORTED ARRAY
	private int searchRecursive(int[] array, int num, int smaller, int bigger) {

		// This is the base case, when the samller than the medianIndex element is bigger than the "bigger than the medianIndex" element
		if (bigger < smaller) {
            // Return -1 is the number is not found
			return -1; 
		}

		// Find the index where the median is
        int medianIndex = Math.round((bigger+smaller) / 2.0f);
        
        // When the only element that is found is the same as the medianIndex returns that medianIndex index
		if (array[medianIndex] == num) {
			return medianIndex; 
		}

        // Find the median
        int median = array[medianIndex];

        //  if the number is smaller than the median search it in the smaller part of the array
		if (num < median) { 
            return this.searchRecursive(array, num, smaller, medianIndex-1);
            
        // if it is bigger use the bigger part of the array
		} else { 
			return this.searchRecursive(array, num, medianIndex+1, bigger);
		}
	}



}