public class MyQueue {
    
    // Top node of this stack
    private Node front;
    private Node rear;


    public MyQueue() {
        this.front = null;
        this.rear = null;
    }

    // Insert an element in the rear of the queue
    public void enqueue(Node node){
        // In case the queue is empty the rear and front are the same node
        if (this.isEmpty()) {
            this.rear = node; // The new node goes to the back and front
            this.front = node;
        } else {
            node.setNext(this.rear); // Use setter to set the next to the previous rear
            this.rear = node; // The new node goes to the back
        }
    }

    // Remove element from the front and return it
	public Node dequeue() {
		// If the Queue is empty return null
		if (this.isEmpty()) {
            System.out.println("Queue is empty");
            return null;

        // If the queue has only one element remove both the rear and the front
		} else if (this.rear.getNext() == null) { 
            Node storeFront = this.front;
            this.rear = null;
            this.front = null;
            return storeFront;
		} else {
            // In case I have more than one element
            // store the front because we are going to return it
            Node storeFront = this.front;
			Node temp = this.rear;
			// Traverse queue until we the next-next element is null (just before the front)
			while (temp.getNext().getNext() != null) {
				temp = temp.getNext();
			}
            // Remove next element and set a new front
            temp.setNext(null);
            this.front = temp;
            return storeFront; // Return the front element
		}
	}

    // Check the front element of the queue
    public Node peek() {

        // If empty return message and a null element
        if (this.isEmpty()) {
            System.out.println("Queue is empty, returning null");
            return null;
        } else {
            return this.front; // return the front element of the queue without changing it
        }

    }

    // Method to check if the queue is empty
    public boolean isEmpty() {

        // If both the rear and the front are null the queue is empty
        if (this.rear == null && this.front == null) {
            return true;
        } else {
            return false;
        }
    }

    // Display the elements in the queue
    public void displayQueue() {

        // If rear is null it means the queue is empty
		if (this.rear == null) {
			System.out.println("Queue is empty.");
		} else {
            Node temp = this.rear;
            // Traverse the queue until we reach the front
			while(temp != null) {
                System.out.print(temp.getData()); // Get the data inside the node to print it
                System.out.print(" - ");
				temp = temp.getNext(); // Go to the next node
			}
			System.out.println();
		}
	}

    // Mutators and Accesors

    public Node getFront() {
        return this.front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return this.rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }

}