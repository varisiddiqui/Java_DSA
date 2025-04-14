import java.util.*;
class vari {

    public int minOperations(int nums[], int k) {
        ArrayList<Integer> num= new ArrayList<>();

        for(int i=0;i<nums.length; i++){
            num.add(nums[i]);

        }
        Collections.sort(num, Collections.reverseOrder());
        int n=num.size();

        if(num.get(n-1)<k)
        return -1;

        else if(num.get(0)==num.get(n-1) && num.get(0)==k)
        return 0;

        else{
            int count =0;
            for(int i=0;i<n-1;i++){
                if(num.get(i)==num.get(i+1))
                {
                    continue;
                }
                else{
                    count++;                    
                }

            }
            if(k==num.get(n-1))
            count++;

            if(k<num.get(n-1))
            count +=2;

            return --count;
        }
             
    }


    public static void main(String[] args) {
        int arr[] = {9,7,5,3};
        vari obj = new vari();
        int min =obj.minOperations(arr, 2);
        System.out.println(min);
        
    }
}