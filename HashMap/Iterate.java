import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Iterate {
    public static void main(String args[]){
        //Create
        HashMap<String, Integer> hm = new HashMap<>();

        //put O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Pakistan", 500);
        hm.put("Libya", 60);

        Set<String> keys = hm.keySet(); //collections
        System.out.println(keys);

        //for each loop
        int max=0;
        for(String k : keys){
            System.out.println("Key="+k+" value="+hm.get(k));
            max = (int)Math.max(hm.get(k), max);
        }
        System.out.println("maximum :"+max);

        //using entrySet() for key-value pairs
        for(Map.Entry<String, Integer> entry : hm.entrySet()){
            System.out.println("key :"+entry.getKey()+" value :"+entry.getValue());
        }
    }

    
}
