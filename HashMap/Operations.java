import java.util.HashMap;
public class Operations {
    public static void main(String args[]){
        //Create
        HashMap<String, Integer> hm = new HashMap<>();

        //put O(1) 
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        //get O(1)
        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Africa"));

        //containsKey
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Pakistan"));

        //remove
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isEmpty
        System.out.println(hm.isEmpty());

        //clear
        hm.clear();
        System.out.println(hm.isEmpty());


    }

    
}
