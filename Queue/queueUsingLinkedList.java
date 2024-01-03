package Queue;

public class queueUsingLinkedList {

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Elements in the queue are:");
        queue.display();

        queue.dequeue();
        queue.dequeue();

        System.out.println("Elements in the queue after dequeuing are:");
        queue.display();
    }
}

class Node {
    static int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node front;
    Node rear;
    int size;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return (front == null && rear == null);
    }

    public int size() {
        return size;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty. Cannot dequeue.");
        }
        int data = front.data;
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
        }
        size--;
        return data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
