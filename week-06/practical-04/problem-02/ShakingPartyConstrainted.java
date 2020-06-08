//==================================
// Foundations of Computer Science
// Student: Julian Cabezas Pena
// id: a1785086
// Semester: 1
// Year: 2020
// Practical Number: 4
//===================================

// Note: Here I am using Example 2 given in problem 3, where each woman  starts shaking hand with everyone else except his couple

import java.util.Random;

class ShakingPartyConstrained extends ShakingParty {

    // Number of couples in the party
    private int nCouples;

    // Basic constructor, generates a party with a random number of couples (max: 50)
    public ShakingPartyConstrained() {
        // Create random object
        Random ran = new Random();
        nCouples = ran.nextInt(51);

        // Use setter to set the number of people to 2* number of couples
        super.setNPeople(nCouples*2);
    }

    // Parametrized contructor, uses nthe ncouples as inputs, and generates a Shaking party with couples*2 people
    public ShakingPartyConstrained(int nTmp) {
        super(nTmp*2);
        nCouples = nTmp;
    }

    // Methods

    // This is the method for conting hand shakes, it uses the recursive method below
    @Override
    public int countHandShakes() {

        int handShakes = countHandShakesRecursive(super.getNPeople());
        return handShakes;

    }

    // This is the method for conting hand shakes in the party of couples
    @Override
    public int countHandShakesRecursive(int people){
        
        // As there is one woman per couple, only perform recursion in numbers between nPeople and nCouples, or nPeople / 2
        if (people > this.nCouples) {
            // Start by people - 2 because the woman can give handshakes to everyone but herself and her couple
            return (people - 2) + countHandShakesRecursive(people - 1);
        } else {
            // As males cant give handshakes, return zero, base scenario
            return 0;
        } 
    }

    // Getters and Setters
    public int getNCouples() {
        return this.nCouples;
    }

    public void setNCouples(int nCouples) {
        this.nCouples = nCouples;
    }

}