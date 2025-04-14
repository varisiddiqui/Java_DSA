public class Occurrence {
    public static void occur(int arr[], int i, int key){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.print(i+" ");
        }
        occur(arr, i+1, key);
    }

    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key = 2,i =0;
        occur(arr, i, key);

    }
    
}
