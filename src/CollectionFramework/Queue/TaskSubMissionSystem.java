package CollectionFramework.Queue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class TaskSubMissionSystem {
   static ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

    public static void main(String[] args) {
        Thread produce = new Thread( () -> {
            while(true) {
                try {
                    queue.add("TAsk" + System.currentTimeMillis());
                } catch (Exception e) {
                    e.printStackTrace(); // koi blocking h nhi isliye no interruptio
                }
            }
        });

        Thread consume = new Thread( ()-> {
            while (true) {
                try {
                    String task = queue.poll();
                    System.out.println("processign..." + task);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        produce.start();
        consume.start();
    }
}
