//==================================
// Foundations of Computer Science
// Student: Julian Cabezas
// id: a1785086
// Semester: 1
// Year: 2020
// Practical Exam Number: 2
//===================================

class Cake {
    // Attributes of the class, I will set them to private to protect them from modifications
    private String name;
    private float qtSugar;
    private float qtFlour;
    private float qtYeast;
    private Double timePrepare;

    // CONSTRUCTORS

    // Basic constructor
    Cake() {
        //System.out.println("Using basic constuctor");
        this.name = "Name";
        this.qtSugar = 0.0f;
        this.qtFlour = 0.0f;
        this.qtYeast = 0.0f;
        this.timePrepare = 0.0d;
    }

    // Parametrized constructor
    Cake(String name, float qtSugar, float qtFlour, float qtYeast, Double timePrepare) {
        //System.out.println("Using parametrized constuctor");
        this.name = name;
        this.qtSugar = qtSugar;
        this.qtFlour = qtFlour;
        this.qtYeast = qtYeast;
        this.timePrepare = timePrepare;
    }

    // METHODS

    // Display information about the class
    public void display() {
        System.out.println("---------------------");
        System.out.println("Name: " + this.name);
        System.out.println("QtSugar: " + this.qtSugar);
        System.out.println("QtFlour: " + this.qtFlour);
        System.out.println("QtYeast: " + this.qtYeast);
        System.out.println("Time to prepare: " + this.timePrepare);
        System.out.println("---------------------");
    }


    // ACCESORS AND MUTATORS

    // Accessors or getters
    public String getName() {
        return this.name;
    }

    public float getQtSugar() {
        return this.qtSugar;
    }

    public float getQtFlour() {
        return this.qtFlour;
    }

    public float getQtYeast() {
        return this.qtYeast;
    }

    public Double getTimePrepare() {
        return this.timePrepare;
    }

    // Mutators or setters
    public void setName(String name) {
        this.name = name;
    }

    public void setQtSugar(float qtSugar) {
        this.qtSugar = qtSugar;
    }

    public void setQtFlour(float qtFlour) {
        this.qtFlour = qtFlour;
    }

    public void setQtYeast(float qtYeast) {
        this.qtYeast = qtYeast;
    }

    public void setTimePrepare(Double timePrepare) {
        this.timePrepare = timePrepare;
    }

}