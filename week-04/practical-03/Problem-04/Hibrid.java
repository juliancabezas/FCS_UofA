class Hibrid extends Bicycle {

    private String suspension;

    // Basic constructor
    public Hibrid() {
        super(); // Call bicycle basic constructor
        this.suspension = "undefined";
        super.setBikeType("Hibrid Bike");
    }

    // Parametrized constructor
    public Hibrid(int ID, String color, int year, int numberGears, boolean is_serviced, String inDate, String outdate, String serviceResponsible,String suspension) {
        super(ID, color, year, numberGears,is_serviced,inDate,outdate,serviceResponsible); // Call Bicycle parametrized constructor
        this.suspension = suspension;
        super.setBikeType("Hibrid Bike");
    }


    // Accessors and mutators
    public String getSuspension() {
        return this.suspension;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }


}