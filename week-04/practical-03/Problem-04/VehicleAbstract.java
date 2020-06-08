abstract class VehicleAbstract {

    // Define the attributes of the vehicle
	protected String color;
	protected int year;
	protected int numberGears;

    // Basic constructor
    public VehicleAbstract() {
        this.color = "undefined";
        this.year = -999;
        this.numberGears = -999;
    }

    // Parametrized constructor
    public VehicleAbstract(String color, int year, int numberGears) {
        this.color = color;
        this.year = year;
        this.numberGears = numberGears;
    }

    // Accesors

    public String getColor() {
        return this.color;
    }

    public int getYear() {
        return this.year;
    }

    public int getNumberGears() {
        return this.numberGears;
    }

    // Mutators

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setNumberGears(int numberGears) {
        this.numberGears = numberGears;
    }

}