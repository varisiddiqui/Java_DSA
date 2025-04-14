//Sorted Rotated Array
import java.util.ArrayList;
public class PairSum2 {
    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int lp,rp,pivot=-1;
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > list.get(i+1)){
                pivot = i;
                break;
            }
        }
        lp=pivot+1; //smallest
        rp=pivot; //largest
        while(lp != rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            else if(list.get(lp) + list.get(rp) < target){
                lp = (lp+1) % list.size();
            }
            else{
                rp = (list.size()+rp-1) % list.size();
            }
        }
        return false;

    }
    

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairSum2(list, 100  ));
    }
}
