public class largestNumber {
    public static int displayLarge(int arr[]){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(large<arr[i]){
                large=arr[i];
            }
        }
        return large;
    }
    public static int displaySmall(int arr[]){
        int small=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(small>arr[i]){
            small=arr[i];
            }
        }
        return small;
    }
    public static void main(String[] args){
        int arr[]={8,123,569,25,3600};
        int largest=displayLarge(arr);
        System.out.println("Largest Number in the array is:"+largest);
        int smallest=displaySmall(arr);
        System.out.println("Largest Number in the array is:"+smallest);
    }

    
}
