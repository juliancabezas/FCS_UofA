//==================================
// Foundations of Computer Science
// Student: Julian Cabezas Pena
// id: a1785086
// Semester: 1
// Year: 2020
// Practical Exam Number: 3
//===================================

abstract class Tool implements Asset{

    // Attributes of the tool, weight is in grams and value in cents
    // Set the attributes to protected so thay can be modified by classes in this project
    protected float weight;
    protected float value;

    // Parametrized Constructor
    public Tool(float weight, float value){
        this.weight = weight;
        this.value = value;
    }

    // Abstract method
    abstract void useTool(int nUses);

    // Getters or Accessors
    public float getWeight(){
        return this.weight;
    }

    public float getValue(){
        return this.value;
    }
}