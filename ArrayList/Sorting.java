import java.util.ArrayList;
import java.util.Collections;
public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(10);
        list.add(14);
        list.add(1);
        list.add(25);
        list.add(23);
        //System.out.println(list);
        //Collections.sort(list); //ascending order
        //System.out.println(list);

        Collections.sort(list, Collections.reverseOrder()); //descending order

        //Comparator -> Interface that decides comparison logic

        //using Comparator + lambda fxn
        //Collections.sort(list, (a,b) -> a-b); == ascending
        //Collections.sort(list, (a,b) -> b-a); == descending
        System.out.println(list);
        
    }
    
}
