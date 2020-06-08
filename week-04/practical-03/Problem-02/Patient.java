class Patient extends Person {

    // Attributes of the subclass, I will set them to private to protect them from modifications
    private String diagnostic;
    private String inTime;
    private String prevTime;

    // Basic
    public Patient() {
        super();
        this.diagnostic = "sick";
        this.inTime = "sicked";
        this.prevTime = "sicker";
    }

    //Parametrized constructor
    public Patient(String givenName, String lastName, int age, String gender, String citizenship, String diagnostic, String inTime, String prevTime) {
        super(givenName, lastName, age, gender, citizenship);
        this.diagnostic = diagnostic;
        this.inTime = inTime;
        this.prevTime = prevTime;
    }

    // Accesors
    public String getDiagnostic() {
        return this.diagnostic;
    }

    public String getInTime() {
        return this.inTime;
    }

    public String getPrevTime() {
        return this.prevTime;
    }

    // Mutators
    public void setPrevTime(String prevTime) {
        this.prevTime = prevTime;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public void setInTime(String inTime) {
        this.inTime = inTime;
    }

}