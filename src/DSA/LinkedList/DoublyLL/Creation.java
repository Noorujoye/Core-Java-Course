package DSA.LinkedList.DoublyLL;

public class Creation {

    // static + public so other class can use it
    public static class Node {
         int data;
         Node next;
         Node prev;

        public Node (int data) {
            this.data = data;
        }
    }
    private Node head;
    private Node tail;


    //create doubly LL from array
    public Node createDoubly(int[] arr) {
        if (arr.length == 0) return null;

        head = new Node(arr[0]);
        tail = head; // tails points to the head

        for (int i=1; i<arr.length; i++) {
            Node temp = new Node(arr[i]);

            tail.next = temp; // new node connected to the cur
            temp.prev = tail; // newNode prev pointing to the prev node

            tail = temp;      // tail moves to point to the new node
        }
        return head;
    }
    public Node getHead() {
        return head;
    }
    void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " <-> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {

        Creation c = new Creation();
        int[] arr = {1,2,3,5,6,7};
        Node head = c.createDoubly(arr);
        c.print(head);
    }
}
