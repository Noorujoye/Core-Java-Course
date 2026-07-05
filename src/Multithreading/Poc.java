package Multithreading;

class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " printed by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Even thread interrupted");
                }
            }
        }
    }
}

class OddThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " printed by " + Thread.currentThread().getName());

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Odd thread interrupted");
                }
            }
        }
    }
}

public class Poc extends Thread {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println("main thread state : " + currentThread().getState());
//        System.out.println("main thread : " + currentThread().getName());
//        System.out.println("main thread state : " + currentThread().getState());


       /*
        long start = System.currentTimeMillis();

        EvenThread e0 = new EvenThread();
        EvenThread e1 = new EvenThread();
        EvenThread e2 = new EvenThread();
        e0.setName("even-0");
        e1.setName("even-1");
        e2.setName("even-2");
        e0.start();
        e1.start();
        e2.start();

        e0.join();
        e1.join();
        e2.join();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        */

        long start = System.currentTimeMillis();
        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();
        long end = System.currentTimeMillis();

        even.start();
        odd.start();
        even.join();
        odd.join();

        System.out.println(end - start);


    }
}
