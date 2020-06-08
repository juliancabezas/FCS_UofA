//==================================
// Foundations of Computer Science
// Student: Julian Cabezas
// id: a1785086
// Semester: 1
// Year: 2020
// Practical Exam Number: 2
//===================================

//Code:

public class DebuggingDemo {

    public void bugMethod() {
         int num[] = {1, 2, 3, 4};
         // The method was looking at index 5 of the matrix, that doesnt exists, change it to index 3
         // System.out.println(num[5]);
         System.out.println(num[3]);
    }

    // This method hast integer as result but produces a float
    // public int bugMethod2() {
    // I changed it to return a float insted of an integer
    public float bugMethod2() {

        // The "f" keyword was also missing in the declaring of the float ans variable
        float ans = 0.0f;
        System.out.println("This method had a bug!");
        return ans;
    }

}