class Test {
	public static void main(String[] args) {
		Bubble sortAlg = new Bubble();
		//Insert sortAlg = new Insert();
		//Select sortAlg = new Select();

		int[] array = {20, 5, 8, 3, 7};
		boolean descending = false;
		System.out.println("Before sort:");
		sortAlg.printArray(array);
		sortAlg.sort(array, descending);
		System.out.println("After sort:");
		sortAlg.printArray(array);
	}
}