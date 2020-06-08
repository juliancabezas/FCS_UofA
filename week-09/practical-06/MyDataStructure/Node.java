public class Node{

    private String data; // Data contained in the node, in this case a String
    private Node next; // References to the next node in the linked list

    // Constructor
    public Node(){
        this.data = null;
        this.next = null;
    }

    // Parametrized constructor
    public Node(String data) {
        this.data = data;
        this.next = null;
    }


    // Print the data in the node
    public void printNode() {
        System.out.println("Node data: " + this.data);
    }

    // Mutators and accessors
    
    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}