package JspDsa.Stack;

public class StackImp {

    static int[] stack;
    static int top;

    static void createStack(int size){
        stack=new int[size];
        top=-1;
        System.out.println("Stack created");

    }

    static void printStack(){
        for(int i=top;i>=0;i--){
            System.out.println(stack[i]);
        }
    }

    static boolean isFull(){
        return top==stack.length-1;
    }

    static void push(int value){
      if(top==stack.length){
          System.out.println("Stack overflow");
      }else{
          top++;
          stack[top]=value;
      }
    }

    static boolean isEmpty(){
        return top==-1;
    }

    static void pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }else{
            System.out.println("Pop stack : "+stack[top]);
            top--;
        }
    }



    public static void main(String[] args) {
        createStack(10);
        push(1);push(2);
        pop();
        push(3);
        printStack();
//        System.out.println(isFull());
//        System.out.println(isEmpty());
    }


}
