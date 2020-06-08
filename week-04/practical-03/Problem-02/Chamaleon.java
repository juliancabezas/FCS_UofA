class Chamaleon extends Animal {


     // Basic
    public Chamaleon() {
        super();
    }

    //Parametrized constructor
    public Chamaleon(String name, Double weight, String favoriteFood, int age) {
        super(name, weight, favoriteFood, age);
    }
 
    // Methods

    // Make the sound of the animal
    public void makeSound() {

        System.out.println("Hiriuuuuuuu");
        
    }

}