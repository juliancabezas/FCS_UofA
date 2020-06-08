class ElectricBike extends Bicycle {

    private Double battery;

    // Basic constructor
    public ElectricBike() {
        super();    // Calls bicycle parametrized constructor
        this.battery = 0.0d;
        super.setBikeType("Electric Bike");
    }

    // Parametrized constructor
    public ElectricBike(int ID, String color, int year, int numberGears, boolean is_serviced, String inDate, String outdate, String serviceResponsible,Double battery) {
        super(ID, color, year, numberGears,is_serviced,inDate,outdate,serviceResponsible);  // Call bucycle parametrized constructor
        this.battery = battery;
        super.setBikeType("Electric Bike");
    }

    // Methods

    // Charche baterry up to 100%
    public void chargeBike () {

        // Messages to the users about the old number of gears (using setter)
        System.out.println("Current charge: " + this.getBattery() + "%");
        System.out.println("Charging battery...");

        // Use mutator to gset the new baterry to 100%
        this.setBattery(100.0d);

        // Print new number of gears
        System.out.println("Battery charged to : " + this.getBattery() + "%");

    }

    // Accessors and mutators
    public Double getBattery() {
        return this.battery;
    }

    public void setBattery(Double battery) {
        this.battery = battery;
    }

    


}