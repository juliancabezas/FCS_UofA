class Queue {
	//private Node front; // points to the first element in queue
	private Node back; // or rear, points to the last element in queue 

	public Queue() {
		this.back = null;
	}

	// Add element to the back
	public void enqueue(Node newNode) {
		newNode.next = this.back;
		this.back = newNode;
	}

	// Remove element from the front
	public void dequeue() {
		// Check if it's empty
		if (this.back == null) {
			System.out.println("Can't remove, queue is empty");
		} else if (this.back.next == null) { // if have only one element in queue
			this.back = null;
		} else {
			Node tmp = this.back;
			// Traverse queue until we reach the second element
			while (tmp.next.next != null) {
				tmp = tmp.next;
			}
			// Remove first element
			tmp.next = null;
		}
	}

	public void print() {
		// Check if it's empty
		if (this.back == null) {
			System.out.println("Queue is empty");
		} else {
			Node tmp = this.back;
			while(tmp != null) {
				System.out.print(tmp.value + " - ");
				tmp = tmp.next;
			}
			System.out.println();
		}
	}

}