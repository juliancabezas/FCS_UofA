import java.util.Random;

public class Student implements Comparable<Student>{

    // Attributes of the student
    public String name;
    public int physic;
    public int chemistry;
    public int math;
    public int average;

    // Parametrized constructor
    public Student(String name, int physic, int chemistry, int math) {
        this.name= name;
        this.physic = physic;
        this.chemistry = chemistry;
        this.math = math;
        // Average the marks in constructor
        this.average = Math.round((this.physic + this.chemistry + this.math) / 3.0f);
    }

    // As I am implementing the Comparable interface I need a compareTo Method
    public int compareTo(Student st){

        // First compare the students by average
        if (this.average - st.average != 0) {
            return this.average - st.average;
        
        // If the average is the same compare them by the physic marks
        } else if (this.physic - st.physic != 0) {
            return this.physic - st.physic;

        // If the average is the same compare them by the chemistry marks
        } else if (this.chemistry - st.chemistry != 0) {
            return this.chemistry - st.chemistry;

        // If the average is the same compare them by the math marks
        } else if (this.math - st.math != 0) {
            return this.math - st.math;

        // If the average is the same compare them by name, using the internal compareTo method that the String class has
        } else {
            return this.name.compareTo(st.name);
        }

    }

    // Sort yhe student using QuickSort
    public Student[] sortStudents(Student[] array) {

        int arrayLength = array.length;

        // New random object to generate random numbers for the pivot
        Random ran = new Random();

        // Base case
        if (arrayLength < 2) {
            return array;
        } else {

            // The pivot will be a random number on the array
            int pivotIndex = ran.nextInt(arrayLength);
            Student pivot = array[pivotIndex];

            // Get the part of the matrix that is bigger and the one that is smaller
            Student[] smallerPart = getSmallerPart(array, pivot);
            Student[] biggerPart = getBiggerPart(array, pivot);

            // Get the part of the the array that is equal to the pivot
            Student[] equalPart = getEqualPart(array, pivot);

            // Call the sort function recursively on both parts
            smallerPart = sortStudents(smallerPart);
            biggerPart = sortStudents(biggerPart);

            Student[] mergedArray = concatenateArray(biggerPart,smallerPart, equalPart);
            return mergedArray;

        }

    }
    
    
    // Method to get the smaller than the pivot part of the matrix
    private Student[] getSmallerPart(Student[] array, Student pivot) {
    
        int resultLength = 0;

        // Count the number of elements in the array that are smaller than the pivot
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(pivot) < 0) {
                resultLength++;    
            }
        }

        // Create the empty Student array
        Student[] resultArray = new Student[resultLength];

        int indexResultArray = 0;

        // Make the resulting array
        for(int j = 0; j < array.length; j++) {

            if (array[j].compareTo(pivot) < 0) {
                resultArray[indexResultArray] = array[j];
                indexResultArray++;
            }
        }
        return resultArray;
    }



    // Method to get the smaller than the pivot part of the matrix
    private Student[] getBiggerPart(Student[] array, Student pivot) {
    
        int resultLength = 0;

        // Count the number of elements in the array that are smaller than the pivot
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(pivot) > 0) {
                resultLength++;    
            }
        }

        // Create the empty student array
        Student[] resultArray = new Student[resultLength];

        int indexResultArray = 0;

        // Make the resulting array
        for(int j = 0; j < array.length; j++) {

            if (array[j].compareTo(pivot) > 0) {
                resultArray[indexResultArray] = array[j];
                indexResultArray++;
            }
        }
        return resultArray;
    }

    // Method to get the smaller than the pivot part of the matrix
    private Student[] getEqualPart(Student[] array, Student pivot) {

        int resultLength = 0;

        // Count the number of elements in the array that are equal to the pivot
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(pivot) == 0) {
                resultLength++;    
            }
        }

        // Make the empty students array
        Student[] resultArray = new Student[resultLength];

        int indexResultArray = 0;

        // Make the resulting array
        for(int j = 0; j < array.length; j++) {

            if (array[j].compareTo(pivot) == 0) {
                resultArray[indexResultArray] = array[j];
                indexResultArray++;
            }


        }

        return resultArray;
    }

    // Concatenate the biiger, smaller and equal to the pivot arrays together
    private Student[] concatenateArray(Student[] array1, Student[] array2, Student[] arrayPivot){

        // Get the length of the two arrays and add 1 for the pivot
        int lengthResultArray = array1.length + array2.length + arrayPivot.length;

        // Create the resulting array
        Student[] resultArray = new Student[lengthResultArray];
        int index = 0;

        // Put the first array into the result matrix
        for (int i = 0; i < array1.length; i++) {

            resultArray[index] = array1[i];
            index++;
        }

        // Put the array that is equal to the pivot into the result matrix
        for (int i = 0; i < arrayPivot.length; i++) {

            resultArray[index] = arrayPivot[i];
            index++;
        }

        // Now the second array
        for (int j = 0; j < array2.length; j++ ) {
            
            resultArray[index] = array2[j];
            index++;
        }

        return resultArray;

    }

    // Getters and Setters

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhysic() {
        return this.physic;
    }

    public void setPhysic(int physic) {
        this.physic = physic;
    }

    public int getChemistry() {
        return this.chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public int getMath() {
        return this.math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getAverage() {
        return this.average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

}