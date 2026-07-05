package DSA.LinkedList.DoublyLL;

import DSA.LinkedList.DoublyLL.Creation.Node;

public class DeletionInLL {

    // DELETE FIRST , MOVE HEAD TO THE NEXT AND MAKE IT PREV NULL
    private Node deleteFirst(Node head) {
        if (head == null) return null; // u can't delete

        if (head.next == null) {
            return null;
        }

        head = head.next;
        head.prev = null;
        return head;
    }

    // DELETE LAST , traverse the LL using temp pointer and then delete
    private Node deleteLast(Node head) {
        if (head == null) return null; // u can't delete
        if (head.next == null) {
            return null;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        // this lines simply means u'r standing at last node
        // u have to move to prev node and make it next to null to unlinked
        temp.prev.next = null;
        temp.prev = null;
        return head;
    }

    // DELETE KTH NODE
    private Node deleteKth(Node head , int key) {
        if (head == null) return null; // u can't delete

        // delete head
        if (head.data == key) {
            Node next = head.next;
            if (next != null) {
                next.prev = null;
            }
            head = next;
            return head;
        }
        Node temp = head;
        // search node with the key
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        // key not found
        if (temp == null) {
            System.out.println("key not found");
            return head;
        }

        int count = 0;
        Node front = temp.next;
        Node back = temp.prev;
        while (temp.next != null) {
            count++;
            if (count == key) {
                back.next = front;
                front.prev = back;
            }
            return head;
        }
        return head;
    }

    // DELETE KTH NODE
    private Node deleteNode(Node head , Node temp) {

        if (head == null || temp == null) return head;

        if (temp == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            temp.next = null;
            return head;
        }
        Node prev = temp.prev;
        Node front = temp.next;

        if (front == null) {
            prev.next = null;
            temp.prev = null;
        }
        prev.next = front;
        front.prev = prev;

        temp.next = temp.prev = null;
        return head;
    }


    public static void main(String[] args) {
        Creation c = new Creation();
        int[] arr = {1,2,3,45,6,9};
        Node head = c.createDoubly(arr);
        c.print(head);

//      <--------------------->

        DeletionInLL d = new DeletionInLL();

        head = d.deleteFirst(head);
        c.print(head);

        head = d.deleteLast(head);
        c.print(head);

        head = d.deleteKth(head , 3);
        c.print(head);

        Creation c1 = new Creation();
        int[] arr1 = {1,2,3,45,6,9};
        Node head1 = c1.createDoubly(arr1);
        c1.print(head1);
        head1 = d.deleteNode(head1, head1.next.next);
        c1.print(head1);
    }
}