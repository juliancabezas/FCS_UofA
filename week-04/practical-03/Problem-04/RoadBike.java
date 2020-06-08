class RoadBike extends Bicycle {

    private String tyres;

    // Basic constructor
    public RoadBike() {
        super();    // Call bicycle basic constructor
        this.tyres = "undefined";
        super.setBikeType("Road Bike");
    }

    // Parametrized constructor
    public RoadBike(int ID, String color, int year, int numberGears, boolean is_serviced, String inDate, String outdate, String serviceResponsible,String tyres) {
        super(ID, color, year, numberGears, is_serviced, inDate, outdate, serviceResponsible);  // Call the bicycle parametrized constructor
        this.tyres = tyres;
        super.setBikeType("Road Bike");
    }


    // Accessors and mutators
    public String getTyres() {
        return this.tyres;
    }

    public void setTyres(String tyres) {
        this.tyres = tyres;
    }


}