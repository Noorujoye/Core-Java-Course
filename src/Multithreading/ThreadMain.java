package Multithreading;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
//        ThreadMain t1 = new ThreadMain();
        ThreadMain t2 = new ThreadMain();
        ThreadMain t3 = new ThreadMain();

        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("after 2 sec");
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        });
        System.out.println("befor start " + t1.getState());
        t1.start();
        System.out.println("after start ");
        Thread.sleep(1000);
        System.out.println("after thread sleep " + t1.getState());
        t1.join();
        System.out.println("after join " + t1.getState());

        Thread t5 = new Thread(() -> {
            System.out.println("Hello");
        });
        t5.start();
        System.out.println(t5.getState());
    }
}
