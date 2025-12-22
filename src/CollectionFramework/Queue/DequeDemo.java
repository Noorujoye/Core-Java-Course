package CollectionFramework.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        // stack , queue
        // double ended queue
        // insert and delete from both end
        // u can use methods of queue

        Deque<Integer> dq = new ArrayDeque<>(); // it good for the access, pointer were displaced and there shouldf not be null
        dq.offerFirst(10);
        dq.offerLast(20);
        dq.offerFirst(5);
        dq.poll();
        dq.poll();
        dq.poll();
      //  System.out.println(dq.poll()); // this method supports and gives null when empty
        //System.out.println(dq.pop()); // will throw exception
//        dq.getFirst(); // will throw exception
        Deque<Integer> dq1 = new LinkedList<>(); // it is faster for the insertion and deletion operation in the middle

        dq1.offerFirst(10);
        dq1.offerLast(20);
        dq1.offerFirst(5);
        dq1.poll();
        dq1.poll();
        dq1.poll();
        System.out.println(dq1.pop()); // exception
//        System.out.println(dq1.element());





    }
}
