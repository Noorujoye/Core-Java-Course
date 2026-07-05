package DSA.LinkedList.DoublyLL;
import DSA.LinkedList.DoublyLL.Creation.Node;
public class Insertion {
    private Node insertBeforeHead(Node head , int value) {
        if (head == null) return head;
        Node newHead = new Node(value);
        newHead.next = head;
        head.prev = newHead;
        head = newHead;
        return head;
    }
    private Node insertBeforeTail(Node head, int value) {

        if (head.next == null) return insertBeforeHead(head ,value);

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node newNode = new Node(value);
        Node back = tail.prev;
        back.next = newNode;
        newNode.prev = back;
        newNode.next = tail;
        tail.prev = newNode;
        return head;
    }
    private Node BeforeTheKthElement(Node head , int value, int k) {

        if (k == 1) return insertBeforeHead(head,value);

        Node temp = head;
        int count = 0;
        while (temp.next != null) {
            count++;
            if (count == k) break;
            temp = temp.next;
        }
        Node back = temp.prev;
        Node newNode = new Node(value);
        back.next = newNode;
        newNode.prev = back;
        newNode.next = temp;
        temp.prev = newNode;
        return head;

    }
    private Node inserBeforeGivenNode(Node head ,Node node , int val) {


        Node back = node.prev;
        Node newNode = new Node(val);

        if (node == head) {
            newNode.next = head;
            head.prev = newNode;
            return newNode; // new node becomes head
        }



        back.next = newNode;
        newNode.prev = back;
        newNode.next = node;
        node.prev = newNode;
        return head;
    }
    public static void main(String[] args) {
        Creation c = new Creation();
        int[] arr = {1,2,3};
        Node head = c.createDoubly(arr);
        c.print(head);

        Insertion insert = new Insertion();
        head = insert.insertBeforeHead(head,10);
        c.print(head);

        head = insert.insertBeforeTail(head,10);
        c.print(head);

        head = insert.BeforeTheKthElement(head,10 , 2);
        c.print(head);

        head = insert.inserBeforeGivenNode(head, head.next.next,5);
        c.print(head);

    }
}
