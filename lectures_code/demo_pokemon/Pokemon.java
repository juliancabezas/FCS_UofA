abstract class Pokemon{
	// class modifier
	// public, private, protected
	// fields
	private String name;
	//for any Pokemon attack should be no more than 100;
	private int attack;
	// no more than 90;
	private int defence;
	private int HP;
	// no more than 500
	private int maxHP;

	// Constructor
	Pokemon(String name, int attack, int defence, int HP, int maxHP){
		if(attack > 100 || defence > 90 || maxHP > 500){
			return;
		}
		this.name = name;
		this.attack = attack;
		this.defence = defence;
		this.HP = HP;
		this.maxHP = maxHP;
	}
	// Accessors
	public String getName(){
		return this.name;
	}

	public int getMaxHP(){
		return this.maxHP;
	}

	// Mutators
	public void setName(String name) {
		this.name = name;
	}

	public void setMaxHP(int maxHP) {
		if (maxHP > 500){
			return;
		}
		this.maxHP = maxHP;
	}
	// Methods

	abstract public void ability();
}