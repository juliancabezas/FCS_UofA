//  Derived inherits Base
class Lion extends Animal{

    Lion(){
        super("cat"); // calling Animal(String species)
        System.out.println("Calling Lion basic constructor");
        this.name = "Simba";
    }

    // Overriding method from base class
    @Override
    public void makeSound(){
        System.out.println("Rrrrrrrrrrr");
    }

    // Overloading method
    public void makeSound(String sound) {
        System.out.println(sound);
    }

    // Method unique to Lion class
    public void hunt() {
        System.out.println("I like to hunt!");
    }
}