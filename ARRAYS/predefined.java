import java.util.Arrays;
import java.util.Collections;
public class predefined {
    public static void rev(Integer arr[]){
        Arrays.sort(arr,0,4,Collections.reverseOrder());
    }
    public static void print(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Integer arr[]={5,4,1,3,2,5,8,6,4,7,2,6,5,6};
        rev(arr);
        print(arr);
    }
    
}
