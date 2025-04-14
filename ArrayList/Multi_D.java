import java.util.ArrayList;
public class Multi_D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        mainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainList.add(list2);

        

        //printing multi-d list wise
        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get((i));
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }

        //printing multi-d in linear form
        System.out.println(mainList);

        ArrayList<ArrayList<Integer>> mainList2 = new ArrayList<>();
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> listb = new ArrayList<>();
        ArrayList<Integer> listc = new ArrayList<>();

        for(int i=1; i<=5; i++){
            lista.add(i);
            listb.add(i*2);
            listc.add(i*3);
        }
       mainList2.add(lista);
       mainList2.add(listb);
       mainList2.add(listc);
       System.out.println(mainList2);
        
    }
    
}
