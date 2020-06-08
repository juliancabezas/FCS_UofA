//==================================
// Foundations of Computer Science
// Student: Julian Cabezas Pena
// id: a1785086
// Semester: 1
// Year: 2020
// Practical Exam Number: 3
//===================================

class Hammer extends HandTool {

    // ParametrizedConstructor
    public Hammer(float weight, float value){

        // By default the hammer is not sharp
        super(weight,value,false);
    }
    
    // Use tool function, for each use (n) the value is reduced by 0.01 cents
    public void useTool(int nUses) {

        // Calculate the reduction in value, make sure the result is a float
        float reductionValue = (float) nUses * 0.01f;

        // Make sure the value will be not negative and reduce the value
        if ((this.value - reductionValue) >= 0) {
            this.value = value - reductionValue;
            
        } else {
            // If the value would be negative set it to zero
            this.value = 0.0f;
        }

        System.out.println("Bang!");

    }
}