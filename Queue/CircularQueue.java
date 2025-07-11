public class CircularQueue {
    public static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return ((rear+1) % size) == front;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("queue is full");
                return;
            }

            //add 1st element
            if(front == -1){
                front = 0;
            }

            rear = (rear+1) % size;
            arr[rear] = data;
        }

        public static int remove(){ //jo bhi operation ka medium hai wo idx se hai
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            int result = arr[front];

            //if last el delete
            if(rear == front){//yahan sirf front hi delete ho hokar rear ke pass pahunchega, na ki rear
                rear = front = -1;
            }
            else{
            front = (front+1) % size;
            }
            return result;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
            Queue.add(1);
            q.add(2);
            q.add(3);
            System.out.println(q.remove());
            q.add(4);
            System.out.println(q.remove());
            q.add(5);

            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }

    }
    
}
