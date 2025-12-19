package DSA.LinkedList;

public class NodeCreation {
    public static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;
    private  int size;

    public void addFirst(int data)
    {
        // step 1: create a new node
        Node newNode = new Node(data);
        size++;

        // Let's assume our LL is empty so our head is empty
        if (head == null) {
            head = tail = newNode;      // I created a new node and if head is empty then I create a new node which has same tail then head point to it
            return;
        }

        // step 2: new node next = head
        newNode.next = head;             // head ka address ab new node ke next mein aa gya hai

        // step 3: add newNode in head
        head = newNode;                  // ab head newNode ko point kr rha hai
    }

    public void addLast(int data)
    {
        // step 3: create a  new Node
        Node newNode = new Node(data);
        size++;
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        // step 2: new node ko link krdo tail se kyuki tail last node ko point krta h
        tail.next = newNode;
        // step 3: tail ko update kro
        tail = newNode;
    }

    public void addAtSpecific(int data , int idx)
    {
        //if index is 0
        if (idx == 0) {
            addFirst(data);
            return;
        }
        // step 1: create a node
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while (i<idx-1) {
            temp = temp.next;
            i++;
        }
        // i = idx-1 ; temp -> prev
        newNode.next=temp.next;
        temp.next = newNode;
    }

    public  int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE; // return infinity
        } else if (size == 1) {
            int val = head.data;
            head=tail= null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        // prev node : i = size-2;
        Node prev = head; //
        for (int i=0; i<size-2; i++) {
            prev=prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int removeMiddle(int idx) {
        if (size == 0) {
            removeFirst();
            return Integer.MIN_VALUE;
        }
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid index");
            return Integer.MIN_VALUE;
        }
        if (idx == 0) {
            return removeFirst();
        }
        if (idx == size - 1) {
            return removeLast();
        }
        Node prev = head;
        for (int i=0; i<idx-1; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        /*
        NodeCreation node1 = new NodeCreation();//object
//      To remove or add nodes we not code in main function but we will create methods for it
//        node1.head = new Node(1);
//        node1.head.next = new Node(2);
         */

        /*
        Methods:
        add(); -> first , last
        remove();
        print();
        search();
         */

        //addFirst
        NodeCreation newNode = new NodeCreation();


        newNode.addFirst(1);
        newNode.addFirst(2);
        newNode.addFirst(3);
        newNode.addFirst(4);
        newNode.addFirst(5);
        newNode.print();

        //addLast
        NodeCreation newNode1 = new NodeCreation();
        newNode1.addLast(1);
        newNode1.addLast(2);
        newNode1.addLast(3);
        newNode1.addLast(4);
        newNode1.addLast(5);
        newNode1.print();

        //addAtSpecific Position
        NodeCreation newNode2 = new NodeCreation();
        newNode2.addLast(1);
        newNode2.addLast(2);
        newNode2.addLast(3);
        newNode2.addLast(5);
        newNode2.addLast(6);
        newNode2.addAtSpecific(4,3);
        newNode2.addAtSpecific(3,0);
        newNode2.print();

        //remove
        newNode2.removeFirst();
        newNode2.print();

        newNode2.removeLast();
        newNode2.print();

        System.out.println("Before removeMiddle:");
        newNode2.print();

        System.out.println("Removed element at index 2: " + newNode2.removeMiddle(2));
        newNode2.print();

    }
}
