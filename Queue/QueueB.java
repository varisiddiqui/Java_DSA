public class QueueB{
    public static class Queue{
        static int arr[];
        static int size;
        static int rear;
        

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        public static void enqueue(int data){
            if(rear == size-1){
                System.out.println("queue is full");
                return;
            }

            rear = rear+1;
            arr[rear] = data;
        }

        public static int dequeue(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            int front = arr[0];
            int i=0;
            while(i<rear){
                arr[i] = arr[i+1];
                i++;
            }

            rear = rear-1;//size dec by 1
            return front;
        }

        public static int print(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            return arr[0];
        }
    }

        public static void main(String[] args) {
            Queue q = new Queue(5);
            Queue.enqueue(1);
            q.enqueue(2);
            q.enqueue(3);

            while(!q.isEmpty()){
                System.out.println(q.print());
                q.dequeue();
            }

        }

    
}