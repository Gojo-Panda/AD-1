package Queue;

public class queueUsingArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        Queue(int n){
            arr = new int[n];
            Queue.size = n;
        } 
        public static boolean isEmpty(){
            return (rear == -1);
        }
        public void enqueue(int n){
            if(rear == size - 1){
                System.out.println("Queue Overflow");
                return;
            }
            rear = rear + 1;
            arr[rear] = n;
        }
        public static void dequeue(){
            if(isEmpty()){
                System.out.println("Queue Underflow");
                return;
            }
            System.out.println(arr[0] + " is removed");
            for(int i = 1; i < size; i++){
                arr[i - 1] = arr[i];
            }
            size = size - 1;
            rear = rear - 1;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
        public static void display(){
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + "-->");
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        System.out.println(q.peek());
        while(! q.isEmpty()){
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
