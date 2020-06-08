public class TestClasses {
	public static void main(String[] args) {
		
		// I will test all the classes created in Problem 01

		// PERSON CLASS

		System.out.println("TESTING PERSON CLASS");

		// Call basic constructor
		Person someDude = new Person();

		someDude.display();

		// Caling parametrized constructor
		Person latinoInmigrant = new Person("Juan", "Perez", 25, "Male", "Chilean");

		latinoInmigrant.display();

		// Change citizenship of latino inmigrant usign the mutator
		latinoInmigrant.setCitizenship("Australian");

		// Print the new citizenship suing the accesor
		System.out.print("New citizenship of Juan Perez: ");
		System.out.println(latinoInmigrant.getCitizenship());

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");

		// SHAPE CLASS

		System.out.println("TESTING SHAPE CLASS");

		// Call basic constructor
		Shape emptyShape = new Shape();

		System.out.println("Empty shape");
		emptyShape.display();

		// Caling parametrized constructor
		System.out.println("Making a cilinder");
		Shape cilinder = new Shape(0d,10d,10d,0d);

		cilinder.display();

		// Change citizenship of latino inmigrant usign the mutator
		cilinder.setRadius(20.5d);

		// Print the new citizenship suing the accesor
		System.out.print("Expanding cilinder radius...");
		System.out.print("New radius of circle: ");
		System.out.println(cilinder.getRadius());

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");

		// BOOK CLASS

		System.out.println("TESTING BOOK CLASS");

		// Call basic constructor
		Book someBook = new Book();

		System.out.println("Undefined book:");
		someBook.display();

		// Caling parametrized constructor
		System.out.println("In the process of writing a cool book...");
		Book myBook = new Book("Dungeons & Coronavirus 6ed" ,2020,"Someone that pays well",20);

		myBook.display();

		// Change number of pages
		myBook.setPages(300);

		// Print the new citizenship using the accesor
		System.out.println("Writing faster due to quarentine...");
		System.out.print("New amount of pages: ");
		System.out.println(myBook.getPages());

		System.out.println("");

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");

		// ANIMAL CLASS

		System.out.println("TESTING ANIMAL CLASS");

		// Call basic constructor
		Animal someAnimal = new Animal();

		someAnimal.display();

		// Caling parametrized constructor
		Animal pangolin = new Animal("Pangolin" ,10.5d,"bugs",3);

		pangolin.display();


		// Print the new citizenship suing the accesor
		System.out.println("Feeding the pangolin");

		// Change the weight of the pangolin
		pangolin.setWeight(30.1d);

		// Print the new weight
		System.out.print("New weight: ");
		System.out.println(pangolin.getWeight());

		System.out.println("");


	}
}