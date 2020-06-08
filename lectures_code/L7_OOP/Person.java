class Person{
	private String name;
	private int age;
	private float height; // height in meters
	private String favoriteBook;

	public void displayInfo(){
		System.out.println("Hello! My name is " + this.name);
		System.out.println("My age: " + this.age);
		System.out.println("My height: " + this.height);
		System.out.println("My favourite book: " + this.favoriteBook);
		System.out.println();
	}

	public void growUp(){
		this.age++;
	}

	public void changeName(String name){
		this.name = name;
	}

	public static int ageInMonths(int age){
		int months = age * 12;
		return months;
	}

	// Accessors / getters
	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}

	public float getHeight(){
		return this.height;
	}

	public String getFavoriteBook(){
		return this.favoriteBook;
	}

	// Mutators / setters
	public void setName(String name){
		this.name = name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public void setHeight(float height){
		this.height = height;
	}

	public void setFavoriteBook(String favoriteBook){
		this.favoriteBook = favoriteBook;
	}
}