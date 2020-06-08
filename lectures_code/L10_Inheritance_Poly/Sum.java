class Sum extends ArithmeticOperation {
	
	Sum(){
		super("sum"); // calling parametrised ArithmeticOperation constructor
	}

	// Implementing an abstract method
	public float compute() {
		return this.a + this.b;
	}
}