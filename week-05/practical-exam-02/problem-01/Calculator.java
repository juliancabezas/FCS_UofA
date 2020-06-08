//==================================
// Foundations of Computer Science
// Student: Julian Cabezas
// id: a1785086
// Semester: 1
// Year: 2020
// Practical Exam Number: 2
//===================================

public class Calculator {

    // Sum between two integers
    public int sum(int numA,int numB){
        int sumResult = numA + numB;
        return sumResult;
    }

    // Division between two integers
    public int sub(int numA,int numB){
        int subResult = numA - numB;
        return subResult;
    }

    // Multiplication between two floats
    public float multiply(float numA,float numB){
        float multiplyResult = numA * numB;
        return multiplyResult;
    }

    // Division between two floats
    public float division(float numA,float numB){

        float divisionResult;

        // If division by zero, the result will be -99.0
        if (numB == 0) {
            divisionResult = -99.0f;
        }
        else {
            divisionResult = numA / numB;
        }

        return divisionResult;
    }
}