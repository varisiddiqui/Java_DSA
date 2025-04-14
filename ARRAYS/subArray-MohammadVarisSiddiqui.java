public class subArray {
    public static void main(String[] args) {
        int arr[] = { 1,-2,6,-1,3 };
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    //System.out.print(arr[k]);
                    sum = sum + arr[k];
                }
                if (max < sum)
                    max = sum;// shows maximum value
                if (min > sum)
                    min = sum;// shows minimum value
                sum = 0;
                //System.out.print(" ");
            }
            //System.out.println();
        }
        System.out.println("Maximum sum of subArray is:"+max);
        System.out.println("Minimum sum of subArray is:"+min);
    }

}
