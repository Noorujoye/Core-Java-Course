package Multithreading;

public class DeadlockExample {

    // Two shared resources (our locks)
    public static Object Lock1 = new Object();
    public static Object Lock2 = new Object();

    public static void main(String[] args) {

        ThreadDemo1 t1 = new ThreadDemo1();
        ThreadDemo2 t2 = new ThreadDemo2();
        t1.start();
        t2.start();
    }

    private static class ThreadDemo1 extends Thread implements Runnable {

        @Override
        public void run() {
            synchronized (Lock1) {
                System.out.println("Thread 1: Holding Lock 1...");

                try {
                    Thread.sleep(50);

                } catch (InterruptedException e) {

                }

                System.out.println("Thread 1: Waiting for Lock 2...");
                synchronized (Lock2) {

                    System.out.println("Thread 1: Holding Lock 1 & 2!");
                }
            }
        }
    }

    private static class ThreadDemo2 extends Thread {
        public void run() {
            synchronized (Lock2) {
                System.out.println("Thread 2: Holding Lock 2...");

                try {
                    Thread.sleep(1000);
                    Lock2.wait();
                } catch (InterruptedException e) {
                }

                System.out.println("Thread 2: Waiting for Lock 1...");
                synchronized (Lock1) {
                    System.out.println("Thread 2: Holding Lock 1 & 2!");

                }
            }
        }
    }
}
