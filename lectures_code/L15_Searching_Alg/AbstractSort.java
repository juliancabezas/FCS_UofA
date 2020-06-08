abstract class AbstractSort {
	abstract int[] sort(int[] array);

	public void printArray(int[] array) {
		System.out.print("[ ");
		for (int i=0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("]");
	}

	public void swap(int[] array, int i, int j) {
		int tmp = array[j];
		array[j] = array[i];
		array[i] = tmp;
	}
}