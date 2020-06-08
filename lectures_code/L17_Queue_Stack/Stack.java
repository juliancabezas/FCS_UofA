class Stack {
	private Node top;

	Stack() {
		this.top = null;
	}

	// Push new element on top of the stack
	public void push(Node newNode) {
		newNode.next = this.top;
		this.top = newNode;
	}

	// Pop an element from the top of the stack
	//public int pop()
	//public Node pop()
	public void pop() {
		// Check if it's empty
		if (this.top == null) {
			System.out.println("Can't remove, stack is empty.");
		} else {
			this.top = this.top.next;
		}
	}

	public void print() {
		// Check if it's empty
		if (this.top == null) {
			System.out.println("Stack is empty.");
		} else {
			Node tmp = this.top;
			while(tmp != null) {
				System.out.println(tmp.value);
				System.out.println("|");
				tmp = tmp.next;
			}
			System.out.println();
		}
	}
}