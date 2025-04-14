public class Fib {
    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        int fn1=fib(n-1);
        int fn2=fib(n-2);
        int fn=fn1+fn2;
        return fn;
    }
    public static void main(String[] args) {
        int n=5;
        int res=fib(n);
        System.out.println(res);
    }
}
