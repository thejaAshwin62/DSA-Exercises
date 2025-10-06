package JspDsa.Stack;

public class ParanBalanceing {

    static String[] stack;
    static int top;

    static void createStack(int size){
        stack = new String[size];
        top = -1;
    }

    static void printStack(){
        for(int i = top; i >= 0; i--){
            System.out.println(stack[i]);
        }
    }

    static boolean isFull(){
        return top == stack.length - 1;
    }

    static void push(String value){
        if(isFull()){
            System.out.println("Stack overflow");
        } else {
            top++;
            stack[top] = value;
        }
    }

    static boolean isEmpty(){
        return top == -1;
    }

    static String pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        } else {
            String value = stack[top];
            top--;
            return value;
        }
    }

    static boolean isBalancing(String expression){
        createStack(expression.length());

        for(int i = 0; i < expression.length(); i++){
            char ch = expression.charAt(i);
            if(ch == '{'){
                push("{");
            } else if(ch == '}'){
                if(isEmpty()) return false;
                pop();
            }
        }
        return isEmpty();
    }

    public static void main(String[] args) {
        String exp = "{{{}}}";
        if(isBalancing(exp)){
            System.out.println("Balanced");
        } else {
            System.out.println("Not balanced");
        }
    }
}
