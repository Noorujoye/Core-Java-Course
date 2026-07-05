package Multithreading;

class Life extends Thread {

}

public class LifeCycle extends Thread {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(3000);
                System.out.println(currentThread().getState());
                System.out.println("resume");
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted...");
            }
        });
        t1.start();
        Thread.sleep(500);
    }
}
