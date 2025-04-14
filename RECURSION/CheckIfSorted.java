//mine logic
public class CheckIfSorted {

    static boolean result=false;

    public static  boolean check(int arr[],int c){
        if(arr.length == 1){
            result = true;
            return result;
        }
        
        if(arr[c]<arr[c+1]){
            // base case
            if((c+1)==(arr.length-1)){
                result = true;
                return result;
            }
            check(arr,c+1);
        }
        return result;
        

    }
    
    public static void main(String args[]){
        //CheckIfSorted obj = new CheckIfSorted();
        int arr[]={1,2,3,4,5,6};
        int c=0;
        System.out.println(check(arr,c));
    }
    
}
