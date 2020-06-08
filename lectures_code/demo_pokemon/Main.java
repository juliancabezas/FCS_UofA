public class Main{
	/* Change the maxHP for Pikachu */
	public static void changeMaxHP(Pikachu pikachu){
		pikachu.setMaxHP(200);
		System.out.println("Max Hp in changeMaxHP: " + pikachu.getMaxHP());//the output should be 200
	}

	public static void main(String[] args) throws CloneNotSupportedException{
		int i = 0;
	  	Pikachu pikachu = new Pikachu("pikachu", 10, 11, 50, 50, "Tao");
	  	pikachu.ability(); 
	  	System.out.println("max Hp before changeMaxHP: " + pikachu.getMaxHP());//the output should be 50 
	  	changeMaxHP(pikachu);
	  	System.out.println("max Hp after changeMaxHP: " + pikachu.getMaxHP());//the output should be 200
	}
}