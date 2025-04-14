import java.util.ArrayList;

public class PairSum {
    /* public static boolean pairSum(ArrayList<Integer> arr, int target) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if ((arr.get(i) + arr.get(j)) == target) {
                    //System.out.println(arr.get(i) + " " + arr.get(j));
                    return true;
                }

            }
        }
        return false;
    } */

    //2-pointer
    public static boolean pairSum(ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size()-1;

        while(lp < rp){ //!=
            //case 1
            if(list.get(lp)+list.get(rp) == target){
                return true;
            }
            //case2
            else if(list.get(lp)+list.get(rp) < target){
                lp++;
            }
            //case 3
            else{
                rp--;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(pairSum(list, 50));
    }
}
