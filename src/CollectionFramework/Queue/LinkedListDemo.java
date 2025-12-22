package CollectionFramework.Queue;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        //perfroming queue operation using linkedlist
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(10);
        queue.addLast(20);
        queue.addLast(30);
        queue.addLast(40);
        queue.addLast(50);


        System.out.println("queue is : " + queue);

        System.out.println("first element of the queue: " + queue.peek());

        queue.removeFirst();
        queue.removeFirst();
        queue.removeFirst();
        queue.removeFirst();
        queue.removeFirst();
        System.out.println("after removing : " + queue);
        System.out.println("exception " + queue.getLast());




    }
}
