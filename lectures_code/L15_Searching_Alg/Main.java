class Main {
	public static void main(String[] args) {
		//Student item = new Student("Peter", 22);
		//Student[] array = {new Student("Maria", 19), new Student("John", 18), new Student("Peter", 22)};

		int item = 5;
		int[] array = {2, 9, 5, 22, 7};
		AbstractSearch searchAlg = new BinarySearch();
		int pos = searchAlg.search(array, item);
		System.out.println("Item found at position: " + pos);

		//Insert sortAlg = new Insert();
		//sortAlg.printArray(array);
		//int[] index = sortAlg.sortByIndex(array);
		//sortAlg.printArray(array);
		//sortAlg.printArray(index);

		//{2, 9, 5, 22, 7}
		//{2, 5, 7, 9, 22}
		//index = {0, 2, 4, 1, 3} - index mapping
		//new_pos = 1
		//old_pos = 2
		//index[new_pos] = old_pos

	}
}