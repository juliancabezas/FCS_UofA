//==================================
// Foundations of Computer Science
// Student: Julian Cabezas Pena
// id: a1785086
// Semester: 1
// Year: 2020
// Practical Exam Number: 3
//===================================

abstract class HandTool extends Tool {

    private boolean sharp;

    // Constructor
    public HandTool(float weight, float value, boolean sharp){
        super(weight,value);
        this.sharp = sharp;
    }

    // Returns the value for sharp
    public boolean isSharp(){
        return this.sharp;
    }
}