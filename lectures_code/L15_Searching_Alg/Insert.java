class Insert extends AbstractSort {
	public int[] sort(int[] array) {
		int n = array.length;
		// Loop through array elements as keys
		for (int i = 1; i < n; i++) {
			int key = array[i]; // key element

			// Find the position to insert key element
			int j = i-1; // searching to the left from key
			while (j >= 0 && array[j] > key) {
				// Move elements to right to free space for key element
				array[j+1] = array[j];
				j--;
			}
			// Insert key element
			array[j+1] = key;
		}

		return array;
	}

	// Sorts array in-place and return index mapping
	public int[] sortByIndex(int[] array) {
		int n = array.length;
		int[] index = this.getIndex(n);

		// Loop through array elements as keys
		for (int i = 1; i < n; i++) {
			int key = array[i]; // key element
			int keyIndex = index[i]; 

			// Find the position to insert key element
			int j = i-1; // searching to the left from key
			while (j >= 0 && array[j] > key) {
				// Move elements to right to free space for key element
				array[j+1] = array[j];
				index[j+1] = index[j];
				j--;
			}
			// Insert key element
			array[j+1] = key;
			index[j+1] = keyIndex;
		}

		return index;
	}

	// Generate array {0, 1, ..., n-1}
	private int[] getIndex(int n) {
		int[] res = new int[n];
		for (int i = 0; i < n; i++) {
			res[i] = i;
		}
		return res;
	}
}