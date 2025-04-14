import java.util.*;
public class Freq1
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a[]={1,5,6,8,9};
        ArrayList<Integer> freq=new ArrayList<>();

        for(int i=0;i<10;i++)
        freq.add(0);
        
        for(int i=0;i<a.length;i++)
        freq.set(a[i],1);

        for(int i=0;i<freq.size();i++)
        System.out.print(freq.get(i)+" ");
    }
}
