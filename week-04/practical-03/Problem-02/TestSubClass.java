public class TestSubClass {
	public static void main(String[] args) {
		
		// I will test all the classes created in Problem 01

		// PERSON CLASS

		System.out.println("TESTING STUDENT CLASS");

		// Call basic constructor
		Student someStudent = new Student();

		someStudent.displayDisciplines();

        Double [] marksJulian = {90.0d,100.0d,100.0d};
        String[] disciplinesJulian = {"MFDS","RMCS","FCS"};


		// Caling parametrized constructor
		Student julian = new Student("Julian", "Cabezas", 28, "Male", "Chilean",marksJulian, disciplinesJulian);

		// Display julian's disciplines
		julian.displayDisciplines();

		// Display the average marks
		System.out.println("Average marks for julian: " + julian.averageMarks());

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("TESTING LECTURER CLASS");


		// Call basic constructor
		Lecturer someLecturer = new Lecturer();

		someLecturer.displayDisciplines();

		String[] disciplinesBrad = {"MFDS","RMCS","FCS"};


		// Caling parametrized constructor
		Lecturer brad = new Lecturer("Julian", "Cabezas", 28, "Male", "Chilean",4100.0d, disciplinesBrad);

		// Display the disciplines of brad
		brad.displayDisciplines();

		// Calculate and print the annual salary of brad
		System.out.println("Brad's Annual salary: " + brad.annualSalary());

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("TESTING DOCTOR CLASS");

		// Caling parametrized constructor
		Doctor doc = new Doctor("Marty", "Mcfly", 23, "Male", "Gringo","Psycology");

		// Display info of the doctor
		doc.display();

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("TESTING PATIENT CLASS");

		// Caling parametrized constructor
		Patient poorGuy = new Patient("Marty", "Mcfly", 23, "Male", "Gringo","CORONAVIRUS", "Healthy","Death");

		// Get the diagnostic of the poor gut
		System.out.println(poorGuy.getDiagnostic());

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("TESTING Rectangle CLASS");

		// Caling parametrized constructor
		Rectangle rec = new Rectangle(10.0d,20.0d,35.0d,15.0d);

		System.out.println(rec.area());

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("TESTING CIRCLE CLASS");

		// Caling parametrized constructor
		Circle cir = new Circle(10.0d,20.0d,35.0d,15.0d);

		System.out.println(cir.area());

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("TESTING TRIANGLE CLASS");

		// Caling parametrized constructor
		Triangle tri = new Triangle(10.0d,20.0d,35.0d,15.0d);

		// Print the area of the triangle
		System.out.println(tri.area());

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("TESTING EBOOK CLASS");

		// Caling parametrized constructor
		EBook eb = new EBook("Harry Potter", 1990, "PRH", 500,"www.harrypotter.com");

		eb.display();
		System.out.println("Url of the ebook: " + eb.getUrl());
		
		// Test physical book class
		System.out.println("TESTING Physical book CLASS");

		// Caling parametrized constructor
		PhysicalBook pb = new PhysicalBook("Harry Potter", 1990, "PRH", 500, 4, 7, 5);

		// Display info and location of the book
		pb.display();
		pb.displayBookLocation();

		// Test Lion subclass
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("TESTING LION CLASS");

		// Caling parametrized constructor
		Lion mufasa = new Lion("Mufasa", 80.2, "Zebra", 15);

		// Display info and make sound of lion
		mufasa.display();
		mufasa.makeSound();

		// Test Turtle subclass
		System.out.println("TESTING TURTLE CLASS");

		// Caling parametrized constructor
		Turtle slowy = new Turtle("Slowy", 40.2, "Grass", 541);

		// Display info and make sound
		slowy.display();
		slowy.makeSound();

		// Test Chamaleon subclass
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("TESTING CHAMALEON CLASS");

		// Caling parametrized constructor
		Chamaleon chamy = new Chamaleon("Chamy", 2.75, "Bugs", 2);

		// Display info and make sound
		chamy.display();
		chamy.makeSound();
	}
}