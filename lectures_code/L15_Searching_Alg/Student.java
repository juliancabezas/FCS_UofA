class Student {
	public String name;
	public int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Student st) {
		return this.name.equals(st.name) && this.age == st.age;
	}
}