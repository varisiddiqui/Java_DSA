import java.util.HashSet;

public class Operation {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(1);

        System.out.println(set);

        System.out.println("check if 1 is there :"+set.contains(1));
        System.out.println("check if 5 is there :"+set.contains((5)));
        System.out.println(set.size());

        set.remove(2);
        System.out.println(set);

       /*  boolean removed = set.remove(8);  return type boolean
        System.out.println(removed); */




        
    }
    
}
