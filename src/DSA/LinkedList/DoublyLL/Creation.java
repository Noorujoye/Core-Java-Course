package DSA.LinkedList.DoublyLL;

public class Creation {
    class Node {
        int data;
        Node next;
        Node prev;

        Node (int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    private Node head = null;
    private Node prev = null;
    public  Node createDoubly(int[] arr) {
        Node newNode = new Node(arr[0]);
        if (head == null) {
            head = prev = newNode;
        }
        for (int i=1; i<arr.length-1; i++) {
            Node temp = new Node(arr[i]);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args) {

        Creation c = new Creation();
        int[] arr = {1,2,3,5,6,7};
        Node head = c.createDoubly(arr);
        print(head);
    }
}
