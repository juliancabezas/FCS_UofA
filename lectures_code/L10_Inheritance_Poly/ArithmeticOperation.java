abstract class ArithmeticOperation {
	protected int a;
	protected int b;
	protected String opName;

	// Basic constructor
	ArithmeticOperation() {
		this.opName = "unknown";
	}

	// Parametrised constructor
	ArithmeticOperation(String opName) {
		this.opName = opName;
	}

	// Accessors
	public final String getOpName() {
		return this.opName;
	}

	// Mutators
	public final void setA(int a) {
		this.a = a;
	}

	public final void setB(int b) {
		this.b = b;
	}

	// Methods
	public void info(){
		System.out.println("-----------------------------");
		System.out.println("You chose " + this.opName + " operation.");
	}

	// Abstract method
	public abstract float compute();
}