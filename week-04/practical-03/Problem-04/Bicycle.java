class Bicycle extends VehicleAbstract implements Vehicle {

    // Attributes of the bicycle class
    // ID and type were added to organize the database of bicycles more clearly
    private int ID;
    private String bikeType;
    private boolean is_serviced; // true if the bike was checked out, false if it is until under repairment
    private String inDate;
    private String outDate;
    private String serviceResponsible;

    // Basic constructor
    public Bicycle() {
        super(); // Call vehicle basic constructor
        this.is_serviced = false;
        this.inDate = "undefined";
        this.outDate = "Not checked out yet";
        this.serviceResponsible = "Not assigned";
    }


    // Parametrized constructor
    public Bicycle(int ID, String color, int year, int numberGears, boolean is_serviced, String inDate, String outDate, String serviceResponsible) {
        super(color, year, numberGears); // Call vehicle parametrized constructor
        this.ID = ID;
        this.is_serviced = is_serviced;
        this.inDate = inDate;
        this.outDate = outDate;
        this.serviceResponsible = serviceResponsible;
    }

    // Methods

    public void chargeBike(){

    }

    // Display information of the bike
    // It has two options, 1 is complete information and 2 is summarized information
    public void displayInfo(int option){

        switch (option) {

            // Complete information
            case 1:
                System.out.println("-----------------------");
                System.out.println("Bycicle ID: " + this.getID());
                System.out.println("Bycicle Type: " + this.getBikeType());
                System.out.println("Color: " + super.getColor()) ;
                System.out.println("Year: " + super.getYear()) ;
                System.out.println("Number of Gears: " + super.getNumberGears()) ;
                System.out.println("In date: " + this.getInDate());
                System.out.println("Service Responsible: " + this.getServiceResponsible());
                // Print the out date of the bike if it was already checked out
                if (this.is_serviced) {
                    System.out.println("Out date: " + this.getOutDate());
                }
                break;
            // Summarized information (1 line)
            case 2:
                System.out.println("ID: " + this.getID() + ", " + super.getColor() + " " + super.getYear() + " " + this.getBikeType() + ", in charge of " + this.getServiceResponsible());
                break;
        }



    }

    // Method to check out a bike, takes de check out date as argument
    public void checkoutService(String outDate){

        // Define is serviced as true
        this.is_serviced = true;

        // Input a checkout date
        this.outDate = outDate;

    }

    // Methods coming from implementation
    public void checkBreak() {
        System.out.println("Breaks checked!");
    }

    // Change the gears of the bike, takes the number of new gears to be considered
    public void changeGear (int nNewGears) {

        // Messages to the users about the old number of gears (using setter)
        System.out.println("Old number of gears: " + super.getNumberGears());
        System.out.println("Changing Gears!");

        // Use mutator to get the new amount of gears
        super.setNumberGears(nNewGears);

        // Print new number of gears
        System.out.println("New amount of gears: " + super.getNumberGears());
    }

    // Accesors

    public int getID() {
        return this.ID;
    }

    public boolean getIs_serviced() {
        return this.is_serviced;
    }

    public String getInDate() {
        return this.inDate;
    }

    public String getOutDate() {
        return this.outDate;
    }

    public String getServiceResponsible() {
        return this.serviceResponsible;
    }

    public String getBikeType() {
        return this.bikeType;
    }

    // Mutators

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

    public void setIs_serviced(boolean is_serviced) {
        this.is_serviced = is_serviced;
    }

    public void setOutDate(String outDate) {
        this.outDate = outDate;
    }
    public void setServiceResponsible(String serviceResponsible) {
        this.serviceResponsible = serviceResponsible;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

}