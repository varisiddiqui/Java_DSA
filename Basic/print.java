import java.util.*;
class print
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the dimension of page");
    int l=sc.nextInt();
    int b=sc.nextInt();
    for(int i=1;i<=8;i++)
    {
        System.out.println("Dimension of A"+i+" page is:");
        System.out.println(l+" * "+b);
        int temp=l;
        l=b;
        b=temp/2;
    }
}
}