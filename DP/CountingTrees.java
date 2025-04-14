public class CountingTrees {
//count bst = total arrangement + following rule
    public static int countBST(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<n+1; i++){
            //Ci -> BST(i nodes) -> dp[i]
            for(int j=0; j<i; j++){
                int left = dp[j]; //tot arrangement in left subtree
                int right = dp[i-j-1]; //tot arrangement in right subtree
                dp[i] += left * right;
            }
        }

        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countBST(n));
    }
    
}
