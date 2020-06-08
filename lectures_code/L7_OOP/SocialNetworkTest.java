class SocialNetworkTest{
	public static void main(String[] args) {
		SocialNetwork net = new SocialNetwork();
		net.name = "Marvel";
		net.members = new Person[2];
		for (int i = 0; i < net.members.length; i++){
			net.members[i] = new Person();
		}

		// Put information about person 0
		net.members[0].name = "Iron Man";
		// Put information about person 1
		net.members[1].name = "Peter Parker";

		net.displayInfo();

		// Change name for person 1
		net.members[1].changeName("Spider-Man");

		net.displayInfo();
	}
}