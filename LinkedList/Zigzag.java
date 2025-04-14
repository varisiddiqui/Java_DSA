class Zigzag{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

     Node head;

    public static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    public static Node deepCopy(Node head){
        Node temp = new Node(head.data);
        Node curr = temp;
        head = head.next;

        //deep copy
        while(head != null){
            curr.next = new Node(head.data);
            curr = curr.next;
            head = head.next;
        }
        
        return temp;
    }

    public static Node zigzag(Node dup, Node rev){
        Node temp = new Node(dup.data);
        Node res = temp;
        dup = dup.next;
        while(dup != null){
            res.next = new Node(rev.data);
            res.next.next = new Node(dup.data);
            rev = rev.next;
            if(rev.data == dup.data){
            break;
            }
            dup = dup.next;
             
            res = res.next.next;
        }
        

        return temp;
    }

    public static void main(String args[]){
        Zigzag ll = new Zigzag();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        //head.next.next.next.next.next = null;

        Node dup = ll.deepCopy(head);

        Node revHead = ll.reverse(dup);

        Node res = ll.zigzag(head, revHead);

        //Printing Zigzag linkedlist
        while(res != null){
            System.out.print(res.data+"->");
            res = res.next;
        }
        System.out.println("null");

 

        

        
    }
}