class Division extends ArithmeticOperation {

	Division(){
		super("division"); // calling parametrised ArithmeticOperation constructor
	}

	// Implementing an abstract method
	public float compute() {
		if (this.b == 0) {
			throw new ArithmeticException("Division by zero is not defined");
		} else {
			return (float)this.a / this.b;
		}
	}

	// Overload the method
	public float compute(float defaultRes) {
		if (this.b == 0) {
			return defaultRes;
		} else {
			return (float)this.a / this.b;
		}
	}

	@Override
	public void info(){
		super.info(); // calling method info() from class ArithmeticOperation
		System.out.println("Note: division by 0 is not allowed.");
	}

	// Error - can't override final methods
	// @Override
	// public void setB(int b) {
	// 	this.b = b+0.00000000000001;
	// }
}