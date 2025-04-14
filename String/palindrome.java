import java.util.*;
public class palindrome {
    public static boolean isPalindrome(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
        if(isPalindrome(str)==true){
            System.out.println(str+" is a Palindrome");
        }
        else{
            System.out.println(str+" is not a Palindrome");
        }
        sc.close();
    }
    
}
