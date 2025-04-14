import java.util.Scanner;
public class special {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int sum=0;
        int dup=num,d,f=1;
        while(num>0)
        {
            d=num%10;
            for(int i=1;i<=d;i++)
            {
                f=f*i;
            }
            System.out.println(f+" is fact");
            sum=sum+f;
            f=1;
            num/=10;
        }
        if(sum==dup)
        System.out.println(dup+" is a special no");
        else
        System.out.println(dup+" is not a special no");
    }
}
