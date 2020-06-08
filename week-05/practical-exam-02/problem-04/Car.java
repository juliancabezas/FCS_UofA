//==================================
// Foundations of Computer Science
// Student: Julian Cabezas
// id: a1785086
// Semester: 1
// Year: 2020
// Practical Exam Number: 2
//===================================

class Car {
    // Attributes of the class, I will set them to private to protect them from modifications
    private String model;
    private int numGears;
    private float literTank;
    private int yearManufacture;

    // CONSTRUCTORS

    // Basic constructor
    Car() {
        //System.out.println("Using basic constuctor");
        this.model = "First Model";
        this.numGears = 6;
        this.literTank = 10.5f;
        this.yearManufacture = 1990;
    }

    // Parametrized constructor
    Car(String model, int numGears, float literTank, int yearManufacture) {
        //System.out.println("Using parametrized constuctor");
        this.model = model;
        this.numGears = numGears;
        this.literTank = literTank;
        this.yearManufacture = yearManufacture;
    }

    // METHODS

    // Display information about the class
    public void display() {
        System.out.println("---------------------");
        System.out.println("Model: " + this.model);
        System.out.println("NumGears: " + this.numGears);
        System.out.println("LiterTank: " + this.literTank);
        System.out.println("Year of manufacture: " + this.yearManufacture);
        System.out.println("---------------------");
    }


    // ACCESORS AND MUTATORS

    // Accessors or getters
    public String getModel() {
        return this.model;
    }

    public int getNumGears() {
        return this.numGears;
    }

    public float getLiterTank() {
        return this.literTank;
    }

    public int getYearManufacture() {
        return this.yearManufacture;
    }

    // Mutators or setters
    public void setModel(String model) {
        this.model = model;
    }

    public void setNumGears(int numGears) {
        this.numGears = numGears;
    }

    public void setLiterTank(float literTank) {
        this.literTank = literTank;
    }

    public void setYearManufacture(int yearManufacture) {
        this.yearManufacture = yearManufacture;
    }


}