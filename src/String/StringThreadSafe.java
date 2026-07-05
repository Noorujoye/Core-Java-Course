package String;

public class StringThreadSafe extends Thread {
    static String shared = "java";

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            String local = shared;
            System.out.println("thread 1 read: " + local);
            shared = "python";
            System.out.println("thread 1 changed reference to: " + shared);
        });
        Thread t2 = new Thread(() -> {
            String local = shared;
            System.out.println("thread 2 read: " + local);
            shared = "c++";
            System.out.println("thread 2 changed reference to: " + shared);
        });
        t1.start();
        t2.start();
    }
}
