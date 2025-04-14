public class Subset {
    public static void findSub(String str, String ans, int i){
        //base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }


        //work
        //YES
        char ch = str.charAt(i);
        findSub(str, ans+ch, i+1);
        //NO
        findSub(str, ans, i+1);
    }

    public static void main(String[] args) {
    findSub("abc", "", 0);
    }
    
}
