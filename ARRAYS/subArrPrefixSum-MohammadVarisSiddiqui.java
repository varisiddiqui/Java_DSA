import java.util.*;

public class subArrPrefixSum {
    public static void prefix(int arr[]) {
        Scanner sc = new Scanner(System.in);
        int prefixArr[] = new int[arr.length];
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        prefixArr[0] = arr[0];
        for (int i = 1; i < prefixArr.length; i++) {
            prefixArr[i] = prefixArr[i - 1] + arr[i];
        }
        for (int i = 0; i < prefixArr.length; i++) {
            int start = i;
            for (int j = i; j < prefixArr.length; j++) {
                int end = j;
                currentSum = (start == 0) ? prefixArr[end] : prefixArr[end] - prefixArr[start - 1];
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Maximum sum:" + maxSum);

    }

    public static int kadan(int arr[]) {
        int max = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
            if (cs < 0) {
                cs = 0;
            }
            max = Math.max(cs, max);

        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        prefix(arr);
        System.out.println("Maximum sum is " + kadan(arr));
    }

}
