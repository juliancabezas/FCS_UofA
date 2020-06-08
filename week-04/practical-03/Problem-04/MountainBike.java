class MountainBike extends Bicycle {

    private String suspension;
    private String forks;

    // Basic constructor
    public MountainBike() {
        super(); // Call bicycle basic constructor 
        this.suspension = "undefined";
        this.forks = "undifined";
        super.setBikeType("Mountain Bike");
    }

    // Parametrized constructor
    public MountainBike(int ID, String color, int year, int numberGears, boolean is_serviced, String inDate, String outdate, String serviceResponsible,String suspension, String forks) {
        super(ID, color, year, numberGears,is_serviced,inDate,outdate,serviceResponsible); // Call Bicycle parametrized constructor
        this.suspension = suspension;
        this.forks = forks;
        super.setBikeType("Mountain Bike");
    }

    // Accessors and mutators
    public String getSuspension() {
        return this.suspension;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    public String getForks() {
        return this.forks;
    }

    public void setForks(String forks) {
        this.forks = forks;
    }

}