class SocialNetwork{
	public String name;
	public Person[] members;

	public void displayInfo(){
		System.out.println("Welcome to " + this.name);
		System.out.println("Our members:");
		for (int i = 0; i < members.length; i++){
			members[i].displayInfo();
		}
	}
}