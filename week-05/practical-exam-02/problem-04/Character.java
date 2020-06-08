//==================================
// Foundations of Computer Science
// Student: Julian Cabezas
// id: a1785086
// Semester: 1
// Year: 2020
// Practical Exam Number: 2
//===================================

class Character {
    // Attributes of the class, I will set them to private to protect them from modifications
    private String name;
    private String occupation;
    private int age;
    private String gender;
    private String familyRole;
    private float rate;

    // CONSTRUCTORS

    // Basic constructor
    Character() {
        //System.out.println("Using basic constuctor");
        this.name = "First Name";
        this.occupation = "Last Name";
        this.age = 0;
        this.gender = "Undefined";
        this.familyRole = "Lazy";
        this.rate = 0.0f;
    }

    // Parametrized constructor
    Character(String name, int age, String gender, String occupation, String familyRole, float rate) {
        //System.out.println("Using parametrized constuctor");
        this.name = name;
        this.occupation = occupation;
        this.age = age;
        this.gender = gender;
        this.familyRole = familyRole;
        this.rate = rate;
    }

    // METHODS

    // Display information about the class
    public void display() {
        System.out.println("---------------------");
        System.out.println("Name: " + this.name);
        System.out.println("Occupation: " + this.occupation);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Family Role: " + this.familyRole);
        System.out.println("---------------------");
    }


    // ACCESORS AND MUTATORS

    // Accessors or getters
    public String getName() {
        return this.name;
    }

    public String getOccupation() {
        return this.occupation;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public String getFamilyRole() {
        return this.familyRole;
    }

    public float getRate() {
        return this.rate;
    }

    // Mutators or setters
    public void setName(String name) {
        this.name = name;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFamilyRole(String familyRole) {
        this.familyRole = familyRole;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

}