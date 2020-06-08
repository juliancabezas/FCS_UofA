class PersonTest{
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setName("Tony Stark");
		person1.setAge(46);
		person1.setHeight(1.76f);
		person1.setFavoriteBook("Harry Potter");
		person1.displayInfo();

		// One year later.
		person1.growUp();
		person1.changeName("Iron Man");
		person1.displayInfo();

		Person person2 = new Person();
		person2.setName("Peter Parker");
		person2.displayInfo();

		//Person person3 = new Person();
		//person3.setAge(92);
		int months = Person.ageInMonths(92);
		System.out.println("My friend is " + months + " months old");
	}
}