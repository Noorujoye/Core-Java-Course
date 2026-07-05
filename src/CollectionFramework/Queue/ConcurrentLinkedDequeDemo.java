package CollectionFramework.Queue;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeDemo {
    public static void main(String[] args) {
        // non-blocking , thread safe double ended queue
        // cas-> compare and swap  strategy

        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        deque.add("Element1");
        deque.addFirst("element2");
        deque.addLast("element3");
        System.out.println(deque);

        String first = deque.removeFirst();
        String last = deque.removeLast();

    }
}
