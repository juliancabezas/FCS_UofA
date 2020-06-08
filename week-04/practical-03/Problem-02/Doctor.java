class Doctor extends Person {

    // Attributes of the subclass, I will set them to private to protect them from modifications
    private String speciality;

    // Basic
    public Doctor() {
        super();
        this.speciality = "undefined";
    }

    //Parametrized constructor
    public Doctor(String givenName, String lastName, int age, String gender, String citizenship, String speciality) {
        super(givenName, lastName, age, gender, citizenship);
        this.speciality = speciality;
    }

    // Accesors
    public String getSpeciality() {
        return this.speciality;
    }

    // Mutators
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


}