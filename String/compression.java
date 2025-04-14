import java.util.*;
public class compression {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
        char s=' ';
        int count=0;
        for(char ch='a';ch<='z';ch++){
            for(int j=0;j<str.length();j++){
                if(ch==str.charAt(j)){
                    s=ch;
                    count++;
                }
            }
            if(count>1){
            System.out.print(s+""+count);
            count=0;
            }
            if(count==1){
            System.out.print(ch);
            count=0;
            }
        }

        }
    }
   