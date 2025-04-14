public class StackB {
     static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static class Stack{
        Node head=null;

        public boolean isEmpty(){
            return head == null;
        }

        //push
        public void push(int data){
            Node newNode = new Node(data);

            if(isEmpty()){
                head=newNode;
                return;
            }
            
            newNode.next=head;
            head=newNode;
        }

        //pop
        public  int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;

        }

        //peek
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
            
        }

        public void pushAtBottom(int data){
            if(isEmpty()){
                push(data);
                return;
            }
            int top=pop();
            pushAtBottom(data);
            push(top);
        }

        // Print stack
        public void printStack(Stack s) {
            Stack tempStack = new Stack();
            // Move elements to tempStack for printing
            while (!s.isEmpty()) {
                int data = s.pop();
                System.out.print(data + ",");
                tempStack.push(data);  // Store in tempStack
            }

            System.out.println();

            // Restore elements back to the original stack
            while (!tempStack.isEmpty()) {
                s.push(tempStack.pop());
            }
        }

        //reverse stack
        public void reverseStack(Stack s){
            if(s.isEmpty()){
                return;
            }

            int top=s.pop();
            reverseStack(s);
            pushAtBottom(top);
        }
            
        }

    

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        s.printStack(s);// Before

        s.reverseStack(s);
        s.printStack(s);// After

         

        /* while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        after this stack will be empty */

        //s.pushAtBottom(4);
        
    }
    
}
