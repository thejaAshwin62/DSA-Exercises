package JspDsa.Stack.DoublyLinkedList;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    class Node{
        int value;
        Node next;
        Node previous;
        Node(int value ){
            this.value=value;
        }
    }

    public void display(){
         Node temp = head;
        while (temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    public void isEmpty(){
       if(size==0){
           System.out.println("List is Empty");
       }else{
           System.out.println("List is not Empty");
       }
    }

    public void getHead(){
        System.out.println("Head = "+ head.value);
    }

    public void getTail(){
        System.out.println("Tail = "+ tail.value);
    }

    public void getLength(){
        System.out.println("Length ="+ size);
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(size==0){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            newNode.previous=tail;
            tail=newNode;
        }
        size++;
    }

    public Node removeLast(){
        if(size==0) return null;
        Node temp = tail;
       if(size==1){
           head=null;
           tail=null;
       }else{
           tail=temp.previous;
           tail.next=null;
           tail.previous=null;
       }
       size--;
       return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(size==0) {
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head.previous=newNode;
            head=newNode;
        }
    }

    public Node removeFirst(){
        Node temp = head;
        if(size==0) return null;
        if(size==1){
            head=null;
            tail=null;
        }else{
            head=head.next;
            head.previous=null;
        }
        size--;
        return temp;
    }

    public Node get(int index){
        if(index < 0 || index >=size ) return null;
        Node temp = head;
        if(index < size/2){
            for (int i=0;i<index;i++){
                temp=temp.next;
            }
        }else{
            temp=tail;
            for(int i=size-1;i>index;i--){
                temp=temp.previous;
            }
        }
        return temp;
    }

//    public boolean insert(int index,int value){
//
//    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.append(10);
        dll.append(20);
        dll.prepend(5);
//        dll.removeFirst();
//        dll.isEmpty();
//        dll.display();
        Node n = dll.get(2);
        if(n!=null){
            System.out.println(n.value);
        }else{
            System.out.println("null");
        }
    }


}
