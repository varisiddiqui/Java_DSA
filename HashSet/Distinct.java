import java.util.*;

public class Distinct {
    public static void main(String[] args) {
        int a[] = {4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<a.length; i++)
        set.add(a[i]);

        System.out.println(set.size());
    }
    
}



