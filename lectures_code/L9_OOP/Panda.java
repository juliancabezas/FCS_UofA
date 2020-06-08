class Panda extends Animal {
    public String favFood;

    Panda() {
        super("bear"); // calling Animal(String species)
        System.out.println("Calling Panda basic constructor");
        this.name = "Po";
        this.favFood = "bamboo";
    }

    @Override
    public void display() {
        System.out.println("Favourite food: " + this.favFood);
        super.display(); // Calling display() method from class Animal
    }
}