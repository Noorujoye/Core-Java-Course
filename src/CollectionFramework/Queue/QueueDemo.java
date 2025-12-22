package CollectionFramework.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        // first in first out principle and insert from one end and delete from one end
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.offer(20);

        System.out.println("queue is :  "+queue);
        queue.remove();
        queue.remove();
        System.out.println(queue);

       // System.out.println(queue.remove()); // throws exception
        System.out.println(queue.poll()); // it will not give exception

    }
}
