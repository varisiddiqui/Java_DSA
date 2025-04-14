import java.util.*;
public class GetithBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number and index");
        int n=sc.nextInt();
        int i=sc.nextInt();
        int bitmask=1<<i;
        if((n&bitmask)==0)
        System.out.println("0");
        else
        System.out.println("1");


    }
    
}
