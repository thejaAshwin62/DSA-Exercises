package Queue;

public class Main {
    public static void main(String[] args) {
        queue myQueue = new queue();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);

        System.out.println(myQueue.dequeue().value);
//        System.out.println(myQueue.dequeue().value);
//        System.out.println(myQueue.dequeue());
        myQueue.printQueue();
    }
}
