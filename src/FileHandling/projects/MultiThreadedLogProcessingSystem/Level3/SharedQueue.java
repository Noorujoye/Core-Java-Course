package FileHandling.projects.MultiThreadedLogProcessingSystem.Level3;

import java.util.LinkedList;
import java.util.Queue;

public class SharedQueue {

    private final Queue<String> queue = new LinkedList<>();
    private static final int MAX_SIZE = 5;
    private boolean productionCompleted = false;


    public synchronized void put(String line) throws InterruptedException {

        while (queue.size() == MAX_SIZE) {
            System.err.println("Producer Waiting...");
            wait();
            System.out.println("Producer Resumed...");
        }
        System.out.println("Producer Resumed...");
        queue.offer(line);
        notifyAll();
    }

    public synchronized String take() throws InterruptedException {
        while (queue.isEmpty() && !productionCompleted) {
            while (queue.size() == MAX_SIZE) {

                System.out.println("Consumer Waiting...");

                wait();

                System.out.println("Consumer Resumed...");
            }
        }
        if (queue.isEmpty() && productionCompleted) {
            return null;
        }
        System.out.println("Consumer Resumed...");
        String line = queue.poll();
        notifyAll();
        return line;
    }

    public synchronized boolean isEmpty() {
        return queue.isEmpty();
    }

    public synchronized void markProductionCompleted() {
        productionCompleted = true;
        notifyAll();
    }
}