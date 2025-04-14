import java.util.Stack;
public class ReverseStack {

    public static void pushAtBottom(Stack<Integer> s, int data){
        //Base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        //recursion
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty())
        return;

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        /* Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(s, 4);
        
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        } */

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverseStack(s);
        printStack(s);

    }
}
