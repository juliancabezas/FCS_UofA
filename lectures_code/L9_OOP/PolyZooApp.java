class PolyZooApp {

    public static void displayAnimal(Animal animal) {
        System.out.println("Hey! I'm an animal, that's my info:");
        animal.display();
    }

    public static void main(String[] args) {
        // Lion and Panda can be treated as animals
        Animal simba = new Lion();
        Animal po = new Panda();

        // We can use methods and attributes from Animal
        simba.display();
        po.display();

        // We CAN'T use methods defined in child class only
        // simba.hunt(); // error

        // Polymorphic array
        Animal[] animals = new Animal[4];
        for (int i = 0; i < animals.length; i++) {
            if (i < 2) {
                animals[i] = new Lion();
            } else {
                animals[i] = new Panda();
            }
        }

        for (int i = 0; i < animals.length; i++) {
            animals[i].makeSound();
        }

        // We can use polymorphism to pass objects of different classes in a method
        displayAnimal(simba);
        displayAnimal(po);
    }
}