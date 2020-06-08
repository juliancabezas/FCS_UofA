class ZooApp {
    public static void main(String[] args) {
        System.out.println("-------Animal-------");

        Animal animal = new Animal(); // We can create object, because Animal is not abstract
        animal.display(); // method from class Animal
        animal.makeSound(); // method from class Animal
        System.out.println();


        System.out.println("-------Lion-------");
        
        Lion simba = new Lion();
        simba.display(); // method from class Animal
        simba.makeSound(); // method from class Lion
        simba.makeSound("Pffffffffff"); // method from class Lion
        simba.hunt(); // method from class Lion
        System.out.println();

        System.out.println("-------Panda-------");

        Panda po = new Panda();
        po.display(); // method from class Panda
        po.makeSound(); // method from class Animal
        System.out.println();
    }
}