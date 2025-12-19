 package StreamApi;

import java.lang.Runnable;
//to create a thread we have Runnable interface
//so runnable is functional interface it has only one abstract method run()
//class Example implements Runnable {
//    public void run() {
//        System.out.println("Hello");
//    }
//}

 @FunctionalInterface
 interface MathOperation {
     int operate(int a, int b);
     //jo bhi class MathOperation implement karegi, usko operate method likhna hi padega."
 }
 class sumOperation implements MathOperation {
     public int operate(int a , int b) {
         try {
             return a+b;
         } catch (ArithmeticException e) {
             throw new RuntimeException(e);
         }
     }
 }

 class SubOperation implements MathOperation {
     public int operate(int a , int b) {
         return a-b;
     }
 }

 public class Basic {
    public static void main(String[] args) {
        //Lambda expression
        //lanbda expression is an anonymous function (no name, no return type, no modifier)
        //lambda expression is used to implement functional interface(it has only one absract method)

        Thread t1 = new Thread(() -> {
               System.out.println("Hello");
        });
        t1.start();

        MathOperation op = new sumOperation();
        System.out.println("Addition: " + op.operate(10,10));

        // as we have functional interface so lets use lambda expression to make code more easy and short

        MathOperation op1 = new SubOperation();
        System.out.println("Subtraction: " + op1.operate(10,10));

        //instead of writing this much code lets shorterized it

        op = ((int a , int b) -> a*b);
        System.out.println("Multiplication: "+op.operate(10,10));
        MathOperation divOperation = ((int a , int b) -> (b!=0) ? (a/b) : 0);
        System.out.println("Division: "+ divOperation.operate(10,10));


        MathOperation add = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;
        MathOperation mul = (a, b) -> a * b;
        MathOperation div = (a, b) -> (b != 0) ? (a / b) : 0;

        System.out.println("Addition: " + add.operate(10, 10));
        System.out.println("Subtraction: " + sub.operate(10, 10));
        System.out.println("Multiplication: " + mul.operate(10, 10));
        System.out.println("Division: " + div.operate(10, 10));
    }
}
