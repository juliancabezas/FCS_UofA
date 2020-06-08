public class Main {
    public static void main(String[] args) {
        
        // Test the Happy number method
        System.out.println("");
        System.out.println("Testing the Happy Number Method:");
        System.out.println("");

        System.out.println("Next Happy number after 19:");
        System.out.println(nextHappyNum(19));

        System.out.println("Next Happy number after 6:");
        System.out.println(nextHappyNum(6));

        System.out.println("Next Happy number after 5478:");
        System.out.println(nextHappyNum(5478));


        // Test the decoding function

        System.out.println("");
        System.out.println("Testing the string decoding function:");
        System.out.println("");

        // Test number 1
        String str = "4[f3[a2[b]]]";

        System.out.println("String to decode: "+ str);

        // Execute function and print result
        String decoded = decodeString(str);
        System.out.println(decoded);
        System.out.println("");

        // Test number 2
        String str2 = "3[b2[ca]1[d]]";
        System.out.println("String to decode: "+ str2);

        // Execute function and print result
        String decoded2 = decodeString(str2);
        System.out.println(decoded2);
        System.out.println("");

        // Test number 2
        String str3 = "2[ab]";
        System.out.println("String to decode: "+ str3);

        // Execute function and print result
        String decoded3 = decodeString(str3);
        System.out.println(decoded3);

    }

    // Finds the next happy number
    public static int nextHappyNum(int num) {

        boolean isHappy = false;

        // Starts from the number
        int nextNum = num;

        while(!isHappy) {
            // Increment by one and test
            nextNum++;
            // Test if it is a happy number
            isHappy = isHappyNum(nextNum);
        }

        return nextNum;

    } 

    // Check if the number is a happy number
    public static boolean isHappyNum(int num) {

        // Calculate the sum of squares of the digits in the integer
        int sum = sumOfSquaresDigits(num);

        // If the sum of digits is equal to the number and to one then it is a happy number
        if (num == sum && sum == 1){
            return true;
        
        // If the sum of digits and the number are equal to a number not equal to one it is not a happy number
        } else if (num == sum && sum != 1) {
            return false;
        // If the number is 4 it gets to an infinite loop, being not a happy number
        } else if (num == 4) {
            return false;

        } else {
            // Call the function recursively
            boolean result = isHappyNum(sum);
            return result;
        }
    }

    // Camculate the sum of Square  of the digits in the integer
    public static int sumOfSquaresDigits(int num) {

        // Convert to string
        String numberString = String.valueOf(num);

        // Convert to an array of characters
        char[] digits = numberString.toCharArray();

        int sumOfDigits = 0;
        int digit = 0;

        // Goo thorugh all the digits
        for (int i = 0; i < digits.length; i++){

            // Get the integer value and sum its equare the to overall sum
            digit =  Character.getNumericValue(digits[i]);
            sumOfDigits = sumOfDigits + (digit * digit);

        }

        return sumOfDigits;

    }

    // Decode string function
    public static String decodeString(String code) {

        int multiplier;
        char multiplierChar;

        // Fist find the location of the fisrt brackt and its corresponding closure bracket and store it in a string
        int[] bracketIndex = scanBrackets(code);

        // Find the multiplier of characters (integer value), if it doestn exists assume a oones
        if (bracketIndex[0] != 0) {
            // The multiplier is just before the bracket
            multiplierChar = code.charAt(bracketIndex[0]-1);
            multiplier = Character.getNumericValue(multiplierChar);
        } else {
            multiplier = 1;
        }

        // Get the string that is inside the bracket
        String inside = code.substring(bracketIndex[0]+1,bracketIndex[1]);

        // Get the strings that are on the left and right of the bracket, they INCLUDE the bracket
        String left = code.substring(0,bracketIndex[0]+1);
        String right = code.substring(bracketIndex[1],code.length());

        // Scan for the brackets inside of the first bracket
        int[] bracketIndexInside = scanBrackets(inside);

        // If there are not brackets reach the base case
        if (bracketIndexInside[0] == 0 && bracketIndexInside[1] == 0) {

            // Re calculate the left and right strings, now it doesnt include the brackets
            left = code.substring(0,bracketIndex[0]-1);
            right = code.substring(bracketIndex[1]+1,code.length());

            // Repeat the string by the multiplier and include the right and left strings to start solving the code
            return left + inside.repeat(multiplier) + right;


        } else {
            // Call the fucntion recursively until we find the innermost bracket
            return decodeString(left + decodeString(inside) + right);

        }
    }

    // Find the position of the first bracket and its closure
    public static int[] scanBrackets(String code) {

        // The defauls is two zeroes
        int[] bracketIndex = {0,0};
        char charac;
        boolean keepLooking = true;
        
        // Loop trhough the string
        for (int i = 0; i < code.length(); i++) {

            charac = code.charAt(i);

            // I want to find the first  brackets
            if (charac == '[' && keepLooking) {
                bracketIndex[0] = i;
                keepLooking = false;
            }
        }

        // Find its corresponding closure bracket
        if (bracketIndex[0] != 0) {
            bracketIndex[1] = findClosingBracket(code, bracketIndex[0]);   
        }

        return bracketIndex;

    }

    // Find the closing bracket of the open bracket
    public static int findClosingBracket(String code, int openPos) {
        
        // Start from thr position of the bracket and go on until we find the closing bracket
        int closePos = openPos;
        int counter = 1;

        // When the counter reaches cero I found the closing parenthesis
        while (counter > 0) {
            closePos++;
            char c = code.charAt(closePos);

            // Add one if we find another opening bracket
            if (c == '[') {
                counter++;
            }

            // Substract 1 if we find a closing bracket
            else if (c == ']') {
                counter--;
            }
        }
        return closePos;
    }







    



}