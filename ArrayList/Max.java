
import java.util.ArrayList;
public class Max {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); 
        //ArrayList<Integer> list = new ArrayList<Integer>(); they both are equivalent
        list.add(1);
        list.add(5);
        list.add(10);
        list.add(8);
        list.add(4);

        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            /* if(max < list.get(i))
            max = list.get(i); */

            max = Math.max(max, list.get(i));
        }
        System.out.println("Maximum no is :"+max);
    }
    
}
