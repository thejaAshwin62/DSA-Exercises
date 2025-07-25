package Queue;

public class Main {
    public static void main(String[] args) {
        queue myQueue = new queue(2);
        myQueue.enqueue(1);

        System.out.println(myQueue.dequeue().value);
//        System.out.println(myQueue.dequeue().value);
//        System.out.println(myQueue.dequeue());
//        myQueue.printQueue();
    }
}
