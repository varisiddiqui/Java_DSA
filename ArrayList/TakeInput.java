import java.util.*;
public class TakeInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        ArrayList<Integer> list = new ArrayList<>();
        while(n > 0){
            list.add(sc.nextInt());
            n--;
        }
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        

    }
    
}
