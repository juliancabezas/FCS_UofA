public class Test{

    public static void main(String [] args){
        Queue howgarts = new Queue();

        howgarts.enqueue(new Student("Cedric Diggory", 14, 1));
        howgarts.displayQueue();
        howgarts.enqueue(new Student("Harry Potter", 14, 1));
        howgarts.enqueue(new Student("Hermione Granger", 12,1));
        howgarts.enqueue(new Student("Ron Weasley", 15, 1));
        howgarts.enqueue(new Student("Fred Weasley", 16, 3));
        howgarts.enqueue(new Student("George Weasley", 16, 3));

        howgarts.dequeue();
        howgarts.dequeue();

        howgarts.enqueue(new Student("Draco Malfoy", 15, 2));

        howgarts.displayQueue();

    }
}