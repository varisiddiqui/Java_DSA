import java.util.*;
public class binomialCoefficient {
    public static int factorial(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void display(int n,int r)
    {
        int a1=factorial(n);
        int a2=factorial(r);
        int a3=factorial(n-r);
        System.out.println("Binomial Coefficient is:"+(a1)/(a2*a3));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n and r");
        int n=sc.nextInt();
        int r=sc.nextInt();
        display(n, r);
        
    }

    
}
