package JspDsa.Stack;
public class QueueImp {
    static int [] Queue;
    static int front =0;
    static int last=0;

    public static void createQueue(int size){
        Queue = new int[size];
    }

    public static boolean isEmpty(){
        return front == 0 && last ==0  ;
    }

    public static boolean isFull(){
        return last == Queue.length;
    }

    public static void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            for(int i=front;i<last;i++){
                System.out.print(Queue[i]+" ");
            }
        }
    }

    public static void enQueue(int value){

       if(last==Queue.length){
           System.out.println("queue is full");
       }else {
           Queue[last] = value;
           last++;

       }
    }
    public static void deQueue(){
      if(isEmpty()){
          System.out.println("Queue is empty");
      }else{
         for(int i =front;i<last;i++){
             Queue[i] = Queue[i+1];
         }
         last--;
      }

    }


    public static void main(String[] args) {
        createQueue(5);
        enQueue(10);
        enQueue(20);
        enQueue(30);
        deQueue();
        enQueue(40);
        display();



    }

}
