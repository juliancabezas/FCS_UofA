class LinearSearch extends AbstractSearch {
	public int search(int[] array, int item) {
		System.out.println("Not implemented");
		return -1;
	}

	public int search(Student[] array, Student item) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(item)) { // if they are equal -> found an item
				return i; // return its position
			}
		}
		// Item is not in this array
		return -1;
	}
}