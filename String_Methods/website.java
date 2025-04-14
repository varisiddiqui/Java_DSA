import java.util.*;
public class website {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the website");
        String web=sc.nextLine();
        if(web.endsWith(".com"))
        {
            System.out.println(web+" is a commercial website");
        }
        if(web.endsWith(".org"))
        {
            System.out.println(web+ " is a organisation website");
        }
        if(web.endsWith(".in"))
        {
            System.out.println(web+ " is a Indian website");
        }
    }
}
