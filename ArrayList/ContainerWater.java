import java.util.ArrayList;
public class ContainerWater {
    
    //brute-force
    /* public static int mostWater(ArrayList<Integer> list){
        int maxWater = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                int height = Math.min(list.get(i), list.get(j));
                int width = j-i;
                maxWater = Math.max(maxWater, height*width);

            }
        }
        return maxWater;
    } */


    //2-pointer approach - O(n)
    public static int maxWater(ArrayList<Integer> list){
        int lp = 0;
        int rp = list.size()-1;
        int maxWater = Integer.MIN_VALUE;
        while(lp < rp){
            //claculate water area
            int height = Math.min(list.get(lp), list.get(rp));
            int width = rp-lp;
            maxWater = Math.max(maxWater, height*width);
            
            //update ptr
            if(list.get(lp) < list.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }




    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        //System.out.println(mostWater(height));
        System.out.println(maxWater(height));
    }
}
