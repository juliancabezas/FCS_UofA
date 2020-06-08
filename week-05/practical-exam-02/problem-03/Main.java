public class Main {
    public static void main(String[] args) {

        //HandlingArrays ar = new HandlingArrays();

        double [] array = {1.0d,2.0d,3.0d,4.0d};
        double [] array2 = {1.0d,2.0d,3.0d,4.0d};

        HandlingArrays.printArray(array);

        double[] res = HandlingArrays.sumElements(array, array2);

        HandlingArrays.printArray(res);

    }

}