package Thread;

import java.lang.Runnable;
class FibonacciTask implements Runnable {
    private int n;

    // constructor
    public FibonacciTask(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        System.out.println("Fibonacci Series up to " + n + " terms:");
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(); // line break
    }
}

class FactorialTask implements Runnable {
    private int n;

    // constructor
    public FactorialTask(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        System.out.println("Factorial of " + n + ":");
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}

public class FibonacciAndFactorial {
    public static void main(String[] args) {
        int n = 5;

        // Runnable objects
        Runnable fibTask = new FibonacciTask(n);
        Runnable factTask = new FactorialTask(n);

        // Threads
        Thread t1 = new Thread(fibTask);
        Thread t2 = new Thread(factTask);

        // Start threads
        t1.start();
        t2.start();
    }
}
