public class Stack {
    
    // Top node of this stack
    private Node top;

    public Stack() {
        this.top = null;
    }

    // Put a new node at the top of the stack
    public void push(Node node){
        node.setNext(this.top); // Use setter to set the next to the previous top
        this.top = node;
    }

    // removes the top elements and returns it
    public Node pop() {

        // Check if the stack is empty, if it is return a message and a null element
        if (this.isEmpty()) {
            System.out.println("Stack is empty, returning null");
            return null;
        } else {
            Node temp = new Node(this.top.getInfo()); // Create a new node that I will return
            this.top = this.top.getNext(); // The new top will be the next element
            return temp;
        }

    }

    // returns the top element without changing the stack
    public Node peek() {

        // Check if the stack is empty, if it is return a message and a null element
        if (this.isEmpty()) {
            System.out.println("Stack is empty, returning null");
            return null;
        } else {
            return this.top; // Returns the top node of the stack
        }

    }

    // Method to check if the stack is empty
    public boolean isEmpty() {

        // If the top is null then the stack is empty
        if (this.top == null) {
            return true;
        } else {
            return false;
        }
    }

    // Prints the elements of the stack
    public void print() {

        // First check if the stack is empty
		if (this.isEmpty()) {
			System.out.println("Stack is empty.");
		} else {
            // Traverse the stack from the top
            Node temp = this.top;
            
            // Print the node information and get the next element until we reach a null element
			while(temp != null) {
				System.out.println(temp.getInfo());
				temp = temp.getNext();
			}
			System.out.println();
		}
	}

    // Getter and setters

    public Node getTop() {
        return this.top;
    }

    public void setTop(Node top) {
        this.top = top;
    }

}