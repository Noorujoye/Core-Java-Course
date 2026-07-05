package CollectionFramework.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // it works on the principle of priority by natural ordering
        // for numbers , smallest first

        // it uses MIN_HEAP , because the smallest one comes at the root

        // purpose is not sorting it by choice , that small one will be at top other will be in the order
        // PQ IS IMPLEMENTED AS A MIN HEAP FOR NATURAL ORDERING

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(40);
        pq.offer(20);
        pq.offer(50);
        pq.offer(30);
        pq.offer(10);

        System.out.println("priority : " + pq.peek());
        System.out.println(pq);

        System.out.println("it wll just print in the order: " + pq);
        System.out.println("according to the priority: which is the smallest wil get printed :  " + pq.peek());
        System.out.println("remove the first one: which is the smallest among all : " + pq.poll());

        // now the top will always be the largest because of customize comparator
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());

        pq1.offer(40);
        pq1.offer(20);
        pq1.offer(50);
        pq1.offer(30);
        pq1.offer(10);

        System.out.println("top is : " + pq1.peek());


        // u can use any class like student in place of primitive integer
        PriorityQueue<Integer> pq2 = new PriorityQueue<>((x,y) -> x-y); // ascending order
        PriorityQueue<Integer> pq3 = new PriorityQueue<>((x,y) -> y-x); // descending order


        pq2.offer(40);
        pq2.offer(20);
        pq2.offer(50);
        pq2.offer(30);
        pq2.offer(10);

        System.out.println("top is : " + pq2.peek());

    }
}
