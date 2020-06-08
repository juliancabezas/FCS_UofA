class Lecturer extends Person {

    // Attributes of the subclass, I will set them to private to protect them from modifications
    private Double salary;
    private String [] disciplines;

    // Basic
    public Lecturer() {
        super();
        this.salary = 1000.0d;
        this.disciplines = new String[2];
    }

    //Parametrized constructor
    public Lecturer(String givenName, String lastName, int age, String gender, String citizenship, Double salary, String[] disciplines) {
        super(givenName, lastName, age, gender, citizenship);
        this.salary = salary;
        this.disciplines = disciplines;
    }

    // Methods

    // Display disciplines of the Lecturer

    // Print the disciplines
    public void displayDisciplines() {

        // Use getters to have the disciplines array
        String [] disciplines = getDisciplines();

        // Get length of array and store in dim
        int dim = disciplines.length;
    
        // Start the printing with a "["
        System.out.print("Disciplines of the Lecturer: ");
    
        for (int i=0; i < dim; i++){
            System.out.print("" + disciplines[i]);
    
            // In all columns but the last one print a comma
            if (i != (dim-1)){
                System.out.print(", ");
            }
        }
    
            // Finish the printing with a "."
            System.out.println(".");
    
    }


    // Method for calculating the annual salary of the lecturer and printing it
    public Double annualSalary() {

        Double salary = getSalary();

        // Calculate annual salary
        double annualSalary = salary * 12.0d;

        return annualSalary;
    }

    // Accesors
    public Double getSalary() {
        return this.salary;
    }

    public String[] getDisciplines() {
        return this.disciplines;
    }

    // Mutators
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setDisciplines(String[] disciplines) {
        this.disciplines = disciplines;
    }


}