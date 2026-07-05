package Multithreading.leetcode;


public class ZeroOddEven {
    private enum Turn {
        ZERO, EVEN, ODD
    }

    public Turn turn = Turn.ZERO;
    private final int n;

    public ZeroOddEven(int n) {
        this.n = n;
    }

    public synchronized void zero() throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            while (turn != turn.ZERO) {
                wait();
            }
            System.out.print(0);
            turn = i % 2 == 0 ? Turn.EVEN : Turn.ODD;
            notifyAll();
        }
    }

    public synchronized void even() throws InterruptedException {
        for (int i = 2; i <= n; i += 2) {
            while (turn != turn.EVEN) {
                wait();
            }
            System.out.print(i);
            turn = Turn.ZERO;
            notifyAll();
        }
    }

    public synchronized void odd() throws InterruptedException {
        for (int i = 1; i <= n; i += 2) {
            while (turn != turn.ODD) {
                wait();
            }
            System.out.print(i);
            turn = Turn.ZERO;
            notifyAll();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ZeroOddEven z = new ZeroOddEven(5);
        Thread t1 = new Thread(
                () -> {
                    try {
                        z.zero();
                    } catch (InterruptedException e) {
                        System.out.println("zero not printed");
                    }
                }
        );
        Thread t2 = new Thread(
                () -> {
                    try {
                        z.odd();
                    } catch (InterruptedException e) {
                        System.out.println("odd not printed");
                    }
                }
        );
        Thread t3 = new Thread(
                () -> {
                    try {
                        z.even();
                    } catch (InterruptedException e) {
                        System.out.println("even not printed");
                    }
                }
        );

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();

        System.out.println("\ncomplete...");
    }
}
