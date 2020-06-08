public class Queue {
    
    // Attributed
    private Node back; // Last element stored in the queue

    // Basic constructor
    public Queue() {
        this.back = null;
    }

    // Insert an student in the back of the queue
    public void enqueue(Student student){

        // Create a node with the student data
        Node node = new Node(student);

        // In case the queue is empty the back back will be the student
        if (this.isEmpty()) {
            this.back = node; 
        // In case the queue already had students set the back of the new student
        } else {
            node.setNext(this.back); // Use setter to set the next to the previous back
            this.back = node; // The new student goes to the back
        }
    }

    // Remove student from the front
	public void dequeue() {

		// If the Queue is empty dont return anything
		if (this.isEmpty()) {

        // If the queue has only one element remove the back
		} else if (this.back.getNext() == null) { 
            this.back = null;
		} else {

            // In case I have more than one element
			Node temp = this.back;
			// Traverse queue until we the next-next element is null (just before the front)
			while (temp.getNext().getNext() != null) {
				temp = temp.getNext();
            }
            
            // Remove next element, using garbage collections, this will remove the front element of the queue
            temp.setNext(null);

		}
	}


    // Method to check if the queue is empty
    public boolean isEmpty() {

        // If the back is empty the queue is empty
        if (this.back == null) {
            return true;
        } else {
            return false;
        }
    }

    // Display the elements in the queue
    public void displayQueue() {

        // If back is null it means the queue is empty, dont do anything
		if (this.back == null) {

		} else {

            // Get the size of teh query
            int querySize = this.getQueueSize();

            // Number of the student in the queue, only for printing purposes
            int numberInQueue = 1;

            // Traverse the query from the end to the front
            // This allows us to print the front element of the query first
            for (int i = querySize - 1; i >= 0; i--) {

                Node temp = this.back;

                // The counter will allow us to traverse to the correspongin element
                int counter = 0;

                // Traverse to the element placed in the counter marker
                while((counter < i) && (temp.getNext() != null)) {
                    temp = temp.getNext(); // Go to the next node
                    counter++;
                }

                // Store the elements of the current student
                String name = temp.getInfo().getName();
                int age = temp.getInfo().getAge();
                int period = temp.getInfo().getPeriod();

                // Transfor the period number to a string
                String periodText = periodToString(period);

                // Prints each student information
                System.out.println("#" + numberInQueue + " " + name + ", " + age + " years old, " + periodText + " year in Hogwarts;");

                numberInQueue++; //Move the number in the queue forward

            }

        }
            
        System.out.println();
        
    }
    
    // Get the queue size
    public int getQueueSize() {

        // If back is null it means the queue is empty
		if (this.back == null) {
            return 0;
		} else {
            Node temp = this.back;

            // Set the size to 1 (we already know the queue is not empty)
            int size = 0;

            // Traverse the queue until we reach the front, adding 1 to the size
			while(temp != null) {
                temp = temp.getNext();
                size++;
			}
            
            return size;

		}
    }
    

    // Transform the period to string
    public String periodToString(int period) {

        String periodText;

        // Determine the study period in string format
        switch(period) {
            case 1:
                periodText = "1st";
                break;
            case 2:
                periodText = "2nd";
                break;
            case 3:
                periodText = "3rd";
                break;
            case 4:
                periodText = "4th";
                break;
            case 5:
                periodText = "5th";
                break;
            case 6:
                periodText = "6th";
                break;
            case 7:
                periodText = "7th";
                break;
            default:
                periodText = "Invalid period, Hogwads only has 7 years of education";
                break;
        }
        
        return periodText;

    }

    // Mutators and Accesors

    public Node getBack() {
        return this.back;
    }

    public void setBack(Node back) {
        this.back = back;
    }

}