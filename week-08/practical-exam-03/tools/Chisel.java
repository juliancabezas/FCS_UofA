//==================================
// Foundations of Computer Science
// Student: Julian Cabezas Pena
// id: a1785086
// Semester: 1
// Year: 2020
// Practical Exam Number: 3
//===================================

class Chisel extends HandTool {

    // Parametrized Constructor
    public Chisel(float weight, float value){
        // By default the chisel is initilizated with sharp = true
        super(weight,value,true);
    }

    // Use tool function, for each use (n) the value is reduced by 0.02 cents
    public void useTool(int nUses) {

        // Calculate the reduction in value, make sure the result is a float
        float reductionValue = (float) nUses * 0.02f;
        
        // Make sure the value will be not negative and reduce the value
        if ((this.value - reductionValue) >= 0) {
            this.value = value - reductionValue;
            
        } else {
            // If the value would be negative set it to zero
            this.value = 0.0f;
        }

        System.out.println("Scrape");

    }
}