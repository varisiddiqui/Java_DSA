public class Factorial {
    
    public static void fact(int n){
        if(n==0){
            return;
        }
        
            int f= fact(n)*fact(n-1);
        
    }
    public static void main(String[] args) {
        int n=5;
        fact(n);
    }
    
}
