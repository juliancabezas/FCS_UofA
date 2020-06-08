class Main {
	public static void main(String[] args) {
		// Stack stack = new Stack();
		// stack.print(); // 
		// stack.push(new Node(5));
		// stack.push(new Node(8));
		// stack.print(); // 8 -> 5
		// stack.push(new Node(2));
		// stack.print(); // 2 -> 8 -> 5
		// stack.pop();
		// stack.print(); // 8 -> 5
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.print(); // 

		Queue queue = new Queue();
		queue.print(); //
		queue.enqueue(new Node(5));
		queue.enqueue(new Node(8));
		queue.enqueue(new Node(2));
		queue.print(); // 2 -> 8 -> 5
		queue.dequeue();
		queue.print(); // 2 -> 8
		queue.dequeue();
		queue.print(); // 2
		queue.dequeue();
		queue.dequeue();
		queue.print(); // 
	}
}