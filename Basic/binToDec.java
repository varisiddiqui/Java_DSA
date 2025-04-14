import java.util.*;
class binToDec
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Binary number");
        int n=sc.nextInt();
        int dup=n;
        String str=String.valueOf(n);
        int len=str.length();
        int dec=0;
        for(int i=0;i<=len;i++)
        {
            int d=dup%10;
            dec=dec+(int)(d*Math.pow(2,i));
            dup/=10;
        }
        System.out.println("Decimal form="+dec);
    }
}