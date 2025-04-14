import java.util.*;
public class Majority {
    public static void main(String[] args) {
        int a[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};

        HashMap<Integer, Integer> hm = new HashMap<>();

        /* for(int i=0; i<a.length; i++){
            hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);
        } */

        for(int i=0; i<a.length; i++){
            if(hm.containsKey(a[i])){
                hm.put(a[i], hm.get(a[i])+1);
            }
            else{
                hm.put(a[i], 1);
            }

        }



        Set<Integer> freq = hm.keySet();
        for(Integer key : freq){
            if(hm.get(key) > (a.length/3))
            System.out.println(key+" ");
            
        }

        
        /* for(Integer key : hm.keySet()){
            if(hm.get(key) > (a.length/3))
            System.out.println(key+" ");
            
        } */   //can do in short way 
        
    }
    
}
