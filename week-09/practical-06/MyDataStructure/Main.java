public class Main{
    public static void main(String[] args) {
        
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("Testing the Stackimplementation");

        // Initialize a new stack object to test it
        MyStack stack = new MyStack();
        stack.push(new Node("Hi"));
        stack.push(new Node("Stack"));
        stack.push(new Node("World"));
        stack.push(new Node("!!!!!!"));

        System.out.println("Stack status:");
        stack.print();

        System.out.println("Poping data!");
        stack.pop().printNode();

        System.out.println("Stack status:");
        stack.print();

        System.out.println("Peeking data");
        stack.peek().printNode();

        System.out.println("Stack status:");
        stack.print();

        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("Testing the bracket matching method");

        // Test cases for the method
        String input1 = "({})";
        String input2 = "({)";
        String input3 = "(1+2) * {(2+3)*(3+4)}";
        String input4 = "(1+2) * {{2+3)*(3+4}}";

        System.out.println("Input :" + input1);
        System.out.println("Are the brackets matching?: " + bracketsMatching(input1));

        System.out.println("Input :" + input2);
        System.out.println("Are the brackets matching?: " + bracketsMatching(input2));

        System.out.println("Input :" + input3);
        System.out.println("Are the brackets matching?: " + bracketsMatching(input3));

        System.out.println("Input :" + input4);
        System.out.println("Are the brackets matching?: " + bracketsMatching(input4));

        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("Testing the Queue implementation");

        // Initialize a new queue element to test
        MyQueue queue = new MyQueue();
        System.out.println("Queue status:");
        queue.displayQueue();

        queue.enqueue(new Node("Hi"));
        System.out.println("Queue status:");
        queue.displayQueue();
        
        queue.enqueue(new Node("Hi"));
        queue.enqueue(new Node("Queue"));
        System.out.println("Queue status:");
        queue.displayQueue();
        System.out.println("Dequeue...");
        queue.dequeue().printNode();
        System.out.println("Queue status:");
        queue.displayQueue();
        queue.enqueue(new Node("World"));
        queue.enqueue(new Node("!!!!!!"));
        queue.enqueue(new Node("something"));
        queue.enqueue(new Node("everything"));

        System.out.println("Queue status:");
        queue.displayQueue();

        System.out.println("dequeueing data!");
        queue.dequeue().printNode();

        System.out.println("Queue status:");
        queue.displayQueue();

        System.out.println("Peeking data");
        queue.peek().printNode();;

        System.out.println("Queue status:");
        queue.displayQueue();

        // Reverse queue method
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("Testing the reverse queue method");

        // Initialice a new queue to test the reversequeue method
        MyQueue queue2 = new MyQueue();
        queue2.enqueue(new Node("2"));
        queue2.enqueue(new Node("9"));
        queue2.enqueue(new Node("7"));
        queue2.enqueue(new Node("4"));
        queue2.enqueue(new Node("1"));

        System.out.println("Queue status:");
        queue2.displayQueue();

        // Test the method and display output
        MyQueue reversedQueue2 = reverseQueue(queue2);
        System.out.println("Reversed Queue:");
        reversedQueue2.displayQueue();
    }

    // Method to test if a string has matching brackets
    public static boolean bracketsMatching(String input) {

        // Arrays with the opening brackets and their corresponding closing bracket (They have to be in corresponding order)
        String openingBracket[] = {"(","[","{"}; 
        String closingBracket[] = {")","]","}"};
        
        // Initialice an stack where we are going to store the brackets, ignoring everything else
        MyStack stack = new MyStack();

        String singleChar = "";
        String topChar;

        // If the string is empty returns true
        if (input.length() == 0) {
            return true;
        }

        // We are going to make a for loop thpought the characters of the string
        for (int i = 0;i < input.length();i++){

            // Convert the character at the i position to string
            singleChar = Character.toString(input.charAt(i));

            // Check if the character is an opening bracket
            if (isIn(singleChar,openingBracket)) {
                // Push it into the stack
                stack.push(new Node(singleChar));
            }

            // See if it is a closing bracket
            if (isIn(singleChar,closingBracket)) {
                
                // Peek the top element of the list
                topChar = stack.peek().getData();

                // Check it is a opening bracket
                if (isIn(topChar,openingBracket)){

                    // Check the position in the opening bracket and also the character position in the closing bracket array
                    // If they are equal pop the top element of the array (matching bracket!)
                    if (isInIndex(topChar,openingBracket) == isInIndex(singleChar,closingBracket))
                    stack.pop();

                }

            }

        }

        // If the stack is empty it means thet we found all the correspong closing brackets for the opening brackets
        if (stack.isEmpty()) {
            return true; 
        } else {
            return false;
        }

    }



    // This funcions checks a single input agains an arrays, its like the IN operator
    private static boolean isIn(String input, String[] validInput) 
    { 
        // Linear reach to check if the user input is in the array
        boolean test = false; 
        String validElement = "";

        // For loop that goes through all the elements of the valid input matrix
        for (int i =0; i < validInput.length; i++) { 

            validElement = validInput[i];

            // If any element is equal to the input returns true
            if (input.equals(validElement)) { 
                test = true; 
            } 
        } 
  
        return test;
    } 


    // Linear search of the element
    public static int isInIndex(String find, String[] array) {

        // Default is 999999 if not found
        int index = 9999999;

        for (int i=0; i < array.length; i++) {
            
            // If it finds it return tru
            if (array[i].equals(find)) {
                index = i;
            }
        }

        return index;

    }

    // receives a queue and reverses it
    public static MyQueue reverseQueue(MyQueue queue){

        // Output queue
        MyQueue reversedQueue = new MyQueue();

        // We need a stack to help us store elements
        MyStack helperStack = new MyStack();

        // dequeue elements and put them in the helper stack until we empty the input queue
        while(!queue.isEmpty()) {
            helperStack.push(queue.dequeue());
        }

        // Now pop the elements in the stack and put them in the new queue until the stack is empty
        while(!helperStack.isEmpty()){
            Node temp = helperStack.pop();
            reversedQueue.enqueue(temp);
        }

        return reversedQueue;
    }
    
}