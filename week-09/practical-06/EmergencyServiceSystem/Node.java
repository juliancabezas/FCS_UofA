public class Node {
    protected Node next;
    protected Patient patient;

    public Node(Patient patient) {
        this.patient = patient;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void printNode() {
        // Using formatter to make string columns of 15 characters wide
        // See java.util.Formatter  for examples
        String leftAlignFormat = "|%-15s | %-15s | %-15s | %-15s | %-15s |%n";

        // print the titles
        System.out.format(leftAlignFormat,"ID","Name", "Phone number","Triage Level","Location");
        System.out.format(leftAlignFormat,"---------------","---------------", "---------------","---------------","---------------");

        // Print the data
        System.out.format(leftAlignFormat,this.getPatient().getId(),this.getPatient().getName(), this.getPatient().getPhoneNumber(),this.getPatient().getTriageLevel(),this.getPatient().getLocation());

    }
}
