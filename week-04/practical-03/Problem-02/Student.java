class Student extends Person {

    // Attributes of the subclass, I will set them to private to protect them from modifications
    private Double [] marks;
    private String [] disciplines;

    // Basic
    public Student() {
        super();
        this.marks = new Double[4];
        this.disciplines = new String[4];
    }

    //Parametrized constructor
    public Student(String givenName, String lastName, int age, String gender, String citizenship, Double[] marks, String[] disciplines) {
        super(givenName, lastName, age, gender, citizenship);
        this.marks = marks;
        this.disciplines = disciplines;
    }

    // Methods

    // Display disciplines of the student

    // Print an array
    public void displayDisciplines() {

        String [] disciplines = getDisciplines();

        // Get length of array and store in dim
        int dim = disciplines.length;
    
        // Start the printing with a "["
        System.out.print("Disciplines of the student: ");
    
        for (int i=0; i < dim; i++){
            System.out.print("" + disciplines[i]);
    
            // In all columns but the last one print a comma
            if (i != (dim-1)){
                System.out.print(", ");
            }
        }
    
            // Finish the printing with a "]"
            System.out.println(".");
    
        }


    
    public Double averageMarks() {

        Double [] marks = getMarks();

        // Get length of array and store in dim
        int dim = marks.length;
        Double individualMark;
        Double sum= 0.0d;

        for (int i=0; i < dim; i++) {

            individualMark = marks[i];

            // Add the numbers to a global sum
            sum = sum + individualMark;

        }

        // Calculate mean
        Double mean = (double) sum /  dim;

        return mean;

    }


/*     public void display() {
        super.display();
        System.out.println("Given Name: " + this.givenName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("---------------------");
    } */

    // Accesors
    public Double[] getMarks() {
        return this.marks;
    }

    public String[] getDisciplines() {
        return this.disciplines;
    }

    // Mutators
    public void setMarks(Double[] marks) {
        this.marks = marks;
    }

    public void setDisciplines(String[] disciplines) {
        this.disciplines = disciplines;
    }



    // CONSTRUCTORS

    // Basic constructor

    // Parametrized constructor

    // METHODS

/*     // Display information about the class
    public void display() {
        super.display();
        System.out.println("Given Name: " + this.givenName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("---------------------");
    } */


}