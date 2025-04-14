public class LastOccurrence {
    public static int lastOccurrence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }

        int isFound = lastOccurrence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        System.out.println(isFound);
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = {8,3,6,5,6,5};
        System.out.println(lastOccurrence(arr, 6, 0));
    }

 
    
}
