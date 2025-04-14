class Solution {
    public int countPathsWithXorValue(int[][] grid, int k) {
        int total
        
    }

    public static int gridWays(int[][] g, int xor, int i, int j, int n, int m){
        if(i==n-1 && j==m-1){
            return 1;
        }
        else if(i==n || j==m){
            return 0;h
        }
        
        xor ^= g[i][j];
        int w1= gridWays(g, xor, i+1, j, n, m);
        int w2 = gridWays(g, xor, i, j+1, n, m);      
        return w1+w2;
    }

    public static void main(String[] args) {
        
    }
}