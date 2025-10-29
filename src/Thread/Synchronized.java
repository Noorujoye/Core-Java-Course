
class Counter {
    private int count = 0;
    public synchronized void increment() { // increament marked as synchronized means on thread can execute this method at a time
        //without synchronized two threads might read the same value and overwrite each other -> RaceCondition
        count++;
        System.out.println(count); // critical section
    }
    public int getCount() {
        return count;
    }
}
public class Synchronized {
    public static void main(String[] args) {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i=0; i<1000; i++) c.increment();
        });
        Thread t2 = new Thread(() -> {
            for (int i=0; i<1000; i++) c.increment();
        });

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("final count" + c.getCount());
    }
    
}
