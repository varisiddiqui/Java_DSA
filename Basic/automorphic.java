import java.util.*;
public class automorphic {
 public static void main(String[] args)
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number to be tested");
    int num=sc.nextInt();
    int dup=num;
    int c=0;
    while(dup>0)
    {
        dup/=10;
        c++;
    }
    int a=(int)Math.pow(10,c);
    int sqr=(int)Math.pow(num,2);
    if(sqr%a==num)
    {
        System.out.println(num+" is an automorphic number");
    }
    else
    {
        System.out.println(num+" is not an automorphic number");
    }
 }   
}
