import java.util.*;
public class TreeS {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        HashSet<String> cities = new HashSet<>();
        TreeSet<String> ts = new TreeSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bengaluru");
        cities.add("Noida");

        System.out.println(cities);

        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Bengaluru");
        lhs.add("Noida");

        System.out.println(lhs);  //ordered as inserted

        
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Bengaluru");
        ts.add("Noida");

        System.out.println(ts);  //sorted
    }
    
}
