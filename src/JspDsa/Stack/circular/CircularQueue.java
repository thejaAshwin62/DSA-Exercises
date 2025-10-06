package JspDsa.Stack.circular;

public class CircularQueue {

    int[] queue;
    int front;
    int rear;
    int size;

    CircularQueue(int n) {
        size = n;
        queue = new int[n];
        front = -1;
        rear = -1;
    }

    void enQueue(int value) {
        if ((front == 0 && rear == size - 1) || (rear + 1) % size == front) {
            System.out.println("Queue Overflow");
            return;
        }
        if (front == -1) front = 0;
        rear = (rear + 1) % size;
        queue[rear] = value;
    }

    int deQueue(){
        if (front == -1) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int val = queue[front];
        if(front == rear){
            front = rear =-1;
        }else{
            front = (front +1) % size;
        }
        return val;
    }

   void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) break;
            i ++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);

        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();q.deQueue();

        
        q.display();
        System.out.println(q.front);
        System.out.println(q.rear);


    }
}
