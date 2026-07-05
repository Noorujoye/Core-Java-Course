package Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class Ways extends Thread {

    // shared
    AtomicInteger count = new AtomicInteger(5);

    public void run() {
        System.out.println("Thread-1 is running... : " + count.incrementAndGet());
    }

    public static void main(String[] args) {

        Ways w = new Ways();

        Thread t2 = new Thread(() -> {

            System.out.println("Thread-2 is running... : " + w.count.incrementAndGet());
        });

        Runnable t = () -> {
            System.out.println("Thread-3 is running... : " + w.count.incrementAndGet());
        };
        Thread t3 = new Thread(t);


        // order is not fixed, any one will come first..
        w.start();
        t2.start();
        t3.start();
    }
}
