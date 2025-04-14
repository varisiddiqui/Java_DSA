class StackC {
     int[] stack;
     int top;
     int capacity;

    // Constructor to initialize the stack
    public StackC(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    // Push method to add elements to the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
    }

    // Pop method to remove elements from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    // Peek method to view the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stack[top];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    
public void stockSpan(int stocks[], int span[]){
        span[0]=1;
        push(0);
        
        for(int i=1; i<stocks.length; i++){
            int currPrice = stocks[i];
            while(!isEmpty() && currPrice >= stocks[peek()]){
                pop();
            }

            if(isEmpty()){
                span[i]=i+1;
            } 
            else{
                int prevHigh=peek();
                span[i]=i-prevHigh;
            }

            push(i);

        }       
    }



    public static void main(String[] args) {
        int stocks[] = {100,80,60,70,60,85,100};
        int span[] = new int[stocks.length];
        

        StackC stack = new StackC(stocks.length);
        
        stack.stockSpan(stocks, span);

        for(int i=0; i<span.length; i++){
            System.out.print(span[i]+" ");
        }
        

       /*  System.out.println("Top element is: " + stack.peek());

        System.out.println("Popped element is: " + stack.pop());

        System.out.println("Top element after pop: " + stack.peek()); */
    }
}
