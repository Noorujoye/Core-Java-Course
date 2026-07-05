package FileHandling.projects.MultiThreadedLogProcessingSystem.Level2;

import java.util.LinkedList;
import java.util.Queue;

public class SharedQueue {

    private final Queue<String> queue = new LinkedList<>();

    public void put(String line) {
        queue.offer(line);
    }

    public String take() {
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}