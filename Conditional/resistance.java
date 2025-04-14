import java.util.*;
public class resistance {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for series resistance , Enter 2 for parallel resistance");
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
        System.out.println("Enter two resistance");
        double r1=sc.nextInt();
        double r2=sc.nextInt();
        switch(ch)
        {
            case 1:
            double eq1=r1+r2;
            System.out.println(eq1);
            break;
            case 2:
            double eq2=(r1*r2)/(r1+r2);
            System.out.println(eq2);
            break;
            default:
            System.out.println("Entered worong choice!!");
        }
    }
    
}
