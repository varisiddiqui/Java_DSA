import java.util.ArrayList;
public class Classroom {
    public static void main(String[] args) {
        // String Boolean Float
        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList<Boolean> list2 = new ArrayList<>();

        //Add operation
        list.add(1);  //O(1)
        list.add(2);
        list.add(3);
        list.add(5);
        System.out.println(list);

        list.add(3, 4);  //O(n)
        System.out.println(list);
        System.out.println("size :"+list.size());

 
        //Get operation
        int element = list.get(2); //O(1)
        System.out.println(element);

        //Delete operation
        list.remove(2); //O(n)
        System.out.println(list);

        //Set
        list.set(2, 10);
        System.out.println(list);

        //Contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        System.out.println();
        System.out.println("printing list");
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }

    }
}
