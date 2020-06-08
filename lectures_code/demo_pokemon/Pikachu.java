public class Pikachu extends Pokemon {
	// fileds
	private String masterName;

	// Constructor
	Pikachu(String name, int attack, int defence, int HP, int maxHP, String masterName){
		super(name, attack, defence, HP, maxHP);
		this.masterName = masterName;
	}
	// mutators and accessors
	
	/* You can implement your mutators and accessors for your own practice*/

	// overided method
	@Override
	public void ability() {
		System.out.println("My ability is lightening");
	}
}