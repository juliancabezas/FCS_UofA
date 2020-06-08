class Main {
    public static void main(String[] args) {
        // Test BST
        //       12
        //      /  \
        //     6    15
        //    / \     \
        //   4   5     19

		// Create empty tree
    	MyBST tree = new MyBST(); 

		// Insert elements into the tree
    	tree.insert(12);
		tree.insert(6);
    	tree.insert(5);
    	tree.insert(4);
    	tree.insert(15);
    	tree.insert(19);

		// Print tree in-order
		System.out.println("tree content (in order):");
		tree.print(); // I should get 4 5 6 12 15 19
		
		// Test the Search function
		System.out.println("");
		System.out.println("-------------------------");
		boolean test1 = tree.search(19);
		System.out.println("Is 19 in the tree? : " + test1);

		boolean test2 = tree.search(12);
		System.out.println("Is 12 in the tree? : " + test2);

		boolean test3 = tree.search(6);
		System.out.println("Is 6 in the tree? : " + test3);

		boolean test4 = tree.search(999);
		System.out.println("Is 999 in the tree? : " + test4);

		boolean test5 = tree.search(1);
		System.out.println("Is 1 in the tree? : " + test5);

		boolean test6 = tree.search(16);
		System.out.println("Is 16 in the tree? : " + test6);
    }
}