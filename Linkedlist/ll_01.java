public class ll_01 {
    static class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class ll{
        private Node head;
        private int size;
        public ll(){
            this.head = null;
            this.size = 0;
        }
        public void addHead(int data){
            Node node = new Node(data);
            if(head != null){
                node.next = this.head;
            }
            head = node;
            size++;
        }
        public void addEnd(int data){
            Node node = new Node(data);
            Node one = head;
            while(one.next != null){
                one = one.next;
            }
            one.next = node;
            size++;
        }
        public void addAtPosition(int data, int position) {
            if(position < 0){
                return;
            }
            Node newNode = new Node(data);
            if(position == 0){
                newNode.next = head;
                head = newNode;
            }else{
                Node current = head;
                int index = 0;
                while (current != null && index < position - 1) {
                    current = current.next;
                    index++;
                }
                if(current == null){
                    return;
                }
                newNode.next = current.next;
                current.next = newNode;
            }
            size++;
        }
        public void reverse() {
            Node prev = null;
            Node current = head;
            Node next = null;
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;
        }
        public void removeHead(){
            if(size == 0){
                return;
            }
            head = head.next;
            size--;
        }
        public void removeTail(){
            if(size == 0){
                return;
            }
            Node one = head;
            while(one.next.next != null){
                one = one.next;
            }
            one.next = null;
            size--;
        }
        public int deleteNode(int index){
            int value;
            if(head == null){
                return -1;
            }
            if(head.next == null){
                value = head.data;
                head = null;
                return value;
            }
            Node prev = head;
            Node curr = head.next;
            for(int i = 1;i< index;i++){
                prev = prev.next;
                curr = curr.next;
            }
            value = curr.data;
            prev.next = curr.next;
            return value;
        }
        public Node reverseRecursive(Node head){
            if(head==null || head.next==null){
                return head;
            }
            Node newHead = reverseRecursive(head.next);
            head.next.next = head;
            head.next = null;
            return newHead;
        }
        public void addSorted(int value ) {
            Node newNode = new Node(value);
            Node curr =head;
            size=size+1;
            
            if(curr==null|| curr.data>value) {
                newNode.next=head;
                head=newNode;
                return;
            }
            while(curr.next!=null && curr.next.data<value) {
                curr=curr.next;
            }
            newNode.next=curr.next;
            curr.next=newNode;
        }
        public void sort(int value){
            Node node = head;
            Node curr = head;
            size++;
            if(curr == null || curr.data > value){
                node.next = head;
                head = node;
                return;
            }
            while(curr.next != null && curr.next.data < value){
                curr = curr.next;
            }
            node.next = curr.next;
            curr.next = node;
        }
        public void print(){
            Node one = head;
            while(one != null){
                System.out.print(one.data + " --> ");
                one = one.next;
            }
            System.out.print("null");
            System.out.println();
        }
    }    
    public static void main(String[] args) {
        ll n = new ll();
        n.addHead(10);
        n.addHead(20);
        n.addHead(30);
        n.addHead(40);
        n.print();
        n.addEnd(10);
        n.print();
        n.addAtPosition(100, 2);
        n.print();
        System.out.println(n.size);
        n.reverse();
        n.print();
        n.removeHead();
        n.print();
        n.removeTail();
        n.print();
        // System.out.println(n.size);
        // n.sort(40);
        // n.print();
        System.out.println(n.deleteNode(2));
        n.print();
        n.head = n.reverseRecursive(n.head);
        n.print();
    }
}
