import java.util.*;
public class setithBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number and index");
        int n=sc.nextInt();
        int i=sc.nextInt();
        int bitmask=1<<i;
        System.out.println(n|bitmask);
    }
    
}
