public class binary {
    public static void main(String[] args){
        int arr[]={5,6,8,2,9,3};
        int start=0,end=arr.length-1;
        int key=5;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                System.out.print("Index of "+key+" is:"+mid);
                return;
            }
            if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        
        
    }
    
}
