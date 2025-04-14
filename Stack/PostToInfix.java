import java.util.Stack;
public class PostToInfix {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<String> val = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii <= 57){
                val.push(ch+"");
            }
            else{
                String val2 = val.pop();
                String val1 = val.pop();
                char o = ch;

                //String t = val1 + o + val2;
                String t = '(' +  val1 + o + val2 + ')';
                val.push(t);

                

            }
        }
        System.out.println(val.peek());
    }
    
}
