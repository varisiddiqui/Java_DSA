import java.util.*;
public class root {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the coefficients of quadratic equation");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double d=(b*b)-(4*a*c);
        if(d==0.0)
        {
            double s= (-b)/(2*a);
            System.out.println("Only root of quadratic quation is:"+s);
        }
        if(d>0.0)
        {
            double s1= (-b+Math.sqrt(d))/(2*a);
            System.out.println("First root of quadratic equation is:"+s1);
            double s2= (-b-Math.sqrt(d))/(2*a);
            System.out.println("Second root of quadratic equation is:"+s2);
        }
        if(d<0.0)
        {
            System.out.println("Roots are imaginary and distinct");
        }
    }
    
}
