class MyBST {
	private Node root; // Root of the binary search tree

	// Empty BST constructor
	public MyBST() {
		this.root = null;
	}

	// Parametrized constructor including a root
	public MyBST(int value) {
		this.root = new Node(value);
    }

	// Print without expliciting the root, uses the in order printing
	public void print() {
		this.printInorder(this.root);
		System.out.println();
	}

	// Print the tree (with in order traverse)
	public void printInorder(Node root) {

		// Only print if the root is not empty
		if (root != null) {

			// Print subtree to the left
            printInorder(root.getLeft());
            
			// Print the root of the tree
			System.out.print(root.getValue() + " ");

			// Print right subtree
			printInorder(root.getRight());
		}
	}


    // Calls the recursive function without having to put the root
	public void insert(int value) {

        this.root = this.insertRec(this.root, value);
        
    }
    
	// Insert a specific value in the BST using recursion
	public Node insertRec(Node root, int value) {

		if (root != null) {

            // Check if the node is already in the BST, if it is there print message and return null
            if (value == root.getValue()) {
                System.out.println("Node is in the tree");
                return null;
            } else {
				// Check if the value is smaller to the root and go to the left of the BST
				if (value < root.getValue()) {

					root.setLeft(insertRec(root.getLeft(), value));
				
				// If it is bigger than the root go to the right
				} else if (value > root.getValue()) { 

					root.setRight(insertRec(root.getRight(), value));
				}
				return root;
            }

            
		} else {
            // If the BST is null just create a new node and put it in the root
			root = new Node(value);
			return root;
		}
	}

	
	// Calls the recursive function without having to put the root
	public boolean search(int value) {

		return this.searchRec(this.root, value);
		
	}

	// Search a specific value in the BST using recursion
	public boolean searchRec(Node current, int value) {

		// If the node is empty it means the nod ewas not found or that the BST is empty
		if (current == null) {
			return false;
		}

		// If the value is equal to the current node value it means the value vas found (return true)
		if (current.getValue() == value) {
			return true;

		// Search recursively
		} else {

			// Default result if false
			boolean result = false;

			// If the value is smaller than the node value search to the left
			if(current.getValue() > value) {
				result = searchRec(current.getLeft(), value);

				if (result) {
					return true;
				}

			// If the value is bigger than the node value search to the right
			} else {
				result = searchRec(current.getRight(), value);

				if (result) {
					return true;
				}
			}

			return result;
		}
	}


	// Getter and setter
	public Node getRoot() {
		return this.root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

}