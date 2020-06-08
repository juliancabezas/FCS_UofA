public class ServiceCenter {
    private WaitingList awl;

    public ServiceCenter() {
        this.awl = new WaitingList();
    }

    /**
     * Record patient's data and add the patient into waiting list
     * @param name
     * @param phoneNumber
     * @param triageLevel
     * @param location
     */
    public void addPatientIntoList(String name, String phoneNumber, int triageLevel, String location) {
        Patient patient = new Patient(name, phoneNumber, triageLevel, location);
        if(this.awl.isInList(patient)){
            System.out.println(patient.getName() + " is in waiting list. ");
        }else{
            this.awl.addToList(patient);
            System.out.println("Add " + patient.getName() + " into waiting list. ");
        }
    }

    /**
     * Pop out the first patient in the waiting list and assign an Ambulance for him/her
     * @return the patient object
     */
    public Patient assignAmbulanceForPatient() {
        // Implemented the isEmpty method to first check if the list is empty
        if (this.awl.isEmpty()) {
            System.out.println("Waiting list is empty!");
            return null;
        } else {
            Patient patient = this.awl.popPatient();
            System.out.println("Assigned an ambulance for patient: " + patient.getName());
            return patient;
        }
    }

    public Patient assignAmbulanceForPatientbyID(int id) {
        // Implemented the isEmpty method to first check if the list is empty
        if (this.awl.isEmpty()) {
            System.out.println("Waiting list is empty!");
            return null;
        } else {
            Patient patient = this.awl.popPatientById(id);
            if (patient == null) {
                System.out.println("Sorry, patient not found");
                return patient;
            } else {
                System.out.println("Assigned an ambulance for patient ID: " + patient.getId());
                return patient;
            }
        }
    }

    public void checkPatientsBefore(int id) {
        // implemented the isEmpty method to first check if the list is empty
        if (this.awl.isEmpty()) {
            System.out.println("Waiting list is empty!");
        } else {
            // Checks how many patients are before in the list
            int patientsBefore = this.awl.calculatePatientsBefore(id);
            if (patientsBefore == -1) { // -1 means that the patient was not fount
                System.out.println("Sorry, patient not found");
            } else {
                System.out.println("There are " + patientsBefore + " patients before patient ID: " + id);
            }
        }
    }

    

    /**
     * Print out the waiting list
     */
    public void printWaitingList(){
        this.awl.printList();
    }
}
