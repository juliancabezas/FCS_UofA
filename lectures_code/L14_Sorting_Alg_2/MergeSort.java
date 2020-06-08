class MergeSort extends AbstractSort {
	public int[] sort(int[] array) {
		int n = array.length;
		if (n <= 1) { // base case
			return array;
		} else { // recursive call
			int middle = Math.round(n/2.0f);

			// Call sort recursively for left part
			int[] left = this.getSubArr(array, 0, middle); // array[0 ... middle-1]
			left = this.sort(left);

			// Call sort recursively for right part
			int[] right = this.getSubArr(array, middle, n); // array[middle ... n-1]
			right = this.sort(right);

			// Merge sorted arrays
			int[] merged = this.merge(left, right);
			return merged;
		}
	}

	// Return sub array from start element to end exclusively: array[start, start+1, ..., end-1]
	private int[] getSubArr(int[] array, int start, int end) {
		int n = end-start;

		if (n < 1) {
			int[] subArr = {};
			return subArr;
		} else {
			int[] subArr = new int[n];
			int j = 0; // index for subArr

			for (int i = start; i < end; i++) {
				subArr[j] = array[i];
				j++;
			}
			return subArr;
		}
	}

	// Merge two sorted array into sorted array
	private int[] merge(int[] left, int[] right) {
		int n1 = left.length;
		int n2 = right.length;
		int[] res = new int[n1+n2];

		int i1 = 0, i2 = 0, j = 0;
		// Merge elements
		while (i1 < n1 && i2 < n2) {
			if (left[i1] < right[i2]) {
				res[j] = left[i1];
				i1++;
			} else {
				res[j] = right[i2];
				i2++;
			}
			j++;
		}

		// Add all elements that left in any array
		while (i1 < n1) {
			res[j] = left[i1];
			j++;
			i1++;
		}

		while (i2 < n2) {
			res[j] = right[i2];
			j++;
			i2++;
		}

		return res;
	}
}