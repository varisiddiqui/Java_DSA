public class BinaryString {
    public static void printBinStr(int n, int lastPlace, String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        //kaam
        if(lastPlace == 0){
            //0 sit on the chair
            printBinStr(n-1, 0, str+"0");
            printBinStr(n-1, 1, str+"1");
        }
        else{
            printBinStr(n-1, 0, str+"0");
        }
    }

    public static void main(String[] args) {
        printBinStr(3, 0, "");
    }
    
}
