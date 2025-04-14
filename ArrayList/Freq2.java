import java.util.*;
public class Freq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]={1,2,3,4,5,5,3,2,15};

        int max=0;
        for(int i=0;i<a.length;i++){
            max=(int)Math.max(max,a[i]);
        }
        
        ArrayList<Integer> freq=new ArrayList<>;

        /* freq.add(25);

        for(int i=0;i<freq.size();i++){
            if(i==5){
                freq.set(i,1);
            }
            System.out.print(freq.get(i)+" ");

        } */
        
        for(int i=0;i<a.length;i++){
            freq.set(a[i], freq.get(a[i])+1);
        }
      

        for(int i=0;i<freq.size();i++)
        System.out.print(freq.get(i)+" ");

    }
    
}
