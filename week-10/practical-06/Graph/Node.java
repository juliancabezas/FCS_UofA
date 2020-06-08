class Node {
	private int index; // The index (position in the adjacency array), of this node

    // Basic constructor
	public Node() {
		this.index = 0;
	}

    // Parametrized constructor
	public Node(int index) {
		this.index = index;
    }
    
    // Prints the node index
    public void printNode(){
        System.out.print("Node " + this.index);
    }

    // Mutators and Accessors
    public int getIndex() {
        return this.index;
    }

    public void setIndex(int value) {
        this.index = value;
    }

}