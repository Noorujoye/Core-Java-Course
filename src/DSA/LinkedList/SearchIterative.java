package DSA.LinkedList;
import java.util.LinkedList;

public class SearchIterative {
    public class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int searchKey(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }


    public int helperFunction(Node head, int key) {
        //recursion mein era head change hoga
        if (head == null) {
            return -1;
        }
        if (head.data==key) {
            return 0;
        }
        int idx = helperFunction(head.next,key);
        if (idx == -1) {
            return -1;
        }
        return idx+1;
    }
    private int searchWithRecursion(int key) {
        return helperFunction(head,key);
    }

    public static void main(String[] args) {
        SearchIterative node = new SearchIterative();
        node.addFirst(1);
        node.addFirst(5);
        node.addFirst(10);
        node.addFirst(20);
        node.addFirst(100);
        //print
        node.print();
        //search for key
        System.out.println(node.searchKey(10));
        int res = node.searchWithRecursion(10);
        System.out.println(res);

    }
}
