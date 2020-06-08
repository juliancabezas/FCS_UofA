//==================================
// Foundations of Computer Science
// Student: Julian Cabezas Pena
// id: a1785086
// Semester: 1
// Year: 2020
// Practical Number: 4
//===================================

public class Test {
    public static void main(String[] args) {
        
        // Create a party with 10 people
        ShakingParty party = new ShakingParty(10);

        // Count the number of handshakes in the party and print the results
        int handShakes = party.countHandShakes();
        System.out.println("There are " + party.getNPeople() + " people in the party");
        System.out.println("There were " + handShakes + " handshakes, how fun is that!");

        //
        System.out.println("------------------------------------");

        System.out.println("Now the party of couples:");
                
        // Create a constrained couples party with 5 couples
        ShakingPartyConstrained couplesParty = new ShakingPartyConstrained(5);

        // Count the number of handshakes in the party and print the results
        int handShakesConstrained = couplesParty.countHandShakes();
        System.out.println("There are " + couplesParty.getNCouples() + " couples in the party");
        System.out.println("There were " + handShakesConstrained + " handshakes, how fun is that!");

    }
}