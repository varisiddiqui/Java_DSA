public class Diagonal {
    public static int diagonalSum(int arr[][]){//O(1)
        int sum=0;
        for(int i=0;i<arr.length;i++){
            //pd
            sum+=arr[i][i];
            //sd
            if(i!=(arr.length-1-i)){
            sum+=arr[i][arr.length-1-i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(arr));
    }
    
}
