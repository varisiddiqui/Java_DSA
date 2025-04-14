public class LinkedList{
    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        //create new node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //newNode next=head
        newNode.next=head;
        
        //head=newNode
        head=newNode;
        
    }
   
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    
    //insertion done by mine 
    //  public void Insert(int data,int index){
    //     if(head==null){
    //         Node newNode=new Node(data);
    //         head=newNode;
    //         return;
    //     }
    //     int count=1;
    //     Node temp=head;
    //     while(temp!=null){
    //         if(count==index&&index!=0){
    //             Node newNode=new Node(data);
    //             newNode.next=temp.next;
    //             temp.next=newNode;
                
    //             return;
    //         }
    //         if(index==0){
    //             Node newNode=new Node(data);
    //             newNode.next=temp;
    //             head=newNode;
    //             return;
    //         }
    //         temp=temp.next;
    //         count++;
    //     }
        
    // }
    
    public void add(int index,int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty"); 
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
    }
    //prev:  i=size-2
    
    Node prev=head;
    for(int i=0;i<size-2;i++){
    prev=prev.next;
    }
    int val=prev.next.data;
    prev.next=null;
    tail=prev;
    size--;
    return val;
    
    
    }
    
    public int search(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data == key){
                //key found
                return i;
            }
            i++;
            temp = temp.next;
        }
        //key not found
        return -1;
    }
    
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        
        while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
        }
        head=prev;    
    }

    public void deleteNthfromEnd(int n){
        //calculate size
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }

        if(n == sz){
            head=head.next;//removeFirst
            return;
        }

        //sz-n
        int i=1;
        int iToFind = sz-n;
        Node prev = head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
     
    //Slow Fast Approach
    public Node findMid(Node head){//helper function
        Node slow=head;
        Node fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;//slow is my mid
        
        
        
    }
    
    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        
        //step1- find mid
        Node midNode = findMid(head);
        
        //step2- reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right = prev;//right half head
        Node left=head;//left half head 
        
        //step3- check left half & right half
        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        
        return true;
        
    }
    
    public boolean isCycle(){
        Node slow=head;
        Node fast=head;
        
        while(fast != null && fast.next != null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
            if(slow == fast){
                return true;
            }
        }
        return false;
        
    }
    
    public static void removeCycle(){
        //detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast !=null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast == slow){
                cycle=true;
                break;
            }
        }
        
        if(cycle==false){
            return;
        }
        
        //finding meeting point
        slow = head;
        Node prev = null;//last node
        while(slow != fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        
        
        //remove cycle -> last.next=null
        prev.next=null;
        
    }
    
        
    public void print(){
        if(head==null){
            System.out.println("LinkedList is empty!!");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
        
        
    }
   

    public static void main(String args[]){
        LinkedList ll=new LinkedList();
        // ll.addFirst(2);
        // ll.print();
        // ll.addFirst(1);
        // //ll.print();
        // ll.addLast(3);
        // //ll.print();
        // ll.addLast(4);
        // //ll.print();
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.addLast(1);
        System.out.println();
        System.out.println();
        System.out.println();
      
        //ll.Insert(5,3);
         //ll.add(2,5);
        // System.out.println("size after adding 5:"+ll.size);
        // System.out.println();
        // System.out.println(ll.removeFirst());
        // System.out.println("size after deleting first:"+ll.size);
        // ll.print();
        // System.out.println();
        // System.out.println(ll.removeLast());
        // System.out.println("size after deleting last:"+ll.size);
        ll.print();
        System.out.println();
        System.out.println("Searching key");
        System.out.println(ll.search(3));
        System.out.println(ll.search(10));
        //ll.print();
       // ll.reverse();
        ll.print();
        System.out.println("Palindrome:"+ll.checkPalindrome());
        
        head=new Node(1);
        Node temp=new Node(5);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
      
        System.out.println("isCycle:"+ll.isCycle());
        ll.removeCycle();
        ll.print();
        ll.deleteNthfromEnd(2);
        ll.print();
        System.out.println("isCycle:"+ll.isCycle());
        
    }
    
}