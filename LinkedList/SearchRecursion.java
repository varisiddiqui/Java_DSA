public class SearchRecursion {
    public static class Node{
        int data;
        Node next;
        Node(int val){
            this.data = val;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;


    //MINE CONCEPT
    /* public static int search(Node temp, int key){
        //Base Case
        if(temp == null){
            System.out.println("Not found");
            return -1;
        }

        //recursion
        if(temp.data == key){
            return 0;
        }
        int x = search(temp.next, key);
        if(x != -1){
            return x+1;
        }
        return -1;
    } */


    //MA'AM'S CONCEPT
    public static int helper(Node head, int key){
        //Base Case
        if(head == null){
            return -1;
        }

        //recursion
        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        
        return idx+1;
    }

    public static int recSearch(int key){
        return helper(head, key);
    }

    public static void main(String args[]){
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(14);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = null;
        //System.out.println(search(head, 4));  mine
        System.out.println(recSearch(14));

    }
    
}
