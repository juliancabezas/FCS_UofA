abstract class Player{

    private String member; // Type of player, can be computer or human

    // Basic constructor
    public Player() {
        this.member = "Unknown";
    }

    // Parametrized constructor
    public Player(String member) {
        this.member = member;
    }

    // Methods
    abstract String performMove();

    // Getter and Setter
    public String getMember() {
        return this.member;
    }

    public void setMember(String member) {
        this.member = member;
    }

}