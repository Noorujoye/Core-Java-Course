// import java.security.PublicKey;

class A extends Thread {
    public void run() {
        for (int i=1; i<=50; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run() {
        for (int i=1; i<=50; i++) {
            System.out.println("Java is fun");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class C implements Runnable{
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Saving file... " + i);
            try { Thread.sleep(200); } catch (InterruptedException e) {}
        }
    }
}

public class Test {
    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new B();

        obj.start();
        obj1.start();

        // Runnable objC = new C();

        Thread t1 = new Thread(new C());
        t1.start();
    }
}
