class Node {
	private int value; // Value of the node itself, data in the node
    private Node left; // Reference to the left, has to be smaller than the value of the node
    private Node right; // Reference to the right, has to be bigger than the value of the node

    // Basic constructor, initialized the value to zero and the left and right references to null
	public Node() {
		this.value = 0;
		this.left = null;
		this.right = null;
	}

    // Parametrized constructor
	public Node(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
    }
    
    // Prints the node data
    public void printNode(){
        System.out.println("Node data: " + this.value);
    }

    // Mutators and Accessors
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return this.left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return this.right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

}