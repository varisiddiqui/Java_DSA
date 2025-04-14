import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class Reversal {
    public static Stack<Integer> reversal(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        return s;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);      

        Stack<Integer> s = reversal(q);
        
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
    
}
