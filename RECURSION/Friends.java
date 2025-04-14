public class Friends {
    public static int friendPairing(int n){
        //choice

        if(n ==1 || n ==2){
            return n;
        }
        //single
        int single = friendPairing(n-1);  //  1*friendPairing(n-1);

        //pair
        int pairWays = (n-1) * friendPairing(n-2);

        //totWays
        int totWays = single + pairWays;
        return totWays;
    }
    public static void main(String[] args) {
        System.out.println(friendPairing(3));
    }
    
}
