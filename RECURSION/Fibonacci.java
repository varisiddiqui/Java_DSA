import java.util.*;
class Fibonacci{

    //nth term of fibonacci series
    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        int nm1=fib(n-1);
        int nm2=fib(n-2);
        return nm1+nm2;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fib(n));

    }
}