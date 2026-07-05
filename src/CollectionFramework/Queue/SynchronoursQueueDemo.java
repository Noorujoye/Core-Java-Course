package CollectionFramework.Queue;

import java.util.concurrent.SynchronousQueue;

public class SynchronoursQueueDemo extends Thread {


    // capacity is zero
    // it note stored , at the realtime it takes and deliver then this process contiues
    // other wise it will either producer to put and consumer to wait and vice-versa
    // iterator is useless because it not sstores
    // task given only when thread is free
//    // consumer
//    @Override
//    public void run() {
//        try {
//            System.out.println("consumer waiting ...");
//            String msg = queue.take();
//            System.out.println("consumed message " + msg);
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }


    public static void main(String[] args) {
        SynchronoursQueueDemo q = new SynchronoursQueueDemo();

        SynchronousQueue<String> queue = new SynchronousQueue<>();
        new Thread(() -> {
            try {
                System.out.println("Consumer waiting...");
                String msg = queue.take();
                System.out.println("Consumed: " + msg);
            } catch (InterruptedException e) {}
        }).start();
        Thread thread = new Thread();
        thread.start();

        new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Producer producing...");
                queue.put("Hello");
            } catch (InterruptedException e) {}
        }).start();

    }
}
