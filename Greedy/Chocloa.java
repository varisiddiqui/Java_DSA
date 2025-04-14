import java.util.*;
public class Chocloa {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVer [] = {2, 1, 3, 1, 4};//m-1
        Integer costHor [] = {4, 1, 2};//n-1

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h =0, v =0;
        int hp = 1, vp = 1, cost = 0;

        while(h < costHor.length && v < costVer.length){
            //vertical cost <= horizontal cost
            if(costVer[v] <= costHor[h]){//hor cost
                cost += (costHor[h] * vp);
                hp++;
                h++;
            }
            else{//vertical cut
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }

        while(v < costVer.length){
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }

        while(h < costHor.length){
            cost += (costHor[h] * vp);
            hp++;
            h++;

        }

        System.out.println("min cost of cuts = "+cost);


    }
    
}
