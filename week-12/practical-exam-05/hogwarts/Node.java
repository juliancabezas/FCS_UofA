class Node {

    // Attributes
    private Node next; // References to next node in linked list or queue
    private Student info; // Student information inside the node

    // Parametrized constructor
    public Node(Student tmpStudent) {
        this.next = null;
        this.info = tmpStudent;
    }

    // Basic constructor, sets everything to null
    public Node() {
        this.next = null;
        this.info = null;
    }

    // Mutators ans Accessors
    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Student getInfo() {
        return this.info;
    }

    public void setInfo(Student info) {
        this.info = info;
    }




}