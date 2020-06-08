class Animal {
    protected String name;
    protected int age;
    protected String species;

    // Basic
    Animal() {
        System.out.println("Calling Animal basic constructor");
        this.name = "unknown";
        this.age = 11;
        this.species = "unknown";
    }

    // Parametrized
    Animal(String species) {
        this();
        System.out.println("Calling Animal parametrized constructor");
        this.species = species;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Species: " + this.species);
        System.out.println();
    }

    public void makeSound() {
        System.out.println("Not implemented yet");
    }

}