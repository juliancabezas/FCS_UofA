class HelperFunctions {

    // receives a queue and reverses it
    public static Queue reverseQueue(Queue queue){

        // Output queue
        Queue reversedQueue = new Queue();

        // We need a stack to help us store elements
        Stack helperStack = new Stack();

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
