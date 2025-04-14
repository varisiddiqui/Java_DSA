import java.util.*;
public class decToBin {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int bin=0,c=0;;
        while(num>0)
        {
            int d=num%2;
            bin=bin+d*(int)Math.pow(10,c);
            num/=2;
            c++;
        }
        System.out.println(bin);
    }
    
}
