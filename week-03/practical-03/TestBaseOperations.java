public class TestBaseOperations {
    public static void main(String[] args) {
     
    BaseOperations arrayOperations = new BaseOperations();

    // Testing array printing

    // Make testing integer array and printing it using printArray method
    int [] array = {1,2,3,4};
    arrayOperations.printArray(array);

    // Make testing String array and printing it using printArray method
    String [] arrayStrings = {"I","hate","online","classes"};
    arrayOperations.printArray(arrayStrings);

    // Make testing Float array and printing it using printArray method
    Float [] arrayFloats = {1.2f,2.0f,3.84673f,4.75f};
    arrayOperations.printArray(arrayFloats);


    // Testing array reversing

    // Reverse integer array and printing the result
    int [] reversedArray = arrayOperations.reverseArray(array);
    arrayOperations.printArray(reversedArray);

    // Reverse String array and printing the result
    String [] reversedArrayStrings = arrayOperations.reverseArray(arrayStrings);
    arrayOperations.printArray(reversedArrayStrings);

    // Reverse Float array and printing the result
    Float [] reversedArrayFloats = arrayOperations.reverseArray(arrayFloats);
    arrayOperations.printArray(reversedArrayFloats);

    }

}
