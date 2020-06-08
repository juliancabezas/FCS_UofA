class BinarySearch extends AbstractSearch {
	private Insert sortAlg;

	BinarySearch() {
		this.sortAlg = new Insert();
	}

	private int searchRec(int[] array, int item, int lower, int upper) {
		// Base case
		if (upper < lower) {
			return -1; // no item found
		}

		// Find middle element
		int middle = Math.round((upper+lower) / 2.0f);
		if (array[middle] == item) {
			return middle; // base case - item is found
		}

		if (item < array[middle]) { // use lower half
			return this.searchRec(array, item, lower, middle-1);
		} else { // use upper half
			return this.searchRec(array, item, middle+1, upper);
		}
	}

	public int search(int[] array, int item) {
		int[] indexMap = sortAlg.sortByIndex(array); // Sorting array first
		int sortedPos = this.searchRec(array, item, 0, array.length-1);
		int originalPos = indexMap[sortedPos]; // Find position in original unsorted array
		return originalPos;
	}

	public int search(Student[] array, Student item) {
		System.out.println("Not implemented");
		return -1;
	}
}