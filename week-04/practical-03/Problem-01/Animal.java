class Animal {
    // Attributes of the class, I will set them to private to protect them from modifications
    private String name;
    private Double weight;
    private String favoriteFood;
    private int age;

    // CONSTRUCTORS

    // Basic constructor
    Animal() {
        System.out.println("Using basic constuctor");
        this.name = "Generic Animal";
        this.weight = 0d;
        this.age = 0;
        this.favoriteFood = "Undefined";
    }

    // Parametrized constructor
    Animal(String name, Double weight, String favoriteFood, int age) {
        System.out.println("Using parametrized constuctor");
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.favoriteFood = favoriteFood;
    }

    // METHODS

    // Display information about the class
    public void display() {
        System.out.println("---------------------");
        System.out.println("Name: " + this.name);
        System.out.println("Weight (kg): " + this.weight);
        System.out.println("Favorite Food:: " + this.favoriteFood);
        System.out.println("Age: " + this.age);
        System.out.println("---------------------");
    }

    // ACCESORS AND MUTATORS

    // Accessors or getters
    public String getName() {
        return this.name;
    }

    public Double getWeight() {
        return this.weight;
    }

    public int getAge() {
        return this.age;
    }

    public String getFavoriteFood() {
        return this.favoriteFood;
    }

    // Mutators or setters
    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

}