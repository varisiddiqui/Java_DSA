import java.util.*;
public class longest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str=sc.nextLine();
        int l=str.length();
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            String s=String.valueOf(ch);;
            String s1="";
            while(s!=" "||s!=".")
            {
               s1=s1+s;
               System.out.print(s);
            }
            System.out.println(s);
        }
    }
}