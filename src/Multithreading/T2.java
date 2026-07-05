package Multithreading;

public class T2 implements Runnable {
    @Override
    public void run() {
        System.out.println("T2");
    }

    public static void main(String[] args) {
        T2 t2 = new T2();
        Thread t = new Thread(t2);
        System.out.println("t");
        t.start();
        System.out.println(t.getState());
    }
}
