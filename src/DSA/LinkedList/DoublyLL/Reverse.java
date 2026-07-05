package DSA.LinkedList.DoublyLL;
import DSA.LinkedList.DoublyLL.Creation.Node;

import java.util.Stack;

public class Reverse {
    //Naive approach
    public Node reverseLL(Node head) {
        Stack<Integer> st = new Stack<>();
        Node temp = head;
        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }

        // Replace data from stack
        temp = head;
        while (temp != null) {
            temp.data = st.pop();
            temp = temp.next;
        }
        return head;
    }

    // Better two variable
    public static Node reverse(Node head) {
        Node temp = head;
        Node back = temp.prev;
        Node front = temp.next;

        while (temp != null) {
            temp.next = back;
            temp.prev = front;
            temp = temp.next;
        }
        return head;
    }

    //optimal solution using swapping
    public static Node reverseSwap(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node curr = head;
        Node back = null;

        while (curr != null) {

            // store the curr
            back = curr;

            //swap prev and next
            Node temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;

            curr = curr.prev;
        }
        return back;
    }
    public static void main(String[] args) {
        Creation c = new Creation();
        int[] arr = {1,2,3,45,6,9};
        Node head = c.createDoubly(arr);
        c.print(head);

        //naive reverse
        Reverse r = new Reverse();
        head = r.reverseLL(head);
        c.print(head);

        //Better
        head = r.reverse(head);
        c.print(head);

        //reverseSwap
        Creation c1 = new Creation();
        int[] arr1 = {1,2,3,45,6,9};
        Node head1 = c1.createDoubly(arr1);
        c1.print(head1);
        Reverse r1 = new Reverse();
        head1 = r1.reverseSwap(head1);
        c1.print(head1);
    }
}
