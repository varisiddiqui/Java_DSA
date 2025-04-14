public class binary {
    public static void main(String[] args){
        int arr[]={5,12,18,20,35,56,68};
        int start=0,end=arr.length-1;
        int key=35;
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
