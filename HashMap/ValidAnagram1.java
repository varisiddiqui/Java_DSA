import java.util.*;
public class ValidAnagram1 {
    public static void main(String[] args) {

        String[] ss = {"hydropneumotherapies"};
        String[] tt = {"neurohypodermathipes"};

        int l= 1;
        int j=0;
        while(l-- > 0){

        TreeMap<Character, Integer> tm1 = new TreeMap<>();
        TreeMap<Character, Integer> tm2 = new TreeMap<>();
        
        String s = "hydropneumotherapies";
        String t = "neurohypodermathipes";

        j++;




        for(int i=0;i<s.length();i++){
            tm1.put(s.charAt(i), tm1.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i=0;i<t.length();i++){
            tm2.put(t.charAt(i), tm2.getOrDefault(t.charAt(i), 0) + 1);
        }

        int sizeS = s.length();
        int sizeT = t.length();
        int count = 0;

        if(sizeS != sizeT){
            System.out.print("NO"+" ");
        }

        else{
            for(Character key : tm1.keySet()){
                if(tm1.get(key) != tm2.getOrDefault(key, -1)){
                    System.out.print("NO"+" ");
                    break;
                }
                else
                count ++;
            }

            if(count == tm1.size())
            System.out.print("Yes"+" ");
            
        }
        
    }



    }
    
}
