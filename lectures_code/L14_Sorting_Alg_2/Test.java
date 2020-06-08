class Test {
	public static void main(String[] args) {
		//MergeSort sortAlg = new MergeSort();
		QuickSort sortAlg = new QuickSort();

		int[] array = {20, 5, 8, 3, 7};
		System.out.println("Before sort:");
		sortAlg.printArray(array);
		array = sortAlg.sort(array);
		System.out.println("After sort:");
		sortAlg.printArray(array);
	}
}