class Person {
    // Attributes of the class, I will set them to private to protect them from modifications
    private String givenName;
    private String lastName;
    private int age;
    private String gender;
    private String citizenship;

    // CONSTRUCTORS

    // Basic constructor
    Person() {
        System.out.println("Using basic constuctor");
        this.givenName = "First Name";
        this.lastName = "Last Name";
        this.age = 0;
        this.gender = "Undefined";
        this.citizenship = "Citizen of the world";
    }

    // Parametrized constructor
    Person(String givenName, String lastName, int age, String gender, String citizenship) {
        System.out.println("Using parametrized constuctor");
        this.givenName = givenName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.citizenship = citizenship;
    }

    // METHODS

    // Display information about the class
    public void display() {
        System.out.println("---------------------");
        System.out.println("Given Name: " + this.givenName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Citizenship: " + this.citizenship);
        System.out.println("---------------------");
    }


    // ACCESORS AND MUTATORS

    // Accessors or getters
    public String getGivenName() {
        return this.givenName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public String getCitizenship() {
        return this.citizenship;
    }

    // Mutators or setters
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }
}