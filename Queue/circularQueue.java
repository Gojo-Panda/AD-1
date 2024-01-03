package Queue;

public class circularQueue {
    static class Queue{
        static int[] arr;
        static int size;
        static int rear;
        static int front;
        Queue(int n){
            arr = new int[n];
            this.size = n;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        public static void enqueue(int n){
            if(rear == size -1){
                System.out.println("Queue is full");
                return;
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = n;
        }
        public static int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            // System.out.println(arr[front] + " is removed");
            int res = arr[front];
            if(rear == front){
                rear = front - 1;
            }else{
                front = (front + 1) % size;
            }
            return res;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];
        }
        public static void display(){
            for (int i = front; i <= rear; i++) {
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
        q.display();
        while(! q.isEmpty()){
            System.out.println(q.peek());
            q.dequeue();
        }
    }
    
}
