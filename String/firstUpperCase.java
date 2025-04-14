import java.util.*;
public class firstUpperCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        char z=Character.toUpperCase(str.charAt(0));
        String s="";
        s+=z;
        for(int i=1;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '&&i<str.length()-1){
                s+=ch;
                s=s+Character.toUpperCase(str.charAt(i+1));
                i++;
            }
            else{
                s=s+ch;
            }
        }
        System.out.println(s);
    }
    
}
