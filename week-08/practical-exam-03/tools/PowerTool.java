//==================================
// Foundations of Computer Science
// Student: Julian Cabezas Pena
// id: a1785086
// Semester: 1
// Year: 2020
// Practical Exam Number: 3
//===================================

abstract class PowerTool extends Tool{

    // Power in watts
    private int power;

    // Parametrized constructor
    public PowerTool(float weight, float value, int power){
        super(weight,value);
        this.power = power;
    }

    // Returns the power of the tool
    public int getPower(){
        return this.power;
    }
}