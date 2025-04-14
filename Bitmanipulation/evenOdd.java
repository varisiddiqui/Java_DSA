import java.util.*;
public class evenOdd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int bitmask=1;
        if((n&bitmask)==0)
        System.out.println(n+" is an even number");
        else
        System.out.println(n+" is a odd number");
    }
}