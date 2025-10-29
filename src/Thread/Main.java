// // package Thread;


// class A extends Thread
// {
//     public void run(){
//         for (int i=1; i<=1000; i++) {
//             System.out.println("Hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B extends Thread
// {
//     public void run(){
//         for (int i=1; i<=1000; i++) {
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {e.printStackTrace();
//             }
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // here we have two threads obj and obj1
//         A obj = new A();
//         B obj1 = new B();

//         // obj1.setPriority(Thread.MAX_PRIORITY);

//         // System.out.println(obj.getPriority());

//         obj.start();
//         try {
//             Thread.sleep(2);
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//         obj1.start();
//     }
// }
