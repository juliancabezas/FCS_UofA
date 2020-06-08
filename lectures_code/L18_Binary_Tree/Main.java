class Main {
    public static void main(String[] args) {
        //        6
        //      /   \
        //     3     8
        //    / \   / \
        //   2   4 7   9

    	BinaryTree tree = new BinaryTree();
    	// tree.root = new Node(6);
    	// tree.root.left = new Node(3);
    	// tree.root.left.left = new Node(2);
    	// tree.root.left.right = new Node(4);
    	// tree.root.right = new Node(8);
    	// tree.root.right.left = new Node(7);
    	// tree.root.right.right = new Node(9);

    	tree.insert(6);
    	tree.insert(3);
    	tree.insert(8);
    	tree.insert(2);
    	tree.insert(4);
    	tree.insert(7);
    	tree.insert(9);

    	// Print tree in-order
    	tree.printInorder(); // 2 3 4 6 7 8 9
    	tree.printPreorder(); // 6 3 2 4 8 7 9
    	tree.printPostorder(); // 2 4 3 7 9 8 6
    }
}