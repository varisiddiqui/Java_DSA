import java.util.*;
public class primeRange
{
    public static boolean isPrime(int num)
    {
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            return false;
        }
        return true;
    }
    public static void dispaly(int range) {
        for(int i=2;i<=range;i++)
        {
            if(isPrime(i)==true)
            System.out.print(i+",");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Range");
        int range=sc.nextInt();
        dispaly(range);
        
    }
}