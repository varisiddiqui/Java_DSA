import java.util.Stack;
public class histo {
    public static int maxArea(int arr[]){
        int j,k;
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<arr.length; i++){
            j=i-1;
            k=i+1;
            int c = arr[i]*1;
            while(j>=0){
                if(arr[i] <= arr[j]){
                    c = c+arr[i];
                }
                else{
                    break;
                }
                j--;
            }
            while(k<arr.length){
                if(arr[i] <= arr[k]){
                    c = c+arr[i];
                }
                else{
                    break;
                }
                k++;
            }
            //System.out.println();
            if(s.isEmpty()){
                s.push(c);
            }
            else{
                if(s.peek() < (c)){
                    s.push(c);
                }
            }



        }
        return s.peek();
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 7, 5, 9};
        System.out.println(maxArea(arr));
    }
    
}
