// Bubblesort algorithm, used in this case for the binary search algorthm
public class Bubble{
    
    // It returns a sorted array
    public static int[] sort(int[] array) {

        // Clone the array so it doesnt sort it in place
        int[] sortedArray = array.clone();

        // Get the length of the array 
        int arrayLength = sortedArray.length;

        boolean keepSorting = false;

        for (int i = 0; i < arrayLength-1; i++) {
            for (int j = 0; j < arrayLength-i-1; j++) {
                if (sortedArray[j] > sortedArray[j+1])  {
                    // Swap the original array and the index array
                    swap(sortedArray, j, j+1);
                    keepSorting = true;
                }
            }

            // Beack if no sorting is necessary (it is already sorted)
            if (!keepSorting) {  
                break;
            }
        }

        return sortedArray;

    }
    
    // It returns the index of an unsorted array, does not sort array in clace
    public static int[] sortIndex(int[] array) {

        // Clone the array so it doesnt sort it in place
        int[] sortedArray = array.clone();

        // Get nthe length of the array and make an array with a sequence from 0 to array length
        int arrayLength = sortedArray.length;
		int[] indexArray = generateIndexArray(arrayLength);

        boolean keepSorting = false;

        for (int i = 0; i < arrayLength-1; i++) {
            for (int j = 0; j < arrayLength-i-1; j++) {
                if (sortedArray[j] > sortedArray[j+1])  {
                    // Swap the original array and the index array
                    swap(sortedArray, j, j+1);
                    swap(indexArray, j, j+1);
                    keepSorting = true;
                }
            }

            // Beack if no sorting is necessary (it is already sorted)
            if (!keepSorting) {  
                break;
            }
        }

        return indexArray;

    }
    
    // Method to saw one element with another in an array
    public static void swap(int[] array, int i, int j) {
		int tmp = array[j];
		array[j] = array[i];
		array[i] = tmp;
    }
    
    // Generate array  with consecutive number from zero to n
	private static int[] generateIndexArray(int n) {

        // Generate an empty array of length equal to n
        int[] seqArray = new int[n];
        
        // Fill it with consecutive numbers
		for (int i = 0; i < seqArray.length; i++) {
			seqArray[i] = i;
		}
		return seqArray;
	}

}