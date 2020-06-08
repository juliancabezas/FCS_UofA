class Lion extends Animal {


     // Basic
    public Lion() {
        super();
    }

    //Parametrized constructor
    public Lion(String name, Double weight, String favoriteFood, int age) {
        super(name, weight, favoriteFood, age);
    }
 
    // Methods

    // Make the sound of the animal
    public void makeSound() {

        System.out.println("ROOOOAAAAR");
        
    }




}