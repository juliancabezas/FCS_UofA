class Turtle extends Animal {


     // Basic
    public Turtle() {
        super();
    }

    //Parametrized constructor
    public Turtle(String name, Double weight, String favoriteFood, int age) {
        super(name, weight, favoriteFood, age);
    }
 
    // Methods

    // Make the sound of the animal
    public void makeSound() {

        System.out.println("I dont make sound, I am too lazy for that");
        
    }




}