import java.util.*;
public class compress {
    public static String compression(String str){
        StringBuilder newStr=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if(count>1){
                newStr.append(count.toString());
            }
        }
        return newStr.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
        System.out.println(compression(str));
    }
    
}
