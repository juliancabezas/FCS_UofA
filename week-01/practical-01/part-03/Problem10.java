// Problem 10: The secret agent

// I had to change the class name to Problem10 for it to be compatible with the required project name (Problem10)
public class Problem10 {
    public static void main(String [] args) {

        // Define String agent_message 01282
        String agent_message_01282 = "Who are you?";
        // Print first message
        System.out.println(agent_message_01282);

        // Overwrite the agent message with the second message
        agent_message_01282 = "My name is, Bond...";
        // Print second message
        System.out.println(agent_message_01282);

        // Overwrite the content of the object with the third message
        agent_message_01282 = "James Bond";
        System.out.println(agent_message_01282);

        // Define an integer, in this case 007, but it will be just 7
        int agent_id = 007;
        // Create last message, those two zeroes are necessary because the integer is just a 7
        agent_message_01282 = agent_message_01282 + "(00" + agent_id + ")";

        //Print last message
        System.out.println(agent_message_01282);

    }
}