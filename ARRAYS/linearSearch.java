public class linearSearch{
    public static int search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={5,4,6,9,8,7,3,4};
        int key=9;
        int result=search(arr,key);
        if(result==-1){
            System.out.println(key+" NOT FOUND");
        }
        else{
            System.out.println("Index of "+key+" is:"+result);
        }
        
    }
}

    

