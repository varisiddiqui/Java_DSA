public class rev {
    public static void reverse(int arr[]){
        int l=arr.length;
        int temp=0;
        for(int i=0;i<=(l/2);i++){
            temp=arr[i];
            arr[i]=arr[(l-1)-i];
            arr[(l-1)-i]=temp;
        }
        for(int i=0;i<l;i++){
            System.out.print(arr[i]+",");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,6,7};
        rev obj=new rev();
        obj.reverse(arr);
    }
    
}
