import java.util.Arrays;

public class ClimbingStairs {
    //recursion O(2^n)
    public static int countWaysRec(int n){
        if(n == 0){
            return 1; //there is 1 way
        }
        if(n < 0){
            return 0;
        }

        return countWaysRec(n-1)+countWaysRec(n-2);
    }

    //memoization O(n)
    public static int countWaysMem(int n, int ways[]){
        if(n < 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }

        if(ways[n] != -1){
            return ways[n];
        }

        ways[n] = countWaysMem(n-1, ways)+countWaysMem(n-2, ways);
        return ways[n];
    }

    //tabulation O(n)
    public static int countWaysTab(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;

        for(int i=1; i<=n; i++){
            if(i == 1){
                dp[i] = dp[i-1] + 0; //for -ve
            }
            else{
                dp[i] = dp[i-1] + dp[i-2];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5; 
        int ways[] = new int[n+1];
        Arrays.fill(ways, -1);//fills -1

        System.out.println(countWaysRec(n));
        System.out.println(countWaysMem(n, ways));
        System.out.println(countWaysTab(n));
    }
    
}
