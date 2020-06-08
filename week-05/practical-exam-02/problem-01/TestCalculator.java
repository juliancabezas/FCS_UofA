public class TestCalculator {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int num1 = 10;
        int num2 = 3;

        int suma = calc.sum(num1, num2);
        System.out.println("suma: " + suma);

        int resta = calc.sub(num1,num2);
        System.out.println("resta: " + resta);

        float numf1 = 10.0f;
        float numf2 = 0.0f;

        float multi = calc.multiply(numf1,numf2);
        System.out.println("Multi: " + multi);

        float divi = calc.division(numf1,numf2);
        System.out.println("Division: " + divi);




    }

}