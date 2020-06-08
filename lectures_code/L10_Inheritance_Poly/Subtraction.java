class Subtraction extends ArithmeticOperation {

	Subtraction(){
		super("sub"); // calling parametrised ArithmeticOperation constructor
	}

	// Implementing an abstract method
	public float compute() {
		return this.a - this.b;
	}
}