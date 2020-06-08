class Bubble extends AbstractSort {
	public void sort(int[] array, boolean descending) {
		int n = array.length;
		boolean swapped = false; // check if anything was changed
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if (this.compareInt(array[j], array[j+1], descending) == 1)  {
					this.swap(array, j, j+1);
					swapped = true;
				}
			}

			if (!swapped) {  // nothing changed -> already sorted
				break;
			}
		}
	}
}