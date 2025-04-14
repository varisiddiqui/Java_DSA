public class SplitString {
    public static void main(String[] args) {
        String str="my name isn't it is varis";
        String s[]=str.split("[abcd ']");//using big bracket is best
        System.out.println(s.length);

        /*for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }*/

        for (String sub : s) {
            System.out.println(sub);
        }

    }
    
}
