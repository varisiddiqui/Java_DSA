import java.util.Scanner;
class result
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter three subject numbers");
    float s1=sc.nextFloat();
    float s2=sc.nextFloat();
    float s3=sc.nextFloat();
    float result=(s1+s2+s3)/3.0f;
    System.out.println("The result is ="+result);
    if(result>=40.0f&&s1>=33.0&&s2>=33.0&&s3>=33.0)
    {
       System.out.println("The student is passed");
    }
    else
    {
        System.out.println("The student is failed");
    }
    }
}