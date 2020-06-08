class BinaryTree {
	public Node root;

	public BinaryTree() {
		this.root = null;
	}

	public BinaryTree(int value) {
		this.root = new Node(value);
	}

	// In-order traverse tree and printing
	public void printInorder(Node root) {
		// Make sure tree/subtree is not empty 
		if (root != null) {
			// Print left subtree
			printInorder(root.left);
			
			// Print root
			System.out.print(root.value + " ");
			
			// Print right subtree
			printInorder(root.right);
		}
	}

	// Pre-order traverse tree and printing
	public void printPreorder(Node root) {
		// Make sure tree/subtree is not empty 
		if (root != null) {
			// Print root
			System.out.print(root.value + " ");

			// Print left subtree
			printPreorder(root.left);
			
			// Print right subtree
			printPreorder(root.right);
		}
	}

	// Post-order traverse tree and printing
	public void printPostorder(Node root) {
		// Make sure tree/subtree is not empty 
		if (root != null) {
			// Print left subtree
			printPostorder(root.left);
			
			// Print right subtree
			printPostorder(root.right);

			// Print root
			System.out.print(root.value + " ");
		}
	}


	// General print
	public void printInorder() {
		this.printInorder(this.root);
		System.out.println();
	}

	public void printPreorder() {
		this.printPreorder(this.root);
		System.out.println();
	}

	public void printPostorder() {
		this.printPostorder(this.root);
		System.out.println();
	}

	// Insert value in BST
	public Node insertRec(Node root, int value) {
		if (root == null) {
			root = new Node(value);
			return root;
		} else {
			// Going left
			if (value < root.value) {
				root.left = insertRec(root.left, value);
			} else if (value > root.value) { // going right
				root.right = insertRec(root.right, value);
			}
			return root;
		}
	}

	public void insert(int value) {
		this.root = this.insertRec(this.root, value);
	}

}