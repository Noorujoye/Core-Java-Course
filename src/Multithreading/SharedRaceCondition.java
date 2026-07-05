package Multithreading;

public class SharedRaceCondition {
    //    AtomicInteger count = new AtomicInteger();
    int count = 0;

    public static void main(String[] args) throws InterruptedException {
        SharedRaceCondition s = new SharedRaceCondition();
        Thread a = new Thread(() -> {
            for (int i = 0; i < 50000; i++) {
//                s.count.incrementAndGet();
                s.count++;
//                synchronized (s) {
//                    s.count++;
//
//                }
            }
        });
        Thread b = new Thread(() -> {
            for (int i = 0; i < 50000; i++) {
//                s.count.incrementAndGet();
                s.count++;
//                synchronized (s) {
//                    s.count++;
//
//                }
            }
        });
        a.start();
        b.start();
        a.join();
        b.join();
        System.out.println(s.count);
    }
}
