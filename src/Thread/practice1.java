
// package Thread;
import java.lang.Runnable;

// we'r creating this to implement runnable

// class A implements Runnable {
//     // public void run() {
//     //     for (int i=0; i<20; i++) {
//     //         System.out.println("Hi");
//     //         try {
//     //             Thread.sleep(2);
//     //         } catch (InterruptedException e) {
//     //             System.out.println("hmmmm");
//     //         }
//     //     }
//     // }
// }
// class B implements Runnable {
//     // public void run() {
//     //     for (int i = 0; i < 100; i++) {
//     //         System.out.println("Hello");
//     //         try {
//     //             Thread.sleep(2);
//     //         } catch (InterruptedException e) {
//     //             System.out.println("hmmmm");
//     //         }
//     //     }
//     // }
// }

public class practice1 {
    public static void main(String[] args) {

        // Using Lambda Expression
        Runnable obj1 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable obj2 = () ->
        {
            for (int i=0; i<10; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        // runnable not have thread methods so we have to create it
        Thread a = new Thread(obj1);
        Thread b = new Thread(obj2);
        a.start();
        b.start();
    }
}
