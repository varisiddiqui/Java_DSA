import java.util.*;
public class LinkedHs {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        HashSet<String> cities = new HashSet<>();

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
    }
    
}
