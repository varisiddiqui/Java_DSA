//Palindrome number
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int rev=0,d;
        int dup=num;
        while(num>0)
        {
            d=num%10;
            rev=rev*10+d;
            num/=10;
        }
        if(rev==dup)
        {
            System.out.println(dup+" is a palindrome number");
        }
        else
        {
            System.out.println(dup+" is not a palindrome number");
        }
    }
}
