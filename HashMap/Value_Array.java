import java.util.*;
public class Value_Array {
    public static void main(String[] args) {
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(0);
        hm.put(1,a);

        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(0);
        hm.put(2,b);

        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(0);
        hm.put(3,c);
        
        for(int key : hm.keySet()){
            for(int val : hm.get(key)){
                System.out.print(val+" ");
            }
            System.out.println("end");

        }
        

        
    }
    
}
