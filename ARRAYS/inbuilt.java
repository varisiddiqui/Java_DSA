import java.util.Arrays;
public class inbuilt {
    public static void sorted(int arr[]){
        Arrays.sort(arr,0,3);
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        sorted(arr);
        print(arr);
    }
    
}
