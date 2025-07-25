package Stack;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(1);

        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
//        myStack.printStack();

        myStack.pop();
        myStack.printStack();
    }
}
