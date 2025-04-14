import java.util.Stack;
public class ReverseString {
    public static  String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;

        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        } 
        return result.toString();
    }

    public static void main(String[] args) {
        /* reverseString("abc");
        Stack<Character> s = reverseString("abc");
        String rev = "";
        while(!s.isEmpty()){
            rev+((s.peek()).toString());
            s.pop();
        }
        System.out.println(rev); */

        String str = "abc";
        System.out.println(reverseString(str));
        
    }
    
}
