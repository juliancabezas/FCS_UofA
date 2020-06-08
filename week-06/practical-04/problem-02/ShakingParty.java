//==================================
// Foundations of Computer Science
// Student: Julian Cabezas Pena
// id: a1785086
// Semester: 1
// Year: 2020
// Practical Number: 4
//===================================

import java.util.Random;

public class ShakingParty {

    // Attributes
    private int nPeople;


    // Basic constructor, creates party with a random number of people (max. 100)
    public ShakingParty() {
        
        // Create random object and use to determine the number of people in the party
        Random ran = new Random();
        nPeople = ran.nextInt(101);
    }

    // Parametrized contructor
    public ShakingParty(int nTmp) {
        nPeople = nTmp;
    }

    // Methods

    // This is the method for conting hand shakes, it uses the resursive method below
    public int countHandShakes() {

        int handShakes = this.countHandShakesRecursive(this.nPeople);
        return handShakes;

    }

    // Recursive method to cou n the number of handshakes in the party
    public int countHandShakesRecursive(int people){
        
        // If there are 2+ people coun the number of handshakes, if counts people -1 because you cant shke your own hand
        if (people > 1) {
            return (people - 1) + countHandShakesRecursive(people - 1);
        } else {
            // If the number of people is 1 or 0 no handshakes can be given, base scenario
            return 0;
        } 
    }


    // Mutators and accesors
    public int getNPeople() {
        return this.nPeople;
    }

    public void setNPeople(int nPeople) {
        this.nPeople = nPeople;
    }

}