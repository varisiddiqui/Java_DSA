import java.util.*;
public class sum {
    public static int displaySum(int num1,int num2)
    {
        int sum=num1+num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=displaySum(a, b);
        System.out.println("sum = "+sum);
    }
    
}
