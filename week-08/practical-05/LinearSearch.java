public class LinearSearch {

    public int search(int[] array, int num){

        // Determine the length of the arry
        int n = array.length;

        // Use a boolean to make the while loop stop when necessary
        boolean keepLooking = true;

        // Index of the results, default if -1 if the elemnt is not found in the array
        int index = -1; 

        int counter = 0;

        while (keepLooking && counter < n) {

            // if the element is found stop the loop and make the index equal to the counter
            if (array[counter] == num) {
                index = counter;
                keepLooking = false;
            }

            counter++;
        }

        return index;
    }

}