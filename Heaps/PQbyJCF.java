import java.util.Comparator;
import java.util.PriorityQueue;

public class PQbyJCF {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);
        
      //  PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); for desc

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
    
}
