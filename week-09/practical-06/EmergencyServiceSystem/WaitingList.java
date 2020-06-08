public class WaitingList {
    protected Node head;
    protected int numNodes;

    public WaitingList(){
        this.head = null;
        this.numNodes = 0;
    }

    /**
     * This method will pop the first patient from the waiting list
     * @return the patient popped from the waiting list
     */
    public Patient popPatient() {

        // If the list is empty return a null value
        if (this.isEmpty()) {
            return null;
        } else {
            // Removes the patient of the list and returns it
            Patient tempPatient = this.head.getPatient();
            this.head = this.head.getNext();
            return tempPatient;
        }
    }

    public Patient popPatientById(int id) {
        //If empty return null
        if (this.isEmpty()) { // 
            return null;
        // In case there is only the head
        } else if (this.head.getNext() == null) { 
             // If the head matches the id return the head and empty the waiting list
            if (this.head.getPatient().getId() == id){
                Patient result = this.head.getPatient();
                this.head = null;
                return result;
            } else {
                return null;
            }
        // Now if the list has at least two patients
        } else {
            // If the head is the patient return the head
            if (this.head.getPatient().getId() == id){
                Patient result = this.head.getPatient();
                this.head = this.head.getNext();
                return result;
            } else {
                // Start searching from the head
                Node node = this.head;

                // Go to next patient until the next patient matches the id or is null
                while((node.getNext() != null) && (node.getNext().getPatient().getId() != id)) {              
                    node = node.getNext();
                }

                // If the end of the line was reached return null
                if (node.getNext() == null) {
                    return null;
                // If the patient was found remove it from the list and return it
                } else if (node.getNext().getPatient().getId() == id) { 
                    Patient result = node.getNext().getPatient();
                    node.setNext(node.getNext().getNext());
                    return result;
                } else {
                    return null;
                }
            }
        }
    }

    public int calculatePatientsBefore(int id) {

        // Start a counter
        int counter = 0;

        //Start looking from the head
        Node node = this.head;

        // If you find the id or reach the end of the line stop looking
        while((node.getNext() != null) && (node.getPatient().getId() != id)) {              
            node = node.getNext();
            counter++;
        }

        // If the end of the line was reached without finding the id return -1
        if ((node.getNext()) == null && (node.getPatient().getId() != id)) {
            return -1;
        // If the patient was found return the counter of the number of patients before him
        } else if (node.getPatient().getId() == id) {
            return counter;
        } else {
            return -1;
        }

    }

    /**
     * This method will add patient into the waiting list according to the triage level
     * @param patient patient's data
     */
    public void addToList(Patient patient) {

        // Create the node that will be inserted in the line
        Node newNode = new Node(patient);

        // If the list is empty just put the new patient into the head of the list
        if (this.isEmpty()) {
            this.head = newNode;

        // If I only have the head
        } else if (this.head.getNext() == null) { 
            // If the triage of the new patient is higher put it in the head
            if (this.head.getPatient().compareTo(newNode.getPatient()) < 0) { 
                newNode.setNext(this.head);
                this.head = newNode;
            } else { // If the triage is not bigger then put it behind the head
                this.head.setNext(newNode);
            }

        // Now if a have at least 2 patients in the list
        } else {

            // Start looking from the head
            Node node = this.head;

            // Go to next patient until be get to a patient with the same triage as the new patient (or until we reach the end of the line)
            while((node.getNext() != null) && (node.getNext().getPatient().compareTo(newNode.getPatient()) >= 0)) {              
                node = node.getNext();
            }

            // If it is going to be the next head place the pointer there
            if (this.head.getPatient().compareTo(newNode.getPatient()) < 0) {
                newNode.setNext(this.head);
                this.head = newNode;
            } else if (node.getNext() == null) {  // If it is the last one put it in the end of the line
                node.setNext(newNode);
            } else {
                // put it in between patients
                newNode.setNext(node.getNext());
                node.setNext(newNode);
            }

        }

    }

    /**
     * print out the information for each patient in waiting list
     */
    public void printList() {

        // Using formatter to make string columns of 15 characters wide
        // See java.util.Formatter  for examples
        String leftAlignFormat = "|%-15s | %-15s | %-15s | %-15s | %-15s |%n";

        // print the titles
        System.out.format(leftAlignFormat,"ID","Name", "Phone number","Triage Level","Location");
        System.out.format(leftAlignFormat,"---------------","---------------", "---------------","---------------","---------------");

        Node node = this.head;

        if (this.isEmpty()) {
            System.out.println("The list is empty, no patients are waiting!");
        } else {
            // Print the nodes one by one, stop when you reach a null
            while(node != null){

                System.out.format(leftAlignFormat,node.getPatient().getId(),node.getPatient().getName(), node.getPatient().getPhoneNumber(),node.getPatient().getTriageLevel(),node.getPatient().getLocation());
                node = node.getNext();
            }

        }


    }

    /**
     * Check whether the patient is in this list or not
     * @return
     */
    public boolean isInList(Patient patient) {
        if (this.head == null) {
            return false;
        }
        Node temp = this.head;
        while(temp != null) {
            if(temp.getPatient().getName().equals(patient.getName())
                    && temp.getPatient().getPhoneNumber().equals(patient.getPhoneNumber())){
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public boolean isEmpty() {

        if (this.head == null) {
            return true;
        } else {
            return false;
        }
    }
}
