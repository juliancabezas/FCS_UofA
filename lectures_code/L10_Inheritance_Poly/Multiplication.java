class Multiplication extends ArithmeticOperation {

	Multiplication(){
		super("muliplication"); // calling parametrised ArithmeticOperation constructor
	}

	// Implementing an abstract method
	public float compute() {
		return this.a * this.b;
	}
}