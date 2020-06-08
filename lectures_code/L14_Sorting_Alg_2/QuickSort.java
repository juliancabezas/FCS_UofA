class QuickSort extends AbstractSort {
	public int[] sort(int[] array) {
		int n = array.length;
		if (n <= 1) { // base case
			return array;
		} else {
			// Select pivot
			int pivot = array[n-1];

			// Call sort recursively for subArr < pivot (assume that all elementa in an array are different)
			int[] left = this.getSmaller(array, pivot);
			left = this.sort(left);

			// Call sort recursively for subArr > pivot (assume that all elementa in an array are different)
			int[] right = this.getBigger(array, pivot);
			right = this.sort(right);

			// Concatenate [left, pivot, right]
			return this.concatenate(left, pivot, right);
		}
	}

	// Get all elements from array that are smaller than pivot
	private int[] getSmaller(int[] array, int pivot) {
		int count = 0;
		// Count num of elements < pivot
		for (int i = 0; i < array.length; i++) {
			if (array[i] < pivot) {
				count++;
			}
		}

		// Get elements < pivot
		int[] res = new int[count];
		int j = 0; // index for res
		for (int i = 0; i < array.length; i++) {
			if (array[i] < pivot) {
				res[j] = array[i];
				j++;
			}
		}
		return res;
	}

	// Get all elements from array that are bigger than pivot
	private int[] getBigger(int[] array, int pivot) {
		int count = 0;
		// Count num of elements > pivot
		for (int i = 0; i < array.length; i++) {
			if (array[i] > pivot) {
				count++;
			}
		}

		// Get elements > pivot
		int[] res = new int[count];
		int j = 0; // index for res
		for (int i = 0; i < array.length; i++) {
			if (array[i] > pivot) {
				res[j] = array[i];
				j++;
			}
		}
		return res;
	}

	// Concatenate arrays
	private int[] concatenate(int[] left, int pivot, int[] right) {
		int n1 = left.length;
		int n2 = right.length;
		int[] res = new int[n1+1+n2];
		int j = 0; // index for res

		// Copy all elements from left
		for (int i = 0; i < n1; i++) {
			res[j] = left[i];
			j++;
		}

		// Copy pivot
		res[j] = pivot;
		j++;

		// Copy all elements from right
		for (int i = 0; i < n2; i++) {
			res[j] = right[i];
			j++;
		}

		return res;

	}
}